package typings.behavior3.b3Ns

import typings.behavior3.Anon_ChildMaxLoopBaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RepeatUntilSuccess is a decorator that repeats the tick signal until the
  * node child returns `SUCCESS`, `RUNNING` or `ERROR`. Optionally, a maximum
  * number of repetitions can be defined.
  *
  */
@JSGlobal("b3.RepeatUntilSuccess")
@js.native
/**
  * Creates an instance of RepeatUntilSuccess.
  *
  * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
  * - **child** (*BaseNode*) The child node.
  *
  */
class RepeatUntilSuccess () extends Decorator {
  def this(hasMaxLoopChild: Anon_ChildMaxLoopBaseNode) = this()
}

