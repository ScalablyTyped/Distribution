package typings.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromNodeCallback")
@js.native
object fromNodeCallback extends js.Object {
  def apply[V](f: js.Function, args: js.Any*): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

