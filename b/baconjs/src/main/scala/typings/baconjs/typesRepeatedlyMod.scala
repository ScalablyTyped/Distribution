package typings.baconjs

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/repeatedly", JSImport.Namespace)
@js.native
object typesRepeatedlyMod extends js.Object {
  def default[V](delay: Double, values: js.Array[V | Event[V]]): EventStream[V] = js.native
}

