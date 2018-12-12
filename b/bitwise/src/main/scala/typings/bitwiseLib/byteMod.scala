package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/byte", JSImport.Namespace)
@js.native
object byteMod extends js.Object {
  val default: bitwiseLib.Anon_WriteByte = js.native
  def read(byte: bitwiseLib.typesMod.UInt8): js.Tuple8[
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit
  ] = js.native
  def write(byte: js.Tuple8[_, _, _, _, _, _, _, _]): bitwiseLib.typesMod.UInt8 = js.native
}

