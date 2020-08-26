package typings.bullArena.mod.BullArena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareOptions extends js.Object {
  var queues: js.Array[QueueOptions with ConnectionOptions] = js.native
}

object MiddlewareOptions {
  @scala.inline
  def apply(queues: js.Array[QueueOptions with ConnectionOptions]): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
  @scala.inline
  implicit class MiddlewareOptionsOps[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueuesVarargs(value: (QueueOptions with ConnectionOptions)*): Self = this.set("queues", js.Array(value :_*))
    @scala.inline
    def setQueues(value: js.Array[QueueOptions with ConnectionOptions]): Self = this.set("queues", value.asInstanceOf[js.Any])
  }
  
}

