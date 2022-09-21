package typings.bignum

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bignum", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BigNum {
    /** Create a new BigNum from n and a base. */
    def this(n: String) = this()
    /** Create a new BigNum from n. */
    def this(n: Double) = this()
    def this(n: BigNum) = this()
    def this(n: String, base: Double) = this()
  }
  @JSImport("bignum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abs(n: BigNumCompatible): BigNum = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(n.asInstanceOf[js.Any]).asInstanceOf[BigNum]
  
  inline def add(left: BigNumCompatible, right: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def and(left: BigNumCompatible, right: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def bitLength(n: BigNumCompatible): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bitLength")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def cmp(left: BigNumCompatible, right: BigNumCompatible): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def div(dividend: BigNumCompatible, divisor: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(dividend.asInstanceOf[js.Any], divisor.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def eq_(left: BigNumCompatible, right: BigNumCompatible): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Create a new BigNum from a Buffer.
    * 
    * The default options are: {endian: 'big', size: 1}.
    */
  /* static member */
  inline def fromBuffer(buffer: Buffer): BigNum = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[BigNum]
  inline def fromBuffer(buffer: Buffer, options: BufferOptions): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def gcd(left: BigNumCompatible, right: BigNum): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("gcd")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def ge(left: BigNumCompatible, right: BigNumCompatible): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ge")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gt(left: BigNumCompatible, right: BigNumCompatible): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def invertm(n: BigNumCompatible, m: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("invertm")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  /** Return true if num is identified as a BigNum instance. Otherwise, return false. */
  /* static member */
  inline def isBigNum(num: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigNum")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def jacobi(a: BigNumCompatible, n: BigNum): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jacobi")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def le(left: BigNumCompatible, right: BigNumCompatible): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("le")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lt(left: BigNumCompatible, right: BigNumCompatible): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mod(left: BigNumCompatible, right: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def mul(left: BigNumCompatible, right: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def neg(n: BigNumCompatible): BigNum = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(n.asInstanceOf[js.Any]).asInstanceOf[BigNum]
  
  inline def or(left: BigNumCompatible, right: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def pow(base: BigNumCompatible, exponent: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def powm(base: BigNumCompatible, exponent: BigNumCompatible, m: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("powm")(base.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  /**
    * Generate a probable prime of length bits.
    * 
    * If safe is true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime.
    */
  /* static member */
  inline def prime(bits: Double): BigNum = ^.asInstanceOf[js.Dynamic].applyDynamic("prime")(bits.asInstanceOf[js.Any]).asInstanceOf[BigNum]
  inline def prime(bits: Double, safe: Boolean): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("prime")(bits.asInstanceOf[js.Any], safe.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def probPrime(n: BigNumCompatible): Boolean | String = ^.asInstanceOf[js.Dynamic].applyDynamic("probPrime")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean | String]
  
  inline def rand(n: BigNumCompatible): BigNum = ^.asInstanceOf[js.Dynamic].applyDynamic("rand")(n.asInstanceOf[js.Any]).asInstanceOf[BigNum]
  inline def rand(n: BigNumCompatible, upperBound: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("rand")(n.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def shiftLeft(n: BigNumCompatible, bits: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftLeft")(n.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def shiftRight(n: BigNumCompatible, bits: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftRight")(n.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def sub(left: BigNumCompatible, right: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  inline def toBuffer(n: BigNumCompatible): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(n.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def toBuffer(n: BigNumCompatible, options: BufferOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(n.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def toNumber(n: BigNumCompatible): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def xor(left: BigNumCompatible, right: BigNumCompatible): BigNum = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[BigNum]
  
  @js.native
  trait BigNum extends StObject {
    
    /** Return a new BigNum with the absolute value of the instance. */
    def abs(): BigNum = js.native
    
    /** Return a new BigNum containing the instance value plus n. */
    def add(n: BigNumCompatible): BigNum = js.native
    
    /** Return a new BigNum with the instance value bitwise AND (&)-ed with n. */
    def and(n: BigNumCompatible): BigNum = js.native
    
    /** Return the number of bits used to represent the current BigNum. */
    def bitLength(): Double = js.native
    
    /**
      * Compare the instance value to n.
      * 
      * Return a positive integer if > n, a negative integer if < n, and 0 if == n.
      */
    def cmp(n: BigNumCompatible): Double = js.native
    
    /** Return a new BigNum containing the instance value integrally divided by n. */
    def div(n: BigNumCompatible): BigNum = js.native
    
    /** Return the greatest common divisor of the current BigNum with n as a new BigNum. */
    def gcd(n: BigNum): BigNum = js.native
    
    /** Return a boolean: whether the instance value is greater than or equal to n (>= n). */
    def ge(n: BigNumCompatible): Boolean = js.native
    
    /** Return a boolean: whether the instance value is greater than n (> n). */
    def gt(n: BigNumCompatible): Boolean = js.native
    
    /** Compute the multiplicative inverse modulo m. */
    def invertm(m: BigNumCompatible): BigNum = js.native
    
    /**
      * Return the Jacobi symbol (or Legendre symbol if n is prime) of the current BigNum (= a) over n.
      * Note that n must be odd and >= 3. 0 <= a < n.
      * 
      * Returns -1 or 1 as an int (NOT a BigNum). Throws an error on failure.
      */
    def jacobi(n: BigNum): Double = js.native
    
    /** Return a boolean: whether the instance value is less than or equal to n (<= n). */
    def le(n: BigNumCompatible): Boolean = js.native
    
    /** Return a boolean: whether the instance value is less than n (< n). */
    def lt(n: BigNumCompatible): Boolean = js.native
    
    /** Return a new BigNum with the instance value modulo n. */
    def mod(n: BigNumCompatible): BigNum = js.native
    
    /** Return a new BigNum containing the instance value multiplied by n. */
    def mul(n: BigNumCompatible): BigNum = js.native
    
    /** Return a new BigNum with the negative of the instance value. */
    def neg(): BigNum = js.native
    
    /** Return a new BigNum with the instance value bitwise inclusive-OR (|)-ed with n. */
    def or(n: BigNumCompatible): BigNum = js.native
    
    /** Return a new BigNum with the instance value raised to the nth power. */
    def pow(n: BigNumCompatible): BigNum = js.native
    
    /** Return a new BigNum with the instance value raised to the nth power modulo m. */
    def powm(n: BigNumCompatible, m: BigNumCompatible): BigNum = js.native
    
    /** 
      * Return whether the BigNum is:
      *  - certainly prime (true)
      *  - probably prime ('maybe')
      *  - certainly composite (false)
      */
    def probPrime(): Boolean | String = js.native
    
    /**
      * If upperBound is supplied, return a random BigNum between the instance value and upperBound - 1, inclusive.
      * Otherwise, return a random BigNum between 0 and the instance value - 1, inclusive.
      */
    def rand(): BigNum = js.native
    def rand(upperBound: BigNumCompatible): BigNum = js.native
    
    /** Return a new BigNum that is the 2^n multiple. Equivalent of the << operator. */
    def shiftLeft(n: BigNumCompatible): BigNum = js.native
    
    /** Return a new BigNum of the value integer divided by 2^n. Equivalent of the >> operator. */
    def shiftRight(n: BigNumCompatible): BigNum = js.native
    
    /** Return a new BigNum containing the instance value minus n. */
    def sub(n: BigNumCompatible): BigNum = js.native
    
    /**
      * Return a new Buffer with the data from the BigNum.
      * 
      * The default options are: {endian: 'big', size: 1}.
      */
    def toBuffer(): Buffer = js.native
    def toBuffer(options: BufferOptions): Buffer = js.native
    
    /**
      * Turn a BigNum into a Number.
      * 
      * If the BigNum is too big you'll lose precision or you'll get ±Infinity.
      */
    def toNumber(): Double = js.native
    
    def toString(base: Double): String = js.native
    
    /** Return a new BigNum with the instance value bitwise exclusive-OR (^)-ed with n. */
    def xor(n: BigNumCompatible): BigNum = js.native
  }
  
  /** Anything that can be converted to BigNum. */
  type BigNumCompatible = BigNum | Double | String
  
  trait BufferOptions extends StObject {
    
    /** Can be either 'big' or 'little'. Also accepts 1 for big and -1 for little. Doesn't matter when size = 1. */
    var endian: String | Double
    
    /** Number of bytes per word, or 'auto' to flip entire Buffer. */
    var size: Double | String
  }
  object BufferOptions {
    
    inline def apply(endian: String | Double, size: Double | String): BufferOptions = {
      val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferOptions]
    }
    
    extension [Self <: BufferOptions](x: Self) {
      
      inline def setEndian(value: String | Double): Self = StObject.set(x, "endian", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
