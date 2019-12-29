package typings.baconjs.baconjsMod

import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "concatAll")
@js.native
object concatAll extends js.Object {
  def apply[V](streams_ : (default[V] | js.Array[default[V]])*): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

