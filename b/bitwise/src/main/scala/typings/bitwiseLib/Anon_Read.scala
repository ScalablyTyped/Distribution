package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Read extends js.Object {
  var and: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ]
  var create: js.Function1[/* bits */ js.Array[_], nodeLib.Buffer]
  var modify: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* bits */ js.Array[_], 
    /* offset */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  var nand: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ]
  var nor: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ]
  var not: js.Function1[/* buffer */ nodeLib.Buffer, nodeLib.Buffer]
  var or: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ]
  var read: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* offset */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    js.Array[_]
  ]
  var readInt: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* offset */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    scala.Double
  ]
  var readUInt: js.Function3[
    /* buffer */ nodeLib.Buffer, 
    /* offset */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    scala.Double
  ]
  var xnor: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ]
  var xor: js.Function3[
    /* buffer1 */ nodeLib.Buffer, 
    /* buffer2 */ nodeLib.Buffer, 
    /* isLooping */ js.UndefOr[scala.Boolean], 
    nodeLib.Buffer
  ]
}

