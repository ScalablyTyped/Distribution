package typings.broadcastChannel

import typings.broadcastChannel.anon.FallbackInterval
import typings.broadcastChannel.anon.MaxParallelWrites
import typings.broadcastChannel.broadcastChannelBooleans.`false`
import typings.std.MessageEvent
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBroadcastChannelMod {
  
  @JSImport("broadcast-channel/types/broadcast-channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("broadcast-channel/types/broadcast-channel", "BroadcastChannel")
  @js.native
  open class BroadcastChannel[T] protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, opts: BroadcastChannelOptions) = this()
    
    // not defined in the offical standard
    def addEventListener(`type`: EventContext, handler: OnMessageHandler[T]): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    val id: Double = js.native
    
    val isClosed: Boolean = js.native
    
    val name: String = js.native
    
    var onmessage: OnMessageHandler[T] = js.native
    
    val options: BroadcastChannelOptions = js.native
    
    def postMessage(msg: T): js.Promise[Unit] = js.native
    
    def removeEventListener(`type`: EventContext, handler: OnMessageHandler[T]): Unit = js.native
    
    val `type`: MethodType = js.native
  }
  
  @JSImport("broadcast-channel/types/broadcast-channel", "OPEN_BROADCAST_CHANNELS")
  @js.native
  val OPEN_BROADCAST_CHANNELS: Set[BroadcastChannel[Any]] = js.native
  
  inline def clearNodeFolder(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNodeFolder")().asInstanceOf[js.Promise[Boolean]]
  inline def clearNodeFolder(opts: BroadcastChannelOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNodeFolder")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def enforceOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")().asInstanceOf[Unit]
  inline def enforceOptions(opts: BroadcastChannelOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enforceOptions_false(opts: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BroadcastChannelEventMap extends StObject {
    
    var message: MessageEvent[Any]
    
    var messageerror: MessageEvent[Any]
  }
  object BroadcastChannelEventMap {
    
    inline def apply(message: MessageEvent[Any], messageerror: MessageEvent[Any]): BroadcastChannelEventMap = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastChannelEventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BroadcastChannelEventMap] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageerror(value: MessageEvent[Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    }
  }
  
  trait BroadcastChannelOptions extends StObject {
    
    var idb: js.UndefOr[FallbackInterval] = js.undefined
    
    var methods: js.UndefOr[js.Array[BroadcastMethod[js.Object]] | BroadcastMethod[js.Object]] = js.undefined
    
    var node: js.UndefOr[MaxParallelWrites] = js.undefined
    
    var prepareDelay: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[MethodType] = js.undefined
    
    var webWorkerSupport: js.UndefOr[Boolean] = js.undefined
  }
  object BroadcastChannelOptions {
    
    inline def apply(): BroadcastChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastChannelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BroadcastChannelOptions] (val x: Self) extends AnyVal {
      
      inline def setIdb(value: FallbackInterval): Self = StObject.set(x, "idb", value.asInstanceOf[js.Any])
      
      inline def setIdbUndefined: Self = StObject.set(x, "idb", js.undefined)
      
      inline def setMethods(value: js.Array[BroadcastMethod[js.Object]] | BroadcastMethod[js.Object]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: BroadcastMethod[js.Object]*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setNode(value: MaxParallelWrites): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setPrepareDelay(value: Double): Self = StObject.set(x, "prepareDelay", value.asInstanceOf[js.Any])
      
      inline def setPrepareDelayUndefined: Self = StObject.set(x, "prepareDelay", js.undefined)
      
      inline def setType(value: MethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWebWorkerSupport(value: Boolean): Self = StObject.set(x, "webWorkerSupport", value.asInstanceOf[js.Any])
      
      inline def setWebWorkerSupportUndefined: Self = StObject.set(x, "webWorkerSupport", js.undefined)
    }
  }
  
  trait BroadcastMethod[State] extends StObject {
    
    def averageResponseTime(): Double
    
    def canBeUsed(): Boolean
    
    def close(channelState: State): Unit
    
    def create(channelName: String, options: BroadcastChannelOptions): js.Promise[State] | State
    
    def microSeconds(): Double
    
    def onMessage(channelState: State, callback: js.Function1[/* args */ Any, Unit]): Unit
    
    def postMessage(channelState: State, message: Any): js.Promise[Any]
    
    var `type`: String
  }
  object BroadcastMethod {
    
    inline def apply[State](
      averageResponseTime: () => Double,
      canBeUsed: () => Boolean,
      close: State => Unit,
      create: (String, BroadcastChannelOptions) => js.Promise[State] | State,
      microSeconds: () => Double,
      onMessage: (State, js.Function1[/* args */ Any, Unit]) => Unit,
      postMessage: (State, Any) => js.Promise[Any],
      `type`: String
    ): BroadcastMethod[State] = {
      val __obj = js.Dynamic.literal(averageResponseTime = js.Any.fromFunction0(averageResponseTime), canBeUsed = js.Any.fromFunction0(canBeUsed), close = js.Any.fromFunction1(close), create = js.Any.fromFunction2(create), microSeconds = js.Any.fromFunction0(microSeconds), onMessage = js.Any.fromFunction2(onMessage), postMessage = js.Any.fromFunction2(postMessage))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastMethod[State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BroadcastMethod[?], State] (val x: Self & BroadcastMethod[State]) extends AnyVal {
      
      inline def setAverageResponseTime(value: () => Double): Self = StObject.set(x, "averageResponseTime", js.Any.fromFunction0(value))
      
      inline def setCanBeUsed(value: () => Boolean): Self = StObject.set(x, "canBeUsed", js.Any.fromFunction0(value))
      
      inline def setClose(value: State => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCreate(value: (String, BroadcastChannelOptions) => js.Promise[State] | State): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setMicroSeconds(value: () => Double): Self = StObject.set(x, "microSeconds", js.Any.fromFunction0(value))
      
      inline def setOnMessage(value: (State, js.Function1[/* args */ Any, Unit]) => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction2(value))
      
      inline def setPostMessage(value: (State, Any) => js.Promise[Any]): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.broadcastChannel.broadcastChannelStrings.message
    - typings.broadcastChannel.broadcastChannelStrings.internal
    - typings.broadcastChannel.broadcastChannelStrings.leader
  */
  trait EventContext extends StObject
  object EventContext {
    
    inline def internal: typings.broadcastChannel.broadcastChannelStrings.internal = "internal".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.internal]
    
    inline def leader: typings.broadcastChannel.broadcastChannelStrings.leader = "leader".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.leader]
    
    inline def message: typings.broadcastChannel.broadcastChannelStrings.message = "message".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.message]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.broadcastChannel.broadcastChannelStrings.node
    - typings.broadcastChannel.broadcastChannelStrings.idb
    - typings.broadcastChannel.broadcastChannelStrings.native
    - typings.broadcastChannel.broadcastChannelStrings.localstorage
    - typings.broadcastChannel.broadcastChannelStrings.simulate
  */
  trait MethodType extends StObject
  object MethodType {
    
    inline def idb: typings.broadcastChannel.broadcastChannelStrings.idb = "idb".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.idb]
    
    inline def localstorage: typings.broadcastChannel.broadcastChannelStrings.localstorage = "localstorage".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.localstorage]
    
    inline def native: typings.broadcastChannel.broadcastChannelStrings.native = "native".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.native]
    
    inline def node: typings.broadcastChannel.broadcastChannelStrings.node = "node".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.node]
    
    inline def simulate: typings.broadcastChannel.broadcastChannelStrings.simulate = "simulate".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.simulate]
  }
  
  type OnMessageHandler[T] = (js.ThisFunction1[/* this */ BroadcastChannel[Any], /* ev */ T, Any]) | Null
}
