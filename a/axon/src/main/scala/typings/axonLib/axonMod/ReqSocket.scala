package typings
package axonLib.axonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "ReqSocket")
@js.native
class ReqSocket () extends Socket {
  def id(): java.lang.String = js.native
  def onmessage(): js.Function1[/* args */ nodeLib.Buffer | js.Array[nodeLib.Buffer], scala.Unit] = js.native
  def send(args: js.Any*): scala.Unit = js.native
}

