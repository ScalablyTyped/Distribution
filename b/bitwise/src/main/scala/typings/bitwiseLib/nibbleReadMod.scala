package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/nibble/read", JSImport.Namespace)
@js.native
object nibbleReadMod extends js.Object {
  val default: js.Function1[
    /* nibble */ bitwiseLib.typesMod.UInt4, 
    js.Tuple4[
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit, 
      bitwiseLib.typesMod.Bit
    ]
  ] = js.native
}

