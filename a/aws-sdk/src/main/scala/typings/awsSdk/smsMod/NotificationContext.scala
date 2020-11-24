package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationContext extends js.Object {
  
  /**
    * The status of the validation.
    */
  var status: js.UndefOr[ValidationStatus] = js.native
  
  /**
    * The status message.
    */
  var statusMessage: js.UndefOr[ValidationStatusMessage] = js.native
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.native
}
object NotificationContext {
  
  @scala.inline
  def apply(): NotificationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationContext]
  }
  
  @scala.inline
  implicit class NotificationContextOps[Self <: NotificationContext] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: ValidationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: ValidationStatusMessage): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setValidationId(value: ValidationId): Self = this.set("validationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationId: Self = this.set("validationId", js.undefined)
  }
}
