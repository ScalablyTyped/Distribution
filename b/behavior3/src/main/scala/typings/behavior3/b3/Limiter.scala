package typings.behavior3.b3

import typings.behavior3.AnonMaxLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This decorator limit the number of times its child can be called. After a
  * certain number of times, the Limiter decorator returns `FAILURE` without
  * executing the child.
  *
  */
@JSGlobal("b3.Limiter")
@js.native
/**
  * Creates an instance of Limiter.
  *
  * Settings parameters:
  *
  * - **maxLoop** (*Integer*) Maximum number of repetitions.
  * - **child** (*BaseNode*) The child node.
  *
  */
class Limiter () extends Decorator {
  def this(hasChildMaxLoop: AnonMaxLoop) = this()
}

