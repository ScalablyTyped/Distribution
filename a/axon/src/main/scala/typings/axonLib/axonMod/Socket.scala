package typings
package axonLib.axonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "Socket")
@js.native
class Socket ()
  extends nodeLib.eventsMod.EventEmitter {
  def addSocket(sock: Socket): scala.Unit = js.native
  def address(): js.UndefOr[axonLib.Anon_Address] = js.native
  def bind(port: ConnectionPort): Socket = js.native
  def bind(port: ConnectionPort, host: java.lang.String): Socket = js.native
  def bind(port: ConnectionPort, host: java.lang.String, fn: js.Function0[scala.Unit]): Socket = js.native
  def bind(port: ConnectionPort, host: js.Function0[scala.Unit]): Socket = js.native
  def bind(port: ConnectionPort, host: js.Function0[scala.Unit], fn: js.Function0[scala.Unit]): Socket = js.native
  def close(): scala.Unit = js.native
  def closeServer(fn: js.Function0[_]): scala.Unit = js.native
  def closeSockets(): scala.Unit = js.native
  def connect(port: ConnectionPort): Socket = js.native
  def connect(port: ConnectionPort, host: java.lang.String): Socket = js.native
  def connect(port: ConnectionPort, host: java.lang.String, fn: js.Function0[scala.Unit]): Socket = js.native
  def connect(port: ConnectionPort, host: js.Function0[scala.Unit]): Socket = js.native
  def connect(port: ConnectionPort, host: js.Function0[scala.Unit], fn: js.Function0[scala.Unit]): Socket = js.native
  def disable(name: java.lang.String): Socket = js.native
  def disabled(name: java.lang.String): scala.Boolean = js.native
  def enable(name: java.lang.String): Socket = js.native
  def enabled(name: java.lang.String): scala.Boolean = js.native
  def get(name: java.lang.String): js.Any = js.native
  def handleErrors(sock: Socket): scala.Unit = js.native
  def onconnect(sock: Socket): scala.Unit = js.native
  def onmessage(sock: nodeLib.netMod.Socket): js.Function1[/* args */ nodeLib.Buffer | js.Array[nodeLib.Buffer], scala.Unit] = js.native
  def pack(args: js.Array[nodeLib.Buffer]): nodeLib.Buffer = js.native
  def pack(args: nodeLib.Buffer): nodeLib.Buffer = js.native
  def removeSocket(sock: Socket): scala.Unit = js.native
  def set(name: java.lang.String, `val`: js.Any): Socket = js.native
  def use(plugin: js.Function1[/* socket */ this.type, _]): Socket = js.native
}

