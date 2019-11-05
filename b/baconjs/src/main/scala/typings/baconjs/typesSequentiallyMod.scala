package typings.baconjs

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/sequentially", JSImport.Namespace)
@js.native
object typesSequentiallyMod extends js.Object {
  def default[V](delay: Double, values: js.Array[V | Event[V]]): EventStream[V] = js.native
}

