package typings.baconjs.baconjsMod

import typings.baconjs.typesFrombinderMod.Binder
import typings.baconjs.typesFrombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromBinder")
@js.native
object fromBinder extends js.Object {
  def apply[V](binder: Binder[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](binder: Binder[V], eventTransformer: EventTransformer[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

