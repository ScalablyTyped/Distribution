package typings.baconjs

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/fromarray", JSImport.Namespace)
@js.native
object typesFromarrayMod extends js.Object {
  def default[T](values: js.Array[T | Event[T]]): EventStream[T] = js.native
}

