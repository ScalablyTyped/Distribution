package typings.behavior3.b3Ns

import typings.behavior3.Anon_ChildMaxLoopBaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Repeater is a decorator that repeats the tick signal until the child node
  * return `RUNNING` or `ERROR`. Optionally, a maximum number of repetitions
  * can be defined.
  *
  */
@JSGlobal("b3.Repeater")
@js.native
/**
  * Creates an instance of MaxTime.
  *
  * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
  * - **child** (*BaseNode*) The child node.
  *
  */
class Repeater () extends Decorator {
  def this(hasMaxLoopChild: Anon_ChildMaxLoopBaseNode) = this()
}

