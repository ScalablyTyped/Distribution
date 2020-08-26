package typings.axon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "PubEmitterSocket")
@js.native
class PubEmitterSocket () extends js.Object {
  var sock: PubSocket = js.native
  def bind(port: ConnectionPort): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: String): Socket_ = js.native
  def bind(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
  def close(): Unit = js.native
  def connect(port: ConnectionPort): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: String): Socket_ = js.native
  def connect(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
  def send(args: js.Any*): PubSocket = js.native
}

