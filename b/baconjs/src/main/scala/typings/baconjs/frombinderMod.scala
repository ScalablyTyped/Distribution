package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/frombinder", JSImport.Namespace)
@js.native
object frombinderMod extends js.Object {
  def default[V](binder: Binder[V]): EventStream[V] = js.native
  def default[V](binder: Binder[V], eventTransformer: EventTransformer[V]): EventStream[V] = js.native
  type Binder[V] = js.Function1[/* sink */ FlexibleSink[V], Unsub]
  type EventLike[V] = V | Event[V] | js.Array[Event[V]]
  type EventTransformer[V] = js.Function1[/* repeated */ js.Any, EventLike[V]]
  type FlexibleSink[V] = js.Function1[/* event */ EventLike[V], Reply]
}

