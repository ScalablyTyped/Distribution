package typings.broadcastChannel

import typings.broadcastChannel.anon.FallbackInterval
import typings.broadcastChannel.anon.Ttl
import typings.broadcastChannel.broadcastChannelBooleans.`false`
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastChannelMod {
  
  @JSImport("broadcast-channel/types/broadcast-channel", "BroadcastChannel")
  @js.native
  class BroadcastChannel[T] protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, opts: BroadcastChannelOptions) = this()
    
    // not defined in the offical standard
    def addEventListener(`type`: EventType, handler: OnMessageHandler[T]): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    val name: String = js.native
    
    var onmessage: OnMessageHandler[T] = js.native
    
    val options: BroadcastChannelOptions = js.native
    
    def postMessage(msg: T): js.Promise[Unit] = js.native
    
    def removeEventListener(`type`: EventType, handler: OnMessageHandler[T]): Unit = js.native
    
    val `type`: MethodType = js.native
  }
  
  @JSImport("broadcast-channel/types/broadcast-channel", "clearNodeFolder")
  @js.native
  def clearNodeFolder(): js.Promise[Boolean] = js.native
  @JSImport("broadcast-channel/types/broadcast-channel", "clearNodeFolder")
  @js.native
  def clearNodeFolder(opts: BroadcastChannelOptions): js.Promise[Boolean] = js.native
  
  @JSImport("broadcast-channel/types/broadcast-channel", "enforceOptions")
  @js.native
  def enforceOptions(): Unit = js.native
  @JSImport("broadcast-channel/types/broadcast-channel", "enforceOptions")
  @js.native
  def enforceOptions(opts: BroadcastChannelOptions): Unit = js.native
  @JSImport("broadcast-channel/types/broadcast-channel", "enforceOptions")
  @js.native
  def enforceOptions_false(opts: `false`): Unit = js.native
  
  @js.native
  trait BroadcastChannelEventMap extends StObject {
    
    var message: MessageEvent[_] = js.native
    
    var messageerror: MessageEvent[_] = js.native
  }
  object BroadcastChannelEventMap {
    
    @scala.inline
    def apply(message: MessageEvent[_], messageerror: MessageEvent[_]): BroadcastChannelEventMap = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastChannelEventMap]
    }
    
    @scala.inline
    implicit class BroadcastChannelEventMapMutableBuilder[Self <: BroadcastChannelEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: MessageEvent[_]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageerror(value: MessageEvent[_]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BroadcastChannelOptions extends StObject {
    
    var idb: js.UndefOr[FallbackInterval] = js.native
    
    var methods: js.UndefOr[js.Array[BroadcastMethod[js.Object]] | BroadcastMethod[js.Object]] = js.native
    
    var node: js.UndefOr[Ttl] = js.native
    
    var prepareDelay: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[MethodType] = js.native
    
    var webWorkerSupport: js.UndefOr[Boolean] = js.native
  }
  object BroadcastChannelOptions {
    
    @scala.inline
    def apply(): BroadcastChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastChannelOptions]
    }
    
    @scala.inline
    implicit class BroadcastChannelOptionsMutableBuilder[Self <: BroadcastChannelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdb(value: FallbackInterval): Self = StObject.set(x, "idb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdbUndefined: Self = StObject.set(x, "idb", js.undefined)
      
      @scala.inline
      def setMethods(value: js.Array[BroadcastMethod[js.Object]] | BroadcastMethod[js.Object]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: BroadcastMethod[js.Object]*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setNode(value: Ttl): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setPrepareDelay(value: Double): Self = StObject.set(x, "prepareDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrepareDelayUndefined: Self = StObject.set(x, "prepareDelay", js.undefined)
      
      @scala.inline
      def setType(value: MethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWebWorkerSupport(value: Boolean): Self = StObject.set(x, "webWorkerSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebWorkerSupportUndefined: Self = StObject.set(x, "webWorkerSupport", js.undefined)
    }
  }
  
  @js.native
  trait BroadcastMethod[State] extends StObject {
    
    def averageResponseTime(): Double = js.native
    
    def canBeUsed(): Boolean = js.native
    
    def close(channelState: State): Unit = js.native
    
    def create(channelName: String, options: BroadcastChannelOptions): js.Promise[State] | State = js.native
    
    def microSeconds(): Double = js.native
    
    def onMessage(channelState: State, callback: js.Function1[/* args */ js.Any, Unit]): Unit = js.native
    
    def postMessage(channelState: State, message: js.Any): js.Promise[_] = js.native
    
    var `type`: String = js.native
  }
  object BroadcastMethod {
    
    @scala.inline
    def apply[State](
      averageResponseTime: () => Double,
      canBeUsed: () => Boolean,
      close: State => Unit,
      create: (String, BroadcastChannelOptions) => js.Promise[State] | State,
      microSeconds: () => Double,
      onMessage: (State, js.Function1[/* args */ js.Any, Unit]) => Unit,
      postMessage: (State, js.Any) => js.Promise[_],
      `type`: String
    ): BroadcastMethod[State] = {
      val __obj = js.Dynamic.literal(averageResponseTime = js.Any.fromFunction0(averageResponseTime), canBeUsed = js.Any.fromFunction0(canBeUsed), close = js.Any.fromFunction1(close), create = js.Any.fromFunction2(create), microSeconds = js.Any.fromFunction0(microSeconds), onMessage = js.Any.fromFunction2(onMessage), postMessage = js.Any.fromFunction2(postMessage))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BroadcastMethod[State]]
    }
    
    @scala.inline
    implicit class BroadcastMethodMutableBuilder[Self <: BroadcastMethod[_], State] (val x: Self with BroadcastMethod[State]) extends AnyVal {
      
      @scala.inline
      def setAverageResponseTime(value: () => Double): Self = StObject.set(x, "averageResponseTime", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCanBeUsed(value: () => Boolean): Self = StObject.set(x, "canBeUsed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClose(value: State => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreate(value: (String, BroadcastChannelOptions) => js.Promise[State] | State): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMicroSeconds(value: () => Double): Self = StObject.set(x, "microSeconds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMessage(value: (State, js.Function1[/* args */ js.Any, Unit]) => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostMessage(value: (State, js.Any) => js.Promise[_]): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.broadcastChannel.broadcastChannelStrings.message
    - typings.broadcastChannel.broadcastChannelStrings.internal
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def internal: typings.broadcastChannel.broadcastChannelStrings.internal = "internal".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.internal]
    
    @scala.inline
    def message: typings.broadcastChannel.broadcastChannelStrings.message = "message".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.message]
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
    
    @scala.inline
    def idb: typings.broadcastChannel.broadcastChannelStrings.idb = "idb".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.idb]
    
    @scala.inline
    def localstorage: typings.broadcastChannel.broadcastChannelStrings.localstorage = "localstorage".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.localstorage]
    
    @scala.inline
    def native: typings.broadcastChannel.broadcastChannelStrings.native = "native".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.native]
    
    @scala.inline
    def node: typings.broadcastChannel.broadcastChannelStrings.node = "node".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.node]
    
    @scala.inline
    def simulate: typings.broadcastChannel.broadcastChannelStrings.simulate = "simulate".asInstanceOf[typings.broadcastChannel.broadcastChannelStrings.simulate]
  }
  
  type OnMessageHandler[T] = (js.ThisFunction1[/* this */ BroadcastChannel[js.Any], /* ev */ T, js.Any]) | Null
}
