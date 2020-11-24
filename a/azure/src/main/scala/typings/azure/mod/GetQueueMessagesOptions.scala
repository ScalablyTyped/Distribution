package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQueueMessagesOptions extends PeekQueueMessagesOptions {
  
  var peekonly: js.UndefOr[Boolean] = js.native
  
  var visibilitytimeout: js.UndefOr[Double] = js.native
}
object GetQueueMessagesOptions {
  
  @scala.inline
  def apply(): GetQueueMessagesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueMessagesOptions]
  }
  
  @scala.inline
  implicit class GetQueueMessagesOptionsOps[Self <: GetQueueMessagesOptions] (val x: Self) extends AnyVal {
    
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
    def setPeekonly(value: Boolean): Self = this.set("peekonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeekonly: Self = this.set("peekonly", js.undefined)
    
    @scala.inline
    def setVisibilitytimeout(value: Double): Self = this.set("visibilitytimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilitytimeout: Self = this.set("visibilitytimeout", js.undefined)
  }
}
