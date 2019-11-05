package typings.baconjs

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Sink
import typings.baconjs.typesTypesMod.VoidSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/types", JSImport.Namespace)
@js.native
object typesTypesMod extends js.Object {
  val nullSink: Sink[js.Any] = js.native
  val nullVoidSink: VoidSink = js.native
  type EventSink[V] = js.Function1[/* event */ Event[V], Reply]
  type EventStreamDelay[V] = js.Function1[/* stream */ EventStream[V], EventStream[V]]
  type Function0[R] = js.Function0[R]
  type Function1[T1, R] = js.Function1[/* t1 */ T1, R]
  type Function2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  type Sink[V] = js.Function1[/* value */ V, Reply]
  type Subscribe[T] = js.Function1[/* arg */ EventSink[T], js.Any]
  type Unsub = js.Function0[Unit]
  type VoidSink = js.Function0[Reply]
}

