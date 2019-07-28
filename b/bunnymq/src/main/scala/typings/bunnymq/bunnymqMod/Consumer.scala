package typings.bunnymq.bunnymqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer extends js.Object {
  /**
    * Handle messages from a named queue.
    *
    * @param queue A named queue.
    * @param callback A callback.
    */
  def consume[T](queue: String, callback: ConsumerCallback[T]): Unit
}

object Consumer {
  @scala.inline
  def apply(consume: (String, ConsumerCallback[js.Any]) => Unit): Consumer = {
    val __obj = js.Dynamic.literal(consume = js.Any.fromFunction2(consume))
  
    __obj.asInstanceOf[Consumer]
  }
}

