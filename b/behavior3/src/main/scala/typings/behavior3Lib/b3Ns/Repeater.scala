package typings
package behavior3Lib.b3Ns

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
class Repeater () extends Decorator {
  /**
           * Creates an instance of MaxTime.
           *
           * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
           * - **child** (*BaseNode*) The child node.
           *
           */
  def this(hasMaxLoopChild: behavior3Lib.Anon_MaxLoop) = this()
}

