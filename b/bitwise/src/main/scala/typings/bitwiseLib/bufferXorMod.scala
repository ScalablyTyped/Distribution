package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/buffer/xor", JSImport.Namespace)
@js.native
object bufferXorMod extends js.Object {
  val default: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ] = js.native
}

