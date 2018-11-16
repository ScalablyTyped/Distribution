package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/nibble", JSImport.Namespace)
@js.native
object nibbleMod extends js.Object {
  val default: bitwiseLib.Anon_Write = js.native
  val read: js.Function1[
    /* nibble */ bitwiseLib.typesMod.UInt4, 
    js.Tuple4[
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit
    ]
  ] = js.native
  val write: js.Function1[/* nibble */ js.Tuple4[js.Any, js.Any, js.Any, js.Any], bitwiseLib.typesMod.UInt4] = js.native
}

