package typings.bignum.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * Create a new BigNum from a Buffer.
    * 
    * The default options are: {endian: 'big', size: 1}.
    */
  def fromBuffer(buffer: Buffer): BigNum = js.native
  def fromBuffer(buffer: Buffer, options: BufferOptions): BigNum = js.native
  
  /** Return true if num is identified as a BigNum instance. Otherwise, return false. */
  def isBigNum(num: js.Any): Boolean = js.native
  
  /**
    * Generate a probable prime of length bits.
    * 
    * If safe is true, it will be a "safe" prime of the form p=2p'+1 where p' is also prime.
    */
  def prime(bits: Double): BigNum = js.native
  def prime(bits: Double, safe: Boolean): BigNum = js.native
}
