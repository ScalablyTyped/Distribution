package typings
package bnDotJsLib.bnDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bn.js", JSImport.Namespace)
@js.native
class ^ protected () extends BN {
  def this(number: BN) = this()
  def this(number: java.lang.String) = this()
  def this(number: js.Array[scala.Double]) = this()
  def this(number: nodeLib.Buffer) = this()
  def this(number: scala.Double) = this()
  def this(number: stdLib.Uint8Array) = this()
  def this(number: BN, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: BN, base: scala.Double) = this()
  def this(number: BN, endian: Endianness) = this()
  def this(number: java.lang.String, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: java.lang.String, base: scala.Double) = this()
  def this(number: java.lang.String, endian: Endianness) = this()
  def this(number: js.Array[scala.Double], base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: js.Array[scala.Double], base: scala.Double) = this()
  def this(number: js.Array[scala.Double], endian: Endianness) = this()
  def this(number: nodeLib.Buffer, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: nodeLib.Buffer, base: scala.Double) = this()
  def this(number: nodeLib.Buffer, endian: Endianness) = this()
  def this(number: scala.Double, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: scala.Double, base: scala.Double) = this()
  def this(number: scala.Double, endian: Endianness) = this()
  def this(number: stdLib.Uint8Array, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: stdLib.Uint8Array, base: scala.Double) = this()
  def this(number: stdLib.Uint8Array, endian: Endianness) = this()
  def this(number: BN, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: Endianness) = this()
  def this(number: BN, base: scala.Double, endian: Endianness) = this()
  def this(number: java.lang.String, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: Endianness) = this()
  def this(number: java.lang.String, base: scala.Double, endian: Endianness) = this()
  def this(number: js.Array[scala.Double], base: bnDotJsLib.bnDotJsLibStrings.hex, endian: Endianness) = this()
  def this(number: js.Array[scala.Double], base: scala.Double, endian: Endianness) = this()
  def this(number: nodeLib.Buffer, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: Endianness) = this()
  def this(number: nodeLib.Buffer, base: scala.Double, endian: Endianness) = this()
  def this(number: scala.Double, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: Endianness) = this()
  def this(number: scala.Double, base: scala.Double, endian: Endianness) = this()
  def this(number: stdLib.Uint8Array, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: Endianness) = this()
  def this(number: stdLib.Uint8Array, base: scala.Double, endian: Endianness) = this()
}

@JSImport("bn.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @description returns true if the supplied object is a BN.js instance
    */
  def isBN(b: js.Any): /* is bn.js.bn.js.BN */ scala.Boolean = js.native
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

