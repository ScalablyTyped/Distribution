package typings.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromArray")
@js.native
object fromArray extends js.Object {
  def apply[T](values: js.Array[T | typings.baconjs.typesEventMod.Event[T]]): typings.baconjs.typesObservableMod.EventStream[T] = js.native
}

