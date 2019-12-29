package typings.baconjs.baconjsMod

import typings.baconjs.typesFrombinderMod.EventTransformer
import typings.baconjs.typesFromeventMod.EventSourceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[V](target: js.Any, eventSource: String): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

