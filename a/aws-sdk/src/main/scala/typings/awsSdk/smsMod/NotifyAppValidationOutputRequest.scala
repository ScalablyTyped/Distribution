package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyAppValidationOutputRequest extends StObject {
  
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
  implicit class NotifyAppValidationOutputRequestMutableBuilder[Self <: NotifyAppValidationOutputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppIdWithValidation): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationContext(value: NotificationContext): Self = StObject.set(x, "notificationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationContextUndefined: Self = StObject.set(x, "notificationContext", js.undefined)
  }
}
