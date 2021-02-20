package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateNotificationSettingsRequest extends StObject {
  
  /**
    *  Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification. You must specify either the Notification parameter or the Active parameter for the call to UpdateNotificationSettings to succeed. 
    */
  var Active: js.UndefOr[Boolean] = js.native
  
  /**
    *  The ID of the HIT type whose notification specification is being updated. 
    */
  var HITTypeId: EntityId = js.native
  
  /**
    *  The notification specification for the HIT type. 
    */
  var Notification: js.UndefOr[NotificationSpecification] = js.native
}
object UpdateNotificationSettingsRequest {
  
  @scala.inline
  def apply(HITTypeId: EntityId): UpdateNotificationSettingsRequest = {
    val __obj = js.Dynamic.literal(HITTypeId = HITTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateNotificationSettingsRequestMutableBuilder[Self <: UpdateNotificationSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setHITTypeId(value: EntityId): Self = StObject.set(x, "HITTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: NotificationSpecification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
  }
}
