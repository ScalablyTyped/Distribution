package typings
package behavior3Lib.b3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Sequence node ticks its children sequentially until one of them
     * returns `FAILURE`, `RUNNING` or `ERROR`. If all children return the
     * success state, the sequence also returns `SUCCESS`.
     *
     */
@JSGlobal("b3.Sequence")
@js.native
class Sequence () extends Composite {
  /**
           * Creates an instance of Sequence.
           */
  def this(hasChildren: behavior3Lib.Anon_ChildrenArray) = this()
}

