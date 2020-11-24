package typings.behavior3.global.b3

import typings.behavior3.anon.ChildMaxLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RepeatUntilFailure is a decorator that repeats the tick signal until the
  * node child returns `FAILURE`, `RUNNING` or `ERROR`. Optionally, a maximum
  * number of repetitions can be defined.
  *
  */
@JSGlobal("b3.RepeatUntilFailure")
@js.native
/**
  * Creates an instance of RepeatUntilFailure.
  *
  * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
  * - **child** (*BaseNode*) The child node.
  *
  */
class RepeatUntilFailure ()
  extends typings.behavior3.b3.RepeatUntilFailure {
  def this(hasMaxLoopChild: ChildMaxLoop) = this()
}
