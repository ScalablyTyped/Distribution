package typings.baconjs.mod

import typings.baconjs.frombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "fromPromise")
@js.native
object fromPromise extends js.Object {
  
  def apply[V](promise: js.Promise[V]): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: js.UndefOr[scala.Nothing], eventTransformer: EventTransformer[V]): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typings.baconjs.observableMod.EventStream[V] = js.native
}
