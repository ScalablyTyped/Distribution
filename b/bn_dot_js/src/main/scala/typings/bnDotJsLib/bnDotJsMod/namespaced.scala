package typings
package bnDotJsLib.bnDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bn.js", JSImport.Namespace)
@js.native
class namespaced protected () extends BN {
  def this(number: BN) = this()
  def this(number: java.lang.String) = this()
  def this(number: js.Array[scala.Double]) = this()
  def this(number: nodeLib.Buffer) = this()
  def this(number: scala.Double) = this()
  def this(number: BN, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: BN, base: scala.Double) = this()
  def this(number: BN, endian: bnDotJsLib.Endianness) = this()
  def this(number: java.lang.String, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: java.lang.String, base: scala.Double) = this()
  def this(number: java.lang.String, endian: bnDotJsLib.Endianness) = this()
  def this(number: js.Array[scala.Double], base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: js.Array[scala.Double], base: scala.Double) = this()
  def this(number: js.Array[scala.Double], endian: bnDotJsLib.Endianness) = this()
  def this(number: nodeLib.Buffer, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: nodeLib.Buffer, base: scala.Double) = this()
  def this(number: nodeLib.Buffer, endian: bnDotJsLib.Endianness) = this()
  def this(number: scala.Double, base: bnDotJsLib.bnDotJsLibStrings.hex) = this()
  def this(number: scala.Double, base: scala.Double) = this()
  def this(number: scala.Double, endian: bnDotJsLib.Endianness) = this()
  def this(number: BN, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: bnDotJsLib.Endianness) = this()
  def this(number: BN, base: scala.Double, endian: bnDotJsLib.Endianness) = this()
  def this(number: java.lang.String, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: bnDotJsLib.Endianness) = this()
  def this(number: java.lang.String, base: scala.Double, endian: bnDotJsLib.Endianness) = this()
  def this(number: js.Array[scala.Double], base: bnDotJsLib.bnDotJsLibStrings.hex, endian: bnDotJsLib.Endianness) = this()
  def this(number: js.Array[scala.Double], base: scala.Double, endian: bnDotJsLib.Endianness) = this()
  def this(number: nodeLib.Buffer, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: bnDotJsLib.Endianness) = this()
  def this(number: nodeLib.Buffer, base: scala.Double, endian: bnDotJsLib.Endianness) = this()
  def this(number: scala.Double, base: bnDotJsLib.bnDotJsLibStrings.hex, endian: bnDotJsLib.Endianness) = this()
  def this(number: scala.Double, base: scala.Double, endian: bnDotJsLib.Endianness) = this()
}

@JSImport("bn.js", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * @description returns true if the supplied object is a BN.js instance
    */
  def isBN(b: js.Any): /* is bn.js.bn.js.BN */ scala.Boolean = js.native
  /**
    * @description returns the maximum of 2 BN instances.
    */
  def max(left: bnDotJsLib.bnDotJsMod.BN, right: bnDotJsLib.bnDotJsMod.BN): bnDotJsLib.bnDotJsMod.BN = js.native
  /**
    * @description returns the minimum of 2 BN instances.
    */
  def min(left: bnDotJsLib.bnDotJsMod.BN, right: bnDotJsLib.bnDotJsMod.BN): bnDotJsLib.bnDotJsMod.BN = js.native
  /**
    * @description  create a reduction context  with the Montgomery trick.
    */
  def mont(num: bnDotJsLib.bnDotJsMod.BN): bnDotJsLib.bnDotJsMod.ReductionContext = js.native
  def red(reductionContext: bnDotJsLib.IPrimeName): bnDotJsLib.bnDotJsMod.ReductionContext = js.native
  /**
    * @description  create a reduction context
    */
  def red(reductionContext: bnDotJsLib.bnDotJsMod.BN): bnDotJsLib.bnDotJsMod.ReductionContext = js.native
}

