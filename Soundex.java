import java.io.*;
public class Soundex { 
    public String HinToEn(String s)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            switch (s.charAt(i)) {
                case 'क':
                    s1+="k";
                    break;
                case 'ख':
                    s1+="kh";
                    break;
                case 'ग':
                    s1+="ga";
                    break;
                case 'घ':
                    s1+="gha";
                    break;
                case 'ङ':
                    s1+="nga";
                    break;
                case 'च':
                    s1+="c";
                    break;
                case 'छ':
                    s1+="chh";
                    break;
                case 'ज':
                    s1+="j";
                    break;
                case 'झ':
                    s1+="jh";
                    break;
                case 'ञ':
                    s1+="nya";
                    break;
                case 'ट':
                    s1+="Ta";
                    break;
                case 'ठ':
                    s1+="TTah";
                    break;
                case 'ड':
                    s1+="D";
                    break;
                case 'ढ':
                    s1+="Dh";
                    break;
                case 'ण':
                    s1+="N";
                    break;
                case 'त':
                    s1+="t";
                    break;
                case 'थ':
                    s1+="th";
                    break;
                case 'द':
                    s1+="d";
                    break;
                case 'ध':
                    s1+="dh";
                    break;
                case 'न':
                    s1+="n";
                    break;
                case 'प':
                    s1+="p";
                    break;
                case 'फ':
                    s1+="f";
                    break;
                case 'ब':
                    s1+="ba";
                    break;
                case 'भ':
                    s1+="hbh";
                    break;
                case 'म':
                    s1+="ma";
                    break;
                /*case 'य':
                    s1+="y";
                    break;*/
                case 'र':
                    s1+="r";
                    break;
                case 'ल':
                    s1+="l";
                    break;
                case 'व':
                    s1+="va";
                    break;
                case 'ह':
                    s1+="h";
                    break;
                case 'श':
                    s1+="sha";
                    break;
                case 'ष':
                    s1+="sh";
                    break;
                case 'स':
                    s1+="s";
                    break;
                case 'ा':
                    s1+="a";
                    break;
                case 'ि':
                    s1+="t";
                    break;
                case 'ी':
                    s1+="t";
                    break;
                case 'ु':
                    s1+="u";
                    break;
                case 'ू':
                    s1+="u";
                    break;
                case 'ृ':
                    s1+="r";
                    break;
                case 'े':
                    s1+="e";
                    break;
                case 'ै':
                    s1+="i";
                    break;
                case 'ो':
                    s1+="o";
                    break;
                case 'ौ':
                    s1+="au";
                    break;
                case 'ं':
                    s1+="n";
                    break;
                case 'ः':
                    s1+="aha";
                    break;
                case 'अ':
                    s1+="a";
                    break;
                case 'आ':
                    s1+="aa";
                    break;
                case 'इ':
                    s1+="e";
                    break;
                case 'ई':
                    s1+="i";
                    break;
                case 'उ':
                    s1+="u";
                    break;
                case 'ऊ':
                    s1+="oo";
                    break;
                case 'ऋ':
                    s1+="ri";
                    break;
                case 'ए':
                    s1+="y";
                    break;
                case 'ऐ':
                    s1+="y";
                    break;
                case 'ओ':
                    s1+="o";
                    break;
                case 'औ':
                    s1+="au";
                    break;
                //case 'ँ':
                    //s1+="n";
                   // break;
                case '\u094d':
                    s1+="tr";
                    break;
                default:
                    break;
            }
        }
        return s1;
    }
    public char Convert(char x)
    {
        switch (x) {

                case 'B':
                case 'F':
                case 'P':
                case 'V':
//                case 'ब':
//                case 'भ':
//                case 'फ':
//                case 'प':
//                case 'व':
                    x = '1';
                    break;

                case 'C':
                case 'G':
                case 'J':
                case 'K':
                case 'Q':
                case 'S':
                case 'X':
                case 'Z':
//                case 'क':
//                case 'ग':
//                case 'ख':
//                case 'घ':
//                case 'ज':
//                case 'झ':
//                case 'श':
//                case 'ष':
//                case 'स':
//                case 'च':
//                case 'छ':
                    x = '2';
                    break;

                case 'D':
                case 'T':
//                case 'ड':
//                case 'ढ':
//                case 'ट':
//                case 'ठ':
//                case 'द':
//                case 'ध':
//                case 'थ':
//                case 'त'://System.out.println("Tha");
                    x = '3';
                    break;

                case 'L':
//                case 'ल':
                    x = '4';
                    break;

                case 'M':
                case 'N':
//                case 'न':
//                case 'म':
                    x = '5';
                    break;

                case 'R':
//                case 'र':
//                case 'ऋ':
                    x = '6';
                    break;

                default:
                    x = '0';
                    break;
            }
        return x;
    }
    public String soundex( char[] x) { 
 for(int i=0;i<x.length;i++)
 {
     x[i]=Convert(x[i]);
 }
 String output="";
 for(int i=0;i<x.length;i++)
 {
     output+=x[i];
 }
output+="0000";
//System.out.println(output.substring(0,4));
 return output.substring(0,4);
    }
	static boolean isEng(char x)
	{
		int v=(int)x;
		if((v>=65 &&v<=90)||(v>=97&&v<=122))
			return true;
		return false;
	}
    
    public static void main(String args[])
    {
        String filename="input.txt";
        String line=null;
        Soundex s=new Soundex();
        int flag=0;
        LCS l=new LCS();
        try{
            FileReader f=new FileReader(filename);
            BufferedReader b=new BufferedReader(f);
		float var=0;
	FileWriter w=new FileWriter("output.txt");
            while((line=b.readLine())!=null)
            {
                flag=0;
                String[] arr=line.split("\t");
		String w1=arr[0];
		String w2=arr[1];
		String w3=arr[2];
		char[] y;
		char[] x=s.HinToEn(w1).toUpperCase().toCharArray();
		if(!isEng(w2.charAt(0)))
                	y=s.HinToEn(w2).toUpperCase().toCharArray();
		else
			y=w2.toUpperCase().toCharArray();
                //System.out.println("x:"+s.soundex(x)+" y:"+s.soundex(y));
                if(s.soundex(x).equals(s.soundex(y)))
                    flag=1;
                /*else
                {
                    int len=l.lcs(x, y, x.length, y.length);
                    if(Math.abs(x.length-y.length)<=2)
                    {
                        if((Math.abs(len-x.length)<=2)||(Math.abs(len-y.length)<=2))
                            flag=1;
                    }
                }*/
                s.soundex(x);s.soundex(y);
                //System.out.print(flag);
                
                String wr=arr[0]+"\t"+arr[1]+"\t"+flag+"\n";
		if(flag==((int)arr[2].charAt(0)-48))
			var+=1;
                //System.out.println(wr);
                w.write(wr);
            }
		System.out.println("Accuracy:"+(var/50));
		w.close();
    }
        catch(Exception e)
        {
            System.out.println("File not found!");
        }
    }
}
/*class LCS
{
 
  int lcs( char[] X, char[] Y, int m, int n )
  {
    if (m == 0 || n == 0)
      return 0;
    if (X[m-1] == Y[n-1])
      return 1 + lcs(X, Y, m-1, n-1);
    else
      return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
  }
  int max(int a, int b)
  {
    return (a > b)? a : b;
  }
}*/
