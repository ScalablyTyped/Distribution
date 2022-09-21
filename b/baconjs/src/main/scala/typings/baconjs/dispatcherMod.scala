package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Subscribe
import typings.baconjs.typesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatcherMod {
  
  @JSImport("baconjs/types/internal/dispatcher", JSImport.Default)
  @js.native
  open class default[V, O] protected ()
    extends StObject
       with Dispatcher[V, O] {
    def this(observable: O, _subscribe: Subscribe[V]) = this()
    def this(observable: O, _subscribe: Subscribe[V], _handleEvent: EventSink[V]) = this()
    
    /* CompleteClass */
    override def _subscribe(arg: EventSink[V]): Unsub = js.native
    /* CompleteClass */
    @JSName("_subscribe")
    var _subscribe_Original: Subscribe[V] = js.native
    
    /* CompleteClass */
    var ended: Boolean = js.native
    
    /* CompleteClass */
    override def handleEvent(event: Event[V]): Any = js.native
    
    /* CompleteClass */
    override def hasSubscribers(): Boolean = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    var observable: O = js.native
    
    /* CompleteClass */
    var prevError: Any = js.native
    
    /* CompleteClass */
    override def push(event: Event[V]): Any = js.native
    
    /* CompleteClass */
    override def pushIt(event: Event[V]): js.UndefOr[Reply] = js.native
    
    /* CompleteClass */
    override def pushToSubscriptions(event: Event[V]): Boolean = js.native
    
    /* CompleteClass */
    var pushing: Boolean = js.native
    
    /* CompleteClass */
    var queue: js.Array[Event[V]] = js.native
    
    /* CompleteClass */
    override def removeSub(subscription: Subscription[V]): js.Array[Subscription[V]] = js.native
    
    /* CompleteClass */
    override def subscribe(sink: EventSink[V]): js.Function0[Unit] = js.native
    
    /* CompleteClass */
    var subscriptions: js.Array[Subscription[V]] = js.native
    
    /* CompleteClass */
    override def unsubscribeFromSource(): Unit = js.native
  }
  
  trait Dispatcher[V, O] extends StObject {
    
    var _handleEvent: js.UndefOr[EventSink[V]] = js.undefined
    
    def _subscribe(arg: EventSink[V]): Unsub
    @JSName("_subscribe")
    var _subscribe_Original: Subscribe[V]
    
    var ended: Boolean
    
    def handleEvent(event: Event[V]): Any
    
    def hasSubscribers(): Boolean
    
    def inspect(): Any
    
    var observable: O
    
    var prevError: Any
    
    def push(event: Event[V]): Any
    
    def pushIt(event: Event[V]): js.UndefOr[Reply]
    
    def pushToSubscriptions(event: Event[V]): Boolean
    
    var pushing: Boolean
    
    var queue: js.Array[Event[V]]
    
    def removeSub(subscription: Subscription[V]): js.Array[Subscription[V]]
    
    def subscribe(sink: EventSink[V]): js.Function0[Unit]
    
    var subscriptions: js.Array[Subscription[V]]
    
    var unsubSrc: js.UndefOr[Unsub] = js.undefined
    
    def unsubscribeFromSource(): Unit
  }
  object Dispatcher {
    
    inline def apply[V, O](
      _subscribe: /* arg */ EventSink[V] => Unsub,
      ended: Boolean,
      handleEvent: Event[V] => Any,
      hasSubscribers: () => Boolean,
      inspect: () => Any,
      observable: O,
      prevError: Any,
      push: Event[V] => Any,
      pushIt: Event[V] => js.UndefOr[Reply],
      pushToSubscriptions: Event[V] => Boolean,
      pushing: Boolean,
      queue: js.Array[Event[V]],
      removeSub: Subscription[V] => js.Array[Subscription[V]],
      subscribe: EventSink[V] => js.Function0[Unit],
      subscriptions: js.Array[Subscription[V]],
      unsubscribeFromSource: () => Unit
    ): Dispatcher[V, O] = {
      val __obj = js.Dynamic.literal(_subscribe = js.Any.fromFunction1(_subscribe), ended = ended.asInstanceOf[js.Any], handleEvent = js.Any.fromFunction1(handleEvent), hasSubscribers = js.Any.fromFunction0(hasSubscribers), inspect = js.Any.fromFunction0(inspect), observable = observable.asInstanceOf[js.Any], prevError = prevError.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), pushIt = js.Any.fromFunction1(pushIt), pushToSubscriptions = js.Any.fromFunction1(pushToSubscriptions), pushing = pushing.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], removeSub = js.Any.fromFunction1(removeSub), subscribe = js.Any.fromFunction1(subscribe), subscriptions = subscriptions.asInstanceOf[js.Any], unsubscribeFromSource = js.Any.fromFunction0(unsubscribeFromSource))
      __obj.asInstanceOf[Dispatcher[V, O]]
    }
    
    extension [Self <: Dispatcher[?, ?], V, O](x: Self & (Dispatcher[V, O])) {
      
      inline def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setHandleEvent(value: Event[V] => Any): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
      
      inline def setHasSubscribers(value: () => Boolean): Self = StObject.set(x, "hasSubscribers", js.Any.fromFunction0(value))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setObservable(value: O): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      
      inline def setPrevError(value: Any): Self = StObject.set(x, "prevError", value.asInstanceOf[js.Any])
      
      inline def setPush(value: Event[V] => Any): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setPushIt(value: Event[V] => js.UndefOr[Reply]): Self = StObject.set(x, "pushIt", js.Any.fromFunction1(value))
      
      inline def setPushToSubscriptions(value: Event[V] => Boolean): Self = StObject.set(x, "pushToSubscriptions", js.Any.fromFunction1(value))
      
      inline def setPushing(value: Boolean): Self = StObject.set(x, "pushing", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: js.Array[Event[V]]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(value: Event[V]*): Self = StObject.set(x, "queue", js.Array(value*))
      
      inline def setRemoveSub(value: Subscription[V] => js.Array[Subscription[V]]): Self = StObject.set(x, "removeSub", js.Any.fromFunction1(value))
      
      inline def setSubscribe(value: EventSink[V] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setSubscriptions(value: js.Array[Subscription[V]]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsVarargs(value: Subscription[V]*): Self = StObject.set(x, "subscriptions", js.Array(value*))
      
      inline def setUnsubSrc(value: () => Unit): Self = StObject.set(x, "unsubSrc", js.Any.fromFunction0(value))
      
      inline def setUnsubSrcUndefined: Self = StObject.set(x, "unsubSrc", js.undefined)
      
      inline def setUnsubscribeFromSource(value: () => Unit): Self = StObject.set(x, "unsubscribeFromSource", js.Any.fromFunction0(value))
      
      inline def set_handleEvent(value: /* event */ Event[V] => Reply): Self = StObject.set(x, "_handleEvent", js.Any.fromFunction1(value))
      
      inline def set_handleEventUndefined: Self = StObject.set(x, "_handleEvent", js.undefined)
      
      inline def set_subscribe(value: /* arg */ EventSink[V] => Unsub): Self = StObject.set(x, "_subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait Subscription[V] extends StObject {
    
    def sink(event: Event[V]): Reply
    @JSName("sink")
    var sink_Original: EventSink[V]
  }
  object Subscription {
    
    inline def apply[V](sink: /* event */ Event[V] => Reply): Subscription[V] = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink))
      __obj.asInstanceOf[Subscription[V]]
    }
    
    extension [Self <: Subscription[?], V](x: Self & Subscription[V]) {
      
      inline def setSink(value: /* event */ Event[V] => Reply): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
    }
  }
}
