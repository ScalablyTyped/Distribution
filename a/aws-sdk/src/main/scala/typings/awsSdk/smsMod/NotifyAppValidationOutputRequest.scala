package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyAppValidationOutputRequest extends js.Object {
  
  /**
    * The ID of the application.
    */
  var appId: AppIdWithValidation = js.native
  
  /**
    * The notification information.
    */
  var notificationContext: js.UndefOr[NotificationContext] = js.native
}
object NotifyAppValidationOutputRequest {
  
  @scala.inline
  def apply(appId: AppIdWithValidation): NotifyAppValidationOutputRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyAppValidationOutputRequest]
  }
  
  @scala.inline
  implicit class NotifyAppValidationOutputRequestOps[Self <: NotifyAppValidationOutputRequest] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: AppIdWithValidation): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationContext(value: NotificationContext): Self = this.set("notificationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationContext: Self = this.set("notificationContext", js.undefined)
  }
}
