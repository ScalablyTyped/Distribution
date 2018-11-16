package typings
package axonLib.axonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "SubEmitterSocket")
@js.native
class SubEmitterSocket () extends js.Object {
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
  def off(event: java.lang.String): SubEmitterSocket = js.native
  def on(event: java.lang.String, fn: js.Function1[/* repeated */js.Any, scala.Unit]): SubEmitterSocket = js.native
  def onmessage(): js.Function1[/* args */ nodeLib.Buffer | js.Array[nodeLib.Buffer], scala.Unit] = js.native
}

