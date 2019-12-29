package typings.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "try")
@js.native
object `try` extends js.Object {
  def apply[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, typings.baconjs.typesObservableMod.EventStream[Out]] = js.native
}

