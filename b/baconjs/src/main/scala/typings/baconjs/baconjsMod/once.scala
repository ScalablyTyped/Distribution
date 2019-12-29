package typings.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "once")
@js.native
object once extends js.Object {
  def apply[V](value: V): typings.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](value: typings.baconjs.typesEventMod.Event[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

