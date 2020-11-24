package typings.bnJs.mod

import typings.bnJs.bnJsStrings.hex
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bn.js", JSImport.Namespace)
@js.native
class ^ protected () extends BN {
  def this(number: String) = this()
  def this(number: js.Array[Double]) = this()
  def this(number: Double) = this()
  def this(number: BN) = this()
  def this(number: Buffer) = this()
  def this(number: Uint8Array) = this()
  def this(number: String, base: Double) = this()
  def this(number: String, base: hex) = this()
  def this(number: String, endian: Endianness) = this()
  def this(number: js.Array[Double], base: Double) = this()
  def this(number: js.Array[Double], base: hex) = this()
  def this(number: js.Array[Double], endian: Endianness) = this()
  def this(number: Double, base: Double) = this()
  def this(number: Double, base: hex) = this()
  def this(number: Double, endian: Endianness) = this()
  def this(number: BN, base: Double) = this()
  def this(number: BN, base: hex) = this()
  def this(number: BN, endian: Endianness) = this()
  def this(number: Buffer, base: Double) = this()
  def this(number: Buffer, base: hex) = this()
  def this(number: Buffer, endian: Endianness) = this()
  def this(number: Uint8Array, base: Double) = this()
  def this(number: Uint8Array, base: hex) = this()
  def this(number: Uint8Array, endian: Endianness) = this()
  def this(number: String, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
  def this(number: String, base: Double, endian: Endianness) = this()
  def this(number: String, base: hex, endian: Endianness) = this()
  def this(number: js.Array[Double], base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
  def this(number: js.Array[Double], base: Double, endian: Endianness) = this()
  def this(number: js.Array[Double], base: hex, endian: Endianness) = this()
  def this(number: Double, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
  def this(number: Double, base: Double, endian: Endianness) = this()
  def this(number: Double, base: hex, endian: Endianness) = this()
  def this(number: BN, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
  def this(number: BN, base: Double, endian: Endianness) = this()
  def this(number: BN, base: hex, endian: Endianness) = this()
  def this(number: Buffer, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
  def this(number: Buffer, base: Double, endian: Endianness) = this()
  def this(number: Buffer, base: hex, endian: Endianness) = this()
  def this(number: Uint8Array, base: js.UndefOr[scala.Nothing], endian: Endianness) = this()
  def this(number: Uint8Array, base: Double, endian: Endianness) = this()
  def this(number: Uint8Array, base: hex, endian: Endianness) = this()
}
@JSImport("bn.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @description returns true if the supplied object is a BN.js instance
    */
  def isBN(b: js.Any): /* is bn.js.bn.js.BN */ Boolean = js.native
  
  /**
    * @description returns the maximum of 2 BN instances.
    */
  def max(left: BN, right: BN): BN = js.native
  
  /**
    * @description returns the minimum of 2 BN instances.
    */
  def min(left: BN, right: BN): BN = js.native
  
  /**
    * @description  create a reduction context  with the Montgomery trick.
    */
  def mont(num: BN): ReductionContext = js.native
  
  /**
    * @description  create a reduction context
    */
  def red(reductionContext: BN): ReductionContext = js.native
  def red(reductionContext: IPrimeName): ReductionContext = js.native
}
