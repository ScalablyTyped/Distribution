package typings.baconjs.mod

import typings.baconjs.frombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[V](promise: js.Promise[V]): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typings.baconjs.observableMod.EventStream[V] = js.native
}

