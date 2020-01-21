package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "silence")
@js.native
object silence extends js.Object {
  def apply[V](duration: Double): typings.baconjs.observableMod.EventStream[V] = js.native
}

