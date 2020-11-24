package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiveQueueMessageOptions extends js.Object {
  
  var isPeekLock: js.UndefOr[Boolean] = js.native
  
  var timeoutIntervalInS: js.UndefOr[Double] = js.native
}
object ReceiveQueueMessageOptions {
  
  @scala.inline
  def apply(): ReceiveQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiveQueueMessageOptions]
  }
  
  @scala.inline
  implicit class ReceiveQueueMessageOptionsOps[Self <: ReceiveQueueMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setIsPeekLock(value: Boolean): Self = this.set("isPeekLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPeekLock: Self = this.set("isPeekLock", js.undefined)
    
    @scala.inline
    def setTimeoutIntervalInS(value: Double): Self = this.set("timeoutIntervalInS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutIntervalInS: Self = this.set("timeoutIntervalInS", js.undefined)
  }
}
