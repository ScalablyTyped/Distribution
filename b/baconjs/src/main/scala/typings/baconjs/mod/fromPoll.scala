package typings.baconjs.mod

import typings.baconjs.frompollMod.PollFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "fromPoll")
@js.native
object fromPoll extends js.Object {
  
  def apply[V](delay: Double, poll: PollFunction[V]): typings.baconjs.observableMod.EventStream[V] = js.native
}
