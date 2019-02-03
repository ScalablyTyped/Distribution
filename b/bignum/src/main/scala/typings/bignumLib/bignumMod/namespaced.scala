package typings
package bignumLib.bignumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bignum", JSImport.Namespace)
@js.native
class namespaced protected () extends BigNum {
  def this(n: BigNum) = this()
  /** Create a new BigNum from n and a base. */
  def this(n: java.lang.String) = this()
  /** Create a new BigNum from n. */
  def this(n: scala.Double) = this()
  def this(n: java.lang.String, base: scala.Double) = this()
}

/* static members */
@JSImport("bignum", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * Create a new BigNum from a Buffer.
    * 
    * The default options are: {endian: 'big', size: 1}.
    */
  def fromBuffer(buffer: nodeLib.Buffer): bignumLib.bignumMod.BigNum = js.native
  def fromBuffer(buffer: nodeLib.Buffer, options: bignumLib.bignumMod.BigNumNs.BufferOptions): bignumLib.bignumMod.BigNum = js.native
  /** Return true if num is identified as a BigNum instance. Otherwise, return false. */
  def isBigNum(num: js.Any): scala.Boolean = js.native
  /**
    * Generate a probable prime of length bits.
    * 
    * If safe is true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime.
    */
  def prime(bits: scala.Double): bignumLib.bignumMod.BigNum = js.native
  def prime(bits: scala.Double, safe: scala.Boolean): bignumLib.bignumMod.BigNum = js.native
}

