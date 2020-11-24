package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateQueueMessagesOptions extends TimeoutIntervalOptions {
  
  var messagetext: js.UndefOr[String] = js.native
}
object UpdateQueueMessagesOptions {
  
  @scala.inline
  def apply(): UpdateQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQueueMessagesOptions]
  }
  
  @scala.inline
  implicit class UpdateQueueMessagesOptionsOps[Self <: UpdateQueueMessagesOptions] (val x: Self) extends AnyVal {
    
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
    def setMessagetext(value: String): Self = this.set("messagetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagetext: Self = this.set("messagetext", js.undefined)
  }
}
