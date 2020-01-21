package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "later")
@js.native
object later extends js.Object {
  def apply[V](delay: Double, value: V): typings.baconjs.observableMod.EventStream[V] = js.native
}

