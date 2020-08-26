package typings.bullBoard.mod

import typings.bull.mod.Queue
import typings.bull.mod.QueueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQueue extends js.Object {
  def add(name: String, opts: QueueOptions): Queue[_] = js.native
}

object CreateQueue {
  @scala.inline
  def apply(add: (String, QueueOptions) => Queue[_]): CreateQueue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
    __obj.asInstanceOf[CreateQueue]
  }
  @scala.inline
  implicit class CreateQueueOps[Self <: CreateQueue] (val x: Self) extends AnyVal {
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
    def setAdd(value: (String, QueueOptions) => Queue[_]): Self = this.set("add", js.Any.fromFunction2(value))
  }
  
}

