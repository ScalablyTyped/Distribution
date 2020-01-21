package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Subscribe
import typings.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/dispatcher", JSImport.Namespace)
@js.native
object dispatcherMod extends js.Object {
  @js.native
  trait Dispatcher[V, O] extends js.Object {
    var _handleEvent: js.UndefOr[EventSink[V]] = js.native
    @JSName("_subscribe")
    var _subscribe_Original: Subscribe[V] = js.native
    var ended: Boolean = js.native
    var observable: O = js.native
    var prevError: js.Any = js.native
    var pushing: Boolean = js.native
    var queue: js.Array[Event[V]] = js.native
    var subscriptions: js.Array[Subscription[V]] = js.native
    var unsubSrc: js.UndefOr[Unsub] = js.native
    def _subscribe(arg: EventSink[V]): Unsub = js.native
    def handleEvent(event: Event[V]): js.Any = js.native
    def hasSubscribers(): Boolean = js.native
    def inspect(): js.Any = js.native
    def push(event: Event[V]): js.Any = js.native
    def pushIt(event: Event[V]): js.UndefOr[Reply] = js.native
    def pushToSubscriptions(event: Event[V]): Boolean = js.native
    def removeSub(subscription: Subscription[V]): js.Array[Subscription[V]] = js.native
    def subscribe(sink: EventSink[V]): js.Function0[Unit] = js.native
    def unsubscribeFromSource(): Unit = js.native
  }
  
  @js.native
  trait Subscription[V] extends js.Object {
    @JSName("sink")
    var sink_Original: EventSink[V] = js.native
    def sink(event: Event[V]): Reply = js.native
  }
  
  @js.native
  class default[V, O] protected () extends Dispatcher[V, O] {
    def this(observable: O, _subscribe: Subscribe[V]) = this()
    def this(observable: O, _subscribe: Subscribe[V], _handleEvent: EventSink[V]) = this()
  }
  
}

