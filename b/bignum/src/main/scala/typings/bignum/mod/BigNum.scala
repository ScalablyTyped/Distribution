package typings.bignum.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigNum extends js.Object {
  
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
