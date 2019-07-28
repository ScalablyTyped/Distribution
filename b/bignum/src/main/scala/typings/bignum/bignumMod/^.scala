package typings.bignum.bignumMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSImport("bignum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def abs(n: BigNumCompatible): BigNum = js.native
  def add(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def and(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def bitLength(n: BigNumCompatible): Double = js.native
  def cmp(left: BigNumCompatible, right: BigNumCompatible): Double = js.native
  def div(dividend: BigNumCompatible, divisor: BigNumCompatible): BigNum = js.native
  def eq(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  /**
    * Create a new BigNum from a Buffer.
    * 
    * The default options are: {endian: 'big', size: 1}.
    */
  def fromBuffer(buffer: Buffer): BigNum = js.native
  def fromBuffer(buffer: Buffer, options: BufferOptions): BigNum = js.native
  def gcd(left: BigNumCompatible, right: BigNum): BigNum = js.native
  def ge(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  def gt(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  def invertm(n: BigNumCompatible, m: BigNumCompatible): BigNum = js.native
  /** Return true if num is identified as a BigNum instance. Otherwise, return false. */
  def isBigNum(num: js.Any): Boolean = js.native
  def jacobi(a: BigNumCompatible, n: BigNum): Double = js.native
  def le(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
  def lt(left: BigNumCompatible, right: BigNumCompatible): Boolean = js.native
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
  def prime(bits: Double): BigNum = js.native
  def prime(bits: Double, safe: Boolean): BigNum = js.native
  def probPrime(n: BigNumCompatible): Boolean | String = js.native
  def rand(n: BigNumCompatible): BigNum = js.native
  def rand(n: BigNumCompatible, upperBound: BigNumCompatible): BigNum = js.native
  def shiftLeft(n: BigNumCompatible, bits: BigNumCompatible): BigNum = js.native
  def shiftRight(n: BigNumCompatible, bits: BigNumCompatible): BigNum = js.native
  def sub(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
  def toBuffer(n: BigNumCompatible): Buffer = js.native
  def toBuffer(n: BigNumCompatible, options: BufferOptions): Buffer = js.native
  def toNumber(n: BigNumCompatible): Double = js.native
  def xor(left: BigNumCompatible, right: BigNumCompatible): BigNum = js.native
}

