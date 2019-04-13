package typings
package bignumLib.bignumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bignum", JSImport.Namespace)
@js.native
class ^ protected () extends BigNum {
  def this(n: BigNum) = this()
  /** Create a new BigNum from n and a base. */
  def this(n: java.lang.String) = this()
  /** Create a new BigNum from n. */
  def this(n: scala.Double) = this()
  def this(n: java.lang.String, base: scala.Double) = this()
}

@JSImport("bignum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abs(n: BigNumCompatible): BigNum = js.native
  def add(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def and(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def bitLength(n: BigNumCompatible): scala.Double = js.native
  def cmp(left: BigNumCompatible, right: BigNumCompatible): scala.Double = js.native
  def div(dividend: BigNumCompatible, divisor: BigNumCompatible): BigNum = js.native
  def eq(left: BigNumCompatible, right: BigNumCompatible): scala.Boolean = js.native
  /**
    * Create a new BigNum from a Buffer.
    * 
    * The default options are: {endian: 'big', size: 1}.
    */
  def fromBuffer(buffer: nodeLib.Buffer): BigNum = js.native
  def fromBuffer(buffer: nodeLib.Buffer, options: BufferOptions): BigNum = js.native
  def gcd(left: BigNumCompatible, right: BigNum): BigNum = js.native
  def ge(left: BigNumCompatible, right: BigNumCompatible): scala.Boolean = js.native
  def gt(left: BigNumCompatible, right: BigNumCompatible): scala.Boolean = js.native
  def invertm(n: BigNumCompatible, m: BigNumCompatible): BigNum = js.native
  /** Return true if num is identified as a BigNum instance. Otherwise, return false. */
  def isBigNum(num: js.Any): scala.Boolean = js.native
  def jacobi(a: BigNumCompatible, n: BigNum): scala.Double = js.native
  def le(left: BigNumCompatible, right: BigNumCompatible): scala.Boolean = js.native
  def lt(left: BigNumCompatible, right: BigNumCompatible): scala.Boolean = js.native
  def mod(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def mul(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def neg(n: BigNumCompatible): BigNum = js.native
  def or(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def pow(base: BigNumCompatible, exponent: BigNumCompatible): BigNum = js.native
  def powm(base: BigNumCompatible, exponent: BigNumCompatible, m: BigNumCompatible): BigNum = js.native
  /**
    * Generate a probable prime of length bits.
    * 
    * If safe is true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime.
    */
  def prime(bits: scala.Double): BigNum = js.native
  def prime(bits: scala.Double, safe: scala.Boolean): BigNum = js.native
  def probPrime(n: BigNumCompatible): scala.Boolean | java.lang.String = js.native
  def rand(n: BigNumCompatible): BigNum = js.native
  def rand(n: BigNumCompatible, upperBound: BigNumCompatible): BigNum = js.native
  def shiftLeft(n: BigNumCompatible, bits: BigNumCompatible): BigNum = js.native
  def shiftRight(n: BigNumCompatible, bits: BigNumCompatible): BigNum = js.native
  def sub(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def toBuffer(n: BigNumCompatible): nodeLib.Buffer = js.native
  def toBuffer(n: BigNumCompatible, options: BufferOptions): nodeLib.Buffer = js.native
  def toNumber(n: BigNumCompatible): scala.Double = js.native
  def xor(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
}

