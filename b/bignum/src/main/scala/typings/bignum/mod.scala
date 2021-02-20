package typings.bignum

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bignum", JSImport.Namespace)
  @js.native
  class ^ protected () extends BigNum {
    /** Create a new BigNum from n and a base. */
    def this(n: String) = this()
    /** Create a new BigNum from n. */
    def this(n: Double) = this()
    def this(n: BigNum) = this()
    def this(n: String, base: Double) = this()
  }
  
  @JSImport("bignum", "abs")
  @js.native
  def abs(n: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "add")
  @js.native
  def add(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "and")
  @js.native
  def and(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "bitLength")
  @js.native
  def bitLength(n: BigNumCompatible): Double = js.native
  
  @JSImport("bignum", "cmp")
  @js.native
  def cmp(left: BigNumCompatible, right: BigNumCompatible): Double = js.native
  
  @JSImport("bignum", "div")
  @js.native
  def div(dividend: BigNumCompatible, divisor: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "eq")
  @js.native
  def eq_(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  
  /**
    * Create a new BigNum from a Buffer.
    * 
    * The default options are: {endian: 'big', size: 1}.
    */
  /* static member */
  @JSImport("bignum", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): BigNum = js.native
  @JSImport("bignum", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer, options: BufferOptions): BigNum = js.native
  
  @JSImport("bignum", "gcd")
  @js.native
  def gcd(left: BigNumCompatible, right: BigNum): BigNum = js.native
  
  @JSImport("bignum", "ge")
  @js.native
  def ge(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  
  @JSImport("bignum", "gt")
  @js.native
  def gt(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  
  @JSImport("bignum", "invertm")
  @js.native
  def invertm(n: BigNumCompatible, m: BigNumCompatible): BigNum = js.native
  
  /** Return true if num is identified as a BigNum instance. Otherwise, return false. */
  /* static member */
  @JSImport("bignum", "isBigNum")
  @js.native
  def isBigNum(num: js.Any): Boolean = js.native
  
  @JSImport("bignum", "jacobi")
  @js.native
  def jacobi(a: BigNumCompatible, n: BigNum): Double = js.native
  
  @JSImport("bignum", "le")
  @js.native
  def le(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  
  @JSImport("bignum", "lt")
  @js.native
  def lt(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  
  @JSImport("bignum", "mod")
  @js.native
  def mod(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "mul")
  @js.native
  def mul(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "neg")
  @js.native
  def neg(n: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "or")
  @js.native
  def or(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "pow")
  @js.native
  def pow(base: BigNumCompatible, exponent: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "powm")
  @js.native
  def powm(base: BigNumCompatible, exponent: BigNumCompatible, m: BigNumCompatible): BigNum = js.native
  
  /**
    * Generate a probable prime of length bits.
    * 
    * If safe is true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime.
    */
  /* static member */
  @JSImport("bignum", "prime")
  @js.native
  def prime(bits: Double): BigNum = js.native
  @JSImport("bignum", "prime")
  @js.native
  def prime(bits: Double, safe: Boolean): BigNum = js.native
  
  @JSImport("bignum", "probPrime")
  @js.native
  def probPrime(n: BigNumCompatible): Boolean | String = js.native
  
  @JSImport("bignum", "rand")
  @js.native
  def rand(n: BigNumCompatible): BigNum = js.native
  @JSImport("bignum", "rand")
  @js.native
  def rand(n: BigNumCompatible, upperBound: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "shiftLeft")
  @js.native
  def shiftLeft(n: BigNumCompatible, bits: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "shiftRight")
  @js.native
  def shiftRight(n: BigNumCompatible, bits: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "sub")
  @js.native
  def sub(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  
  @JSImport("bignum", "toBuffer")
  @js.native
  def toBuffer(n: BigNumCompatible): Buffer = js.native
  @JSImport("bignum", "toBuffer")
  @js.native
  def toBuffer(n: BigNumCompatible, options: BufferOptions): Buffer = js.native
  
  @JSImport("bignum", "toNumber")
  @js.native
  def toNumber(n: BigNumCompatible): Double = js.native
  
  @JSImport("bignum", "xor")
  @js.native
  def xor(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  
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
    
    /** Return a boolean: whether the instance value is equal to n (== n). */
    def eq(n: BigNumCompatible): Boolean = js.native
    
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
  
  @js.native
  trait BufferOptions extends StObject {
    
    /** Can be either 'big' or 'little'. Also accepts 1 for big and -1 for little. Doesn't matter when size = 1. */
    var endian: String | Double = js.native
    
    /** Number of bytes per word, or 'auto' to flip entire Buffer. */
    var size: Double | String = js.native
  }
  object BufferOptions {
    
    @scala.inline
    def apply(endian: String | Double, size: Double | String): BufferOptions = {
      val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferOptions]
    }
    
    @scala.inline
    implicit class BufferOptionsMutableBuilder[Self <: BufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndian(value: String | Double): Self = StObject.set(x, "endian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
