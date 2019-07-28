package typings.behavior3.b3Ns

import typings.behavior3.Anon_ChildrenArray
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
/**
  * Creates an instance of Sequence.
  */
class Sequence () extends Composite {
  def this(hasChildren: Anon_ChildrenArray) = this()
}

