package typings.behavior3.b3

import typings.behavior3.AnonChildMaxTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The MaxTime decorator limits the maximum time the node child can execute.
  * Notice that it does not interrupt the execution itself (i.e., the child
  * must be non-preemptive), it only interrupts the node after a `RUNNING`
  * status.
  *
  */
@JSGlobal("b3.MaxTime")
@js.native
/**
  * Creates an instance of MaxTime.
  *
  * - **maxTime** (*Integer*) Maximum time a child can execute.
  * - **child** (*BaseNode*) The child node.
  *
  */
class MaxTime () extends Decorator {
  def this(hasMaxTimeChild: AnonChildMaxTime) = this()
}

