package typings.axon

import typings.axon.anon.Address
import typings.axon.anon.Hostname
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("axon", "PubEmitterSocket")
  @js.native
  open class PubEmitterSocket () extends StObject {
    
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
    
    def send(args: Any*): PubSocket = js.native
    
    var sock: PubSocket = js.native
  }
  
  @JSImport("axon", "PubSocket")
  @js.native
  open class PubSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    def send(args: Any*): PubSocket = js.native
  }
  
  @JSImport("axon", "PullSocket")
  @js.native
  open class PullSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    /**
      * @throws {Error}
      */
    def send(): Unit = js.native
  }
  
  @JSImport("axon", "PushSocket")
  @js.native
  open class PushSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    def enqueue(msg: Any): Unit = js.native
    
    def send(args: Any*): Unit = js.native
  }
  
  @JSImport("axon", "RepSocket")
  @js.native
  open class RepSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("axon", "ReqSocket")
  @js.native
  open class ReqSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    def id(): String = js.native
    
    def onmessage(): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
    
    def send(args: Any*): Unit = js.native
  }
  
  @JSImport("axon", "Socket")
  @js.native
  open class Socket_ () extends EventEmitter {
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
    
    def closeServer(fn: js.Function0[Any]): Unit = js.native
    
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
    
    def get(name: String): Any = js.native
    
    def handleErrors(sock: Socket_): Unit = js.native
    
    def onconnect(sock: Socket_): Unit = js.native
    
    def onmessage(sock: Socket): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
    
    def pack(args: js.Array[Buffer]): Buffer = js.native
    def pack(args: Buffer): Buffer = js.native
    
    def removeSocket(sock: Socket_): Unit = js.native
    
    def set(name: String, `val`: Any): Socket_ = js.native
    
    def use(plugin: js.Function1[/* socket */ this.type, Any]): Socket_ = js.native
  }
  
  @JSImport("axon", "SubEmitterSocket")
  @js.native
  open class SubEmitterSocket () extends StObject {
    
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
    
    def on(event: String, fn: js.Function1[/* repeated */ Any, Unit]): SubEmitterSocket = js.native
    
    def onmessage(): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
  }
  
  @JSImport("axon", "SubSocket")
  @js.native
  open class SubSocket () extends Socket_ {
    def this(options: EventEmitterOptions) = this()
    
    def clearSubscriptions(): Unit = js.native
    
    def hasSubscriptions(): Boolean = js.native
    
    def matches(topic: String): Boolean = js.native
    
    /**
      * @throws {Error}
      */
    def send(): Unit = js.native
    
    def subscribe(re: String): js.RegExp = js.native
    def subscribe(re: js.RegExp): js.RegExp = js.native
    
    def unsubscribe(re: String): Unit = js.native
    def unsubscribe(re: js.RegExp): Unit = js.native
  }
  
  inline def socket(`type`: String): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def socket(`type`: String, options: Any): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  
  type ConnectionPort = Double | String | Hostname
}
