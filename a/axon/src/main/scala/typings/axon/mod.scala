package typings.axon

import typings.axon.anon.Address
import typings.axon.anon.Hostname
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.netMod.Socket
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("axon", "PubEmitterSocket")
  @js.native
  class PubEmitterSocket () extends StObject {
    
    def bind(port: ConnectionPort): Socket_ = js.native
    def bind(port: ConnectionPort, host: String): Socket_ = js.native
    def bind(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: Unit, fn: js.Function0[Unit]): Socket_ = js.native
    
    def close(): Unit = js.native
    
    def connect(port: ConnectionPort): Socket_ = js.native
    def connect(port: ConnectionPort, host: String): Socket_ = js.native
    def connect(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: Unit, fn: js.Function0[Unit]): Socket_ = js.native
    
    def send(args: js.Any*): PubSocket = js.native
    
    var sock: PubSocket = js.native
  }
  
  @JSImport("axon", "PubSocket")
  @js.native
  class PubSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    def send(args: js.Any*): PubSocket = js.native
  }
  
  @JSImport("axon", "PullSocket")
  @js.native
  class PullSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    /**
      * @throws {Error}
      */
    def send(): Unit = js.native
  }
  
  @JSImport("axon", "PushSocket")
  @js.native
  class PushSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    def enqueue(msg: js.Any): Unit = js.native
    
    def send(args: js.Any*): Unit = js.native
  }
  
  @JSImport("axon", "RepSocket")
  @js.native
  class RepSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("axon", "ReqSocket")
  @js.native
  class ReqSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    def id(): String = js.native
    
    def onmessage(): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
    
    def send(args: js.Any*): Unit = js.native
  }
  
  @JSImport("axon", "Socket")
  @js.native
  class Socket_ () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def addSocket(sock: Socket_): Unit = js.native
    
    def address(): js.UndefOr[Address] = js.native
    
    def bind(port: ConnectionPort): Socket_ = js.native
    def bind(port: ConnectionPort, host: String): Socket_ = js.native
    def bind(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: Unit, fn: js.Function0[Unit]): Socket_ = js.native
    
    def close(): Unit = js.native
    
    def closeServer(fn: js.Function0[js.Any]): Unit = js.native
    
    def closeSockets(): Unit = js.native
    
    def connect(port: ConnectionPort): Socket_ = js.native
    def connect(port: ConnectionPort, host: String): Socket_ = js.native
    def connect(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: Unit, fn: js.Function0[Unit]): Socket_ = js.native
    
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
    
    def use(plugin: js.Function1[/* socket */ this.type, js.Any]): Socket_ = js.native
  }
  
  @JSImport("axon", "SubEmitterSocket")
  @js.native
  class SubEmitterSocket () extends StObject {
    
    def bind(port: ConnectionPort): Socket_ = js.native
    def bind(port: ConnectionPort, host: String): Socket_ = js.native
    def bind(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
    def bind(port: ConnectionPort, host: Unit, fn: js.Function0[Unit]): Socket_ = js.native
    
    def close(): Unit = js.native
    
    def connect(port: ConnectionPort): Socket_ = js.native
    def connect(port: ConnectionPort, host: String): Socket_ = js.native
    def connect(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
    def connect(port: ConnectionPort, host: Unit, fn: js.Function0[Unit]): Socket_ = js.native
    
    def off(event: String): SubEmitterSocket = js.native
    
    def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): SubEmitterSocket = js.native
    
    def onmessage(): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
  }
  
  @JSImport("axon", "SubSocket")
  @js.native
  class SubSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
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
  
  inline def socket(`type`: String): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def socket(`type`: String, options: js.Any): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  
  type ConnectionPort = Double | String | Hostname
}
