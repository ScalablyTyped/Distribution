package typings.bullBoard.mod

import typings.bull.mod.Queue
import typings.bull.mod.QueueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueue extends js.Object {
  def add(name: String, opts: QueueOptions): Queue[_]
}

object CreateQueue {
  @scala.inline
  def apply(add: (String, QueueOptions) => Queue[_]): CreateQueue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
  
    __obj.asInstanceOf[CreateQueue]
  }
}

