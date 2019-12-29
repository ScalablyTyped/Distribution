package typings.baconjs.baconjsMod

import typings.baconjs.typesFrompollMod.PollFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPoll")
@js.native
object fromPoll extends js.Object {
  def apply[V](delay: Double, poll: PollFunction[V]): typings.baconjs.typesObservableMod.EventStream[V] = js.native
}

