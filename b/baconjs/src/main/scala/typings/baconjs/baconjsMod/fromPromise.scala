package typings.baconjs.baconjsMod

import typings.baconjs.typesFrombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[V](promise: js.Promise[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

