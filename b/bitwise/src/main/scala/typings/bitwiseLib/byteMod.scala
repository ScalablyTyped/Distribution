package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/byte", JSImport.Namespace)
@js.native
object byteMod extends js.Object {
  val default: bitwiseLib.Anon_WriteByte = js.native
  val read: js.Function1[
    /* byte */ bitwiseLib.typesMod.UInt8, 
    js.Tuple8[
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit
    ]
  ] = js.native
  val write: js.Function1[
    /* byte */ js.Tuple8[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any], 
    bitwiseLib.typesMod.UInt8
  ] = js.native
}

