package typings.bunnymq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consumer extends js.Object {
  
  /**
    * Handle messages from a named queue.
    *
    * @param queue A named queue.
    * @param callback A callback.
    */
  def consume[T](queue: String, callback: ConsumerCallback[T]): Unit = js.native
}
object Consumer {
  
  @scala.inline
  def apply(consume: (String, ConsumerCallback[js.Any]) => Unit): Consumer = {
    val __obj = js.Dynamic.literal(consume = js.Any.fromFunction2(consume))
    __obj.asInstanceOf[Consumer]
  }
  
  @scala.inline
  implicit class ConsumerOps[Self <: Consumer] (val x: Self) extends AnyVal {
    
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
    def setConsume(value: (String, ConsumerCallback[js.Any]) => Unit): Self = this.set("consume", js.Any.fromFunction2(value))
  }
}
