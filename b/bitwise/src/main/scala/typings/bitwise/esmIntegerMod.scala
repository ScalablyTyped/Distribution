package typings.bitwise

import typings.bitwise.esmTypesMod.Bit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/esm/integer", JSImport.Namespace)
@js.native
object esmIntegerMod extends js.Object {
  def getBit(int32: Double, position: Double): Bit = js.native
  def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
  def toggleBit(int32: Double, position: Double): Double = js.native
  @js.native
  object default extends js.Object {
    def getBit(int32: Double, position: Double): Bit = js.native
    def setBit(int32: Double, position: Double, value: Bit): Bit = js.native
    def toggleBit(int32: Double, position: Double): Double = js.native
  }
  
}

