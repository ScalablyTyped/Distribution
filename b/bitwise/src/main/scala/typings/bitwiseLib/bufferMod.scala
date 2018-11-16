package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  val and: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ] = js.native
  val create: js.Function1[/* bits */ js.Array[js.Any], nodeLib.Buffer] = js.native
  val default: bitwiseLib.Anon_Read = js.native
  val modify: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* bits */ js.Array[js.Any], 
    /* offset */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  val nand: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ] = js.native
  val nor: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ] = js.native
  val not: js.Function1[/* buffer */ nodeLib.Buffer, nodeLib.Buffer] = js.native
  val or: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ] = js.native
  val read: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* offset */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    js.Array[js.Any]
  ] = js.native
  val readInt: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* offset */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    scala.Double
  ] = js.native
  val readUInt: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* offset */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    scala.Double
  ] = js.native
  val xnor: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ] = js.native
  val xor: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ] = js.native
}

