package typings.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromCallback")
@js.native
object fromCallback extends js.Object {
  def apply[V](f: js.Function, args: js.Any*): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

