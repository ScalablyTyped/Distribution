package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/integer", JSImport.Namespace)
@js.native
object integerMod extends js.Object {
  def getBit(int32: scala.Double, position: scala.Double): bitwiseLib.typesMod.Bit = js.native
  def setBit(int32: scala.Double, position: scala.Double, value: bitwiseLib.typesMod.Bit): bitwiseLib.typesMod.Bit = js.native
  def toggleBit(int32: scala.Double, position: scala.Double): scala.Double = js.native
  @js.native
  object default extends js.Object {
    def getBit(int32: scala.Double, position: scala.Double): js.Any = js.native
    def setBit(
      int32: scala.Double,
      position: scala.Double,
      value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ js.Any
    ): js.Any = js.native
    def toggleBit(int32: scala.Double, position: scala.Double): scala.Double = js.native
  }
  
}

