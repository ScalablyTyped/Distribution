package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/nibble", JSImport.Namespace)
@js.native
object nibbleMod extends js.Object {
  val default: bitwiseLib.Anon_Write = js.native
  def read(nibble: bitwiseLib.typesMod.UInt4): js.Tuple4[
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit
  ] = js.native
  def write(nibble: js.Tuple4[_, _, _, _]): bitwiseLib.typesMod.UInt4 = js.native
}

