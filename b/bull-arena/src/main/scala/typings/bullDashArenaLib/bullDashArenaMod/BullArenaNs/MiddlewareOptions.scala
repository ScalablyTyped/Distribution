package typings
package bullDashArenaLib.bullDashArenaMod.BullArenaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var queues: js.Array[QueueOptions with ConnectionOptions]
}

object MiddlewareOptions {
  @scala.inline
  def apply(queues: js.Array[QueueOptions with ConnectionOptions]): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(queues = queues)
  
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

