package typings.axon.mod

import typings.axon.anon.Address
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", "Socket")
@js.native
class Socket_ () extends EventEmitter {
  def addSocket(sock: Socket_): Unit = js.native
  def address(): js.UndefOr[Address] = js.native
  def bind(port: ConnectionPort): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: String): Socket_ = js.native
  def bind(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
  def close(): Unit = js.native
  def closeServer(fn: js.Function0[_]): Unit = js.native
  def closeSockets(): Unit = js.native
  def connect(port: ConnectionPort): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: String): Socket_ = js.native
  def connect(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
  def disable(name: String): Socket_ = js.native
  def disabled(name: String): Boolean = js.native
  def enable(name: String): Socket_ = js.native
  def enabled(name: String): Boolean = js.native
  def get(name: String): js.Any = js.native
  def handleErrors(sock: Socket_): Unit = js.native
  def onconnect(sock: Socket_): Unit = js.native
  def onmessage(sock: Socket): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
  def pack(args: js.Array[Buffer]): Buffer = js.native
  def pack(args: Buffer): Buffer = js.native
  def removeSocket(sock: Socket_): Unit = js.native
  def set(name: String, `val`: js.Any): Socket_ = js.native
  def use(plugin: js.Function1[/* socket */ this.type, _]): Socket_ = js.native
}

