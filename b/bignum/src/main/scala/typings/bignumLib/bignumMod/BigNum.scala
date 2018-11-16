package typings
package bignumLib.bignumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigNum extends js.Object {
  /** Return a new BigNum with the absolute value of the instance. */
  def abs(): BigNum = js.native
  /** Return a new BigNum containing the instance value plus n. */
  def add(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a new BigNum with the instance value bitwise AND (&)-ed with n. */
  def and(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return the number of bits used to represent the current BigNum. */
  def bitLength(): scala.Double = js.native
  /**
       * Compare the instance value to n.
       * 
       * Return a positive integer if > n, a negative integer if < n, and 0 if == n.
       */
  def cmp(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Double = js.native
  /** Return a new BigNum containing the instance value integrally divided by n. */
  def div(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a boolean: whether the instance value is equal to n (== n). */
  def eq(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Boolean = js.native
  /** Return the greatest common divisor of the current BigNum with n as a new BigNum. */
  def gcd(n: BigNum): BigNum = js.native
  /** Return a boolean: whether the instance value is greater than or equal to n (>= n). */
  def ge(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Boolean = js.native
  /** Return a boolean: whether the instance value is greater than n (> n). */
  def gt(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Boolean = js.native
  /** Compute the multiplicative inverse modulo m. */
  def invertm(m: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /**
       * Return the Jacobi symbol (or Legendre symbol if n is prime) of the current BigNum (= a) over n.
       * Note that n must be odd and >= 3. 0 <= a < n.
       * 
       * Returns -1 or 1 as an int (NOT a BigNum). Throws an error on failure.
       */
  def jacobi(n: BigNum): scala.Double = js.native
  /** Return a boolean: whether the instance value is less than or equal to n (<= n). */
  def le(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Boolean = js.native
  /** Return a boolean: whether the instance value is less than n (< n). */
  def lt(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): scala.Boolean = js.native
  /** Return a new BigNum with the instance value modulo n. */
  def mod(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a new BigNum containing the instance value multiplied by n. */
  def mul(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a new BigNum with the negative of the instance value. */
  def neg(): BigNum = js.native
  /** Return a new BigNum with the instance value bitwise inclusive-OR (|)-ed with n. */
  def or(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a new BigNum with the instance value raised to the nth power. */
  def pow(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a new BigNum with the instance value raised to the nth power modulo m. */
  def powm(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible, m: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** 
       * Return whether the BigNum is:
       *  - certainly prime (true)
       *  - probably prime ('maybe')
       *  - certainly composite (false)
       */
  def probPrime(): scala.Boolean | java.lang.String = js.native
  /**
       * If upperBound is supplied, return a random BigNum between the instance value and upperBound - 1, inclusive.
       * Otherwise, return a random BigNum between 0 and the instance value - 1, inclusive.
       */
  def rand(): BigNum = js.native
  /**
       * If upperBound is supplied, return a random BigNum between the instance value and upperBound - 1, inclusive.
       * Otherwise, return a random BigNum between 0 and the instance value - 1, inclusive.
       */
  def rand(upperBound: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a new BigNum that is the 2^n multiple. Equivalent of the << operator. */
  def shiftLeft(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a new BigNum of the value integer divided by 2^n. Equivalent of the >> operator. */
  def shiftRight(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /** Return a new BigNum containing the instance value minus n. */
  def sub(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
  /**
      * Return a new Buffer with the data from the BigNum.
      * 
      * The default options are: {endian: 'big', size: 1}.
      */
  def toBuffer(): nodeLib.Buffer = js.native
  /**
      * Return a new Buffer with the data from the BigNum.
      * 
      * The default options are: {endian: 'big', size: 1}.
      */
  def toBuffer(options: bignumLib.bignumMod.BigNumNs.BufferOptions): nodeLib.Buffer = js.native
  /**
       * Turn a BigNum into a Number.
       * 
       * If the BigNum is too big you'll lose precision or you'll get ±Infinity.
       */
  def toNumber(): scala.Double = js.native
  /** Print out the BigNum instance in the requested base as a string. Default: base 10 */
  def toString(base: scala.Double): java.lang.String = js.native
  /** Return a new BigNum with the instance value bitwise exclusive-OR (^)-ed with n. */
  def xor(n: bignumLib.bignumMod.BigNumNs.BigNumCompatible): BigNum = js.native
}

