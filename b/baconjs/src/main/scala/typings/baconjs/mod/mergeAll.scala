package typings.baconjs.mod

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "mergeAll")
@js.native
object mergeAll extends js.Object {
  def apply[V](streams: (default[V] | js.Array[default[V]])*): typings.baconjs.observableMod.EventStream[V] = js.native
}

