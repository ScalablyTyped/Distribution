package typings
package axonLib.axonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "PubEmitterSocket")
@js.native
class PubEmitterSocket () extends js.Object {
  var sock: PubSocket = js.native
  def bind(port: ConnectionPort): Socket = js.native
  def bind(port: ConnectionPort, host: java.lang.String): Socket = js.native
  def bind(port: ConnectionPort, host: java.lang.String, fn: js.Function0[scala.Unit]): Socket = js.native
  def bind(port: ConnectionPort, host: js.Function0[scala.Unit]): Socket = js.native
  def bind(port: ConnectionPort, host: js.Function0[scala.Unit], fn: js.Function0[scala.Unit]): Socket = js.native
  def close(): scala.Unit = js.native
  def connect(port: ConnectionPort): Socket = js.native
  def connect(port: ConnectionPort, host: java.lang.String): Socket = js.native
  def connect(port: ConnectionPort, host: java.lang.String, fn: js.Function0[scala.Unit]): Socket = js.native
  def connect(port: ConnectionPort, host: js.Function0[scala.Unit]): Socket = js.native
  def connect(port: ConnectionPort, host: js.Function0[scala.Unit], fn: js.Function0[scala.Unit]): Socket = js.native
  def send(args: js.Any*): PubSocket = js.native
}

