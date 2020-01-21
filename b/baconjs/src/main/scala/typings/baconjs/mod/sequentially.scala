package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "sequentially")
@js.native
object sequentially extends js.Object {
  def apply[V](delay: Double, values: js.Array[V | typings.baconjs.eventMod.Event[V]]): typings.baconjs.observableMod.EventStream[V] = js.native
}

