package typings.bitwise

import typings.bitwise.typesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetBitInt32 extends js.Object {
  def getBit(int32: Double, position: Double): Bit
  def setBit(int32: Double, position: Double, value: Bit): Bit
  def toggleBit(int32: Double, position: Double): Double
}

object Anon_GetBitInt32 {
  @scala.inline
  def apply(
    getBit: (Double, Double) => Bit,
    setBit: (Double, Double, Bit) => Bit,
    toggleBit: (Double, Double) => Double
  ): Anon_GetBitInt32 = {
    val __obj = js.Dynamic.literal(getBit = js.Any.fromFunction2(getBit), setBit = js.Any.fromFunction3(setBit), toggleBit = js.Any.fromFunction2(toggleBit))
  
    __obj.asInstanceOf[Anon_GetBitInt32]
  }
}

