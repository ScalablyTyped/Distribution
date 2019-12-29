package typings.baconjs.baconjsMod

import typings.baconjs.typesWhenMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "when")
@js.native
object when extends js.Object {
  def apply[O](patterns: Pattern[O]*): typings.baconjs.typesObservableMod.EventStream[O] = js.native
}

