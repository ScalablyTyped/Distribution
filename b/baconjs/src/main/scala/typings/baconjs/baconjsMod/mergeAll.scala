package typings.baconjs.baconjsMod

import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "mergeAll")
@js.native
object mergeAll extends js.Object {
  def apply[V](streams: (default[V] | js.Array[default[V]])*): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

