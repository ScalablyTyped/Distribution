package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/integer", JSImport.Namespace)
@js.native
object integerMod extends js.Object {
  val default: bitwiseLib.Anon_GetBit = js.native
  val getBit: js.Function2[/* int32 */ scala.Double, /* position */ scala.Double, bitwiseLib.typesMod.Bit] = js.native
  val setBit: js.Function3[
    /* int32 */ scala.Double, 
    /* position */ scala.Double, 
    /* value */ bitwiseLib.typesMod.Bit, 
    bitwiseLib.typesMod.Bit
  ] = js.native
  val toggleBit: js.Function2[/* int32 */ scala.Double, /* position */ scala.Double, scala.Double] = js.native
}

