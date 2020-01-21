package typings.baconjs.mod

import typings.baconjs.frombinderMod.Binder
import typings.baconjs.frombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromBinder")
@js.native
object fromBinder extends js.Object {
  def apply[V](binder: Binder[V]): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](binder: Binder[V], eventTransformer: EventTransformer[V]): typings.baconjs.observableMod.EventStream[V] = js.native
}

