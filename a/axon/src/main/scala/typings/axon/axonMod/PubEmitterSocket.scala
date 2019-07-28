package typings.axon.axonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "PubEmitterSocket")
@js.native
class PubEmitterSocket () extends js.Object {
  var sock: PubSocket = js.native
  def bind(port: ConnectionPort): Socket = js.native
  def bind(port: ConnectionPort, host: String): Socket = js.native
  def bind(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit]): Socket = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket = js.native
  def close(): Unit = js.native
  def connect(port: ConnectionPort): Socket = js.native
  def connect(port: ConnectionPort, host: String): Socket = js.native
  def connect(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit]): Socket = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket = js.native
  def send(args: js.Any*): PubSocket = js.native
}

