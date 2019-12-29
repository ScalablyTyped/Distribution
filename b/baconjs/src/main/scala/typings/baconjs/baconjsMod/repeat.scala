package typings.baconjs.baconjsMod

import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "repeat")
@js.native
object repeat extends js.Object {
  def apply[V](generator: js.Function1[/* iteration */ Double, js.UndefOr[default[V]]]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

