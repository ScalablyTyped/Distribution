package typings
package bunnymqLib.bunnymqMod

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
  def consume[T](queue: java.lang.String, callback: ConsumerCallback[T]): scala.Unit
}

object Consumer {
  @scala.inline
  def apply(consume: (java.lang.String, ConsumerCallback[js.Any]) => scala.Unit): Consumer = {
    val __obj = js.Dynamic.literal(consume = js.Any.fromFunction2(consume))
  
    __obj.asInstanceOf[Consumer]
  }
}

