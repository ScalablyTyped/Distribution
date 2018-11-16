package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/buffer/read", JSImport.Namespace)
@js.native
object bufferReadMod extends js.Object {
  val default: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* offset */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    js.Array[js.Any]
  ] = js.native
}

