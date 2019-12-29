package typings.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "sequentially")
@js.native
object sequentially extends js.Object {
  def apply[V](delay: Double, values: js.Array[V | typings.baconjs.typesEventMod.Event[V]]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

