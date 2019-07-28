package typings.axon.axonMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "ReqSocket")
@js.native
class ReqSocket () extends Socket {
  def id(): String = js.native
  def onmessage(): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
  def send(args: js.Any*): Unit = js.native
}

