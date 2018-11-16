package typings
package behavior3Lib.b3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * MemPriority is similar to Priority node, but when a child returns a
     * `RUNNING` state, its index is recorded and in the next tick the,
     * MemPriority calls the child recorded directly, without calling previous
     * children again.
     *
     */
@JSGlobal("b3.MemPriority")
@js.native
class MemPriority () extends Composite {
  /**
           * Creates an instance of MemPriority.
           */
  def this(hasChildren: behavior3Lib.Anon_ChildrenArray) = this()
}

