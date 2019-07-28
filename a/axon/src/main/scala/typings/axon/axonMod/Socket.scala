package typings.axon.axonMod

import typings.axon.Anon_Address
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "Socket")
@js.native
class Socket () extends EventEmitter {
  def addSocket(sock: Socket): Unit = js.native
  def address(): js.UndefOr[Anon_Address] = js.native
  def bind(port: ConnectionPort): Socket = js.native
  def bind(port: ConnectionPort, host: String): Socket = js.native
  def bind(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit]): Socket = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket = js.native
  def close(): Unit = js.native
  def closeServer(fn: js.Function0[_]): Unit = js.native
  def closeSockets(): Unit = js.native
  def connect(port: ConnectionPort): Socket = js.native
  def connect(port: ConnectionPort, host: String): Socket = js.native
  def connect(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit]): Socket = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket = js.native
  def disable(name: String): Socket = js.native
  def disabled(name: String): Boolean = js.native
  def enable(name: String): Socket = js.native
  def enabled(name: String): Boolean = js.native
  def get(name: String): js.Any = js.native
  def handleErrors(sock: Socket): Unit = js.native
  def onconnect(sock: Socket): Unit = js.native
  def onmessage(sock: typings.node.netMod.Socket): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
  def pack(args: js.Array[Buffer]): Buffer = js.native
  def pack(args: Buffer): Buffer = js.native
  def removeSocket(sock: Socket): Unit = js.native
  def set(name: String, `val`: js.Any): Socket = js.native
  def use(plugin: js.Function1[/* socket */ this.type, _]): Socket = js.native
}

