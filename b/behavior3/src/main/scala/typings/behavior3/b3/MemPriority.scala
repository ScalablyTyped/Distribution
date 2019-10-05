package typings.behavior3.b3

import typings.behavior3.Anon_ChildrenArray
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
/**
  * Creates an instance of MemPriority.
  */
class MemPriority () extends Composite {
  def this(hasChildren: Anon_ChildrenArray) = this()
}

