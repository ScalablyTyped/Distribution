package typings.axon

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axon", JSImport.Namespace)
@js.native
object axonMod extends js.Object {
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
  
  @js.native
  class PubSocket () extends Socket {
    def send(args: js.Any*): PubSocket = js.native
  }
  
  @js.native
  class PullSocket () extends Socket {
    /**
      * @throws {Error}
      */
    def send(): Unit = js.native
  }
  
  @js.native
  class PushSocket () extends Socket {
    def enqueue(msg: js.Any): Unit = js.native
    def send(args: js.Any*): Unit = js.native
  }
  
  @js.native
  class RepSocket () extends Socket
  
  @js.native
  class ReqSocket () extends Socket {
    def id(): String = js.native
    def onmessage(): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
    def send(args: js.Any*): Unit = js.native
  }
  
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
  
  @js.native
  class SubEmitterSocket () extends js.Object {
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
    def off(event: String): SubEmitterSocket = js.native
    def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): SubEmitterSocket = js.native
    def onmessage(): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
  }
  
  @js.native
  class SubSocket () extends Socket {
    def clearSubscriptions(): Unit = js.native
    def hasSubscriptions(): Boolean = js.native
    def matches(topic: String): Boolean = js.native
    /**
      * @throws {Error}
      */
    def send(): Unit = js.native
    def subscribe(re: String): RegExp = js.native
    def subscribe(re: RegExp): RegExp = js.native
    def unsubscribe(re: String): Unit = js.native
    def unsubscribe(re: RegExp): Unit = js.native
  }
  
  def socket(`type`: String): Socket = js.native
  def socket(`type`: String, options: js.Any): Socket = js.native
  @js.native
  object types extends /* propName */ StringDictionary[Anon_PubEmitterSocket]
  
  type ConnectionPort = Double | String | Anon_Hostname
}

