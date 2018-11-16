package typings
package axonLib.axonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "PushSocket")
@js.native
class PushSocket () extends Socket {
  def enqueue(msg: js.Any): scala.Unit = js.native
  def send(args: js.Any*): scala.Unit = js.native
}

