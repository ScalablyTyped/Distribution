package typings
package behavior3Lib.b3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Priority ticks its children sequentially until one of them returns
     * `SUCCESS`, `RUNNING` or `ERROR`. If all children return the failure state,
     * the priority also returns `FAILURE`.
     *
     */
@JSGlobal("b3.Priority")
@js.native
class Priority () extends Composite {
  /**
           * Creates an instance of Priority.
           */
  def this(hasChildren: behavior3Lib.Anon_ChildrenArray) = this()
}

