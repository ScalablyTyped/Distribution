package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNotificationSettingsRequest extends StObject {
  
  /**
    *  Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification. You must specify either the Notification parameter or the Active parameter for the call to UpdateNotificationSettings to succeed. 
    */
  var Active: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The ID of the HIT type whose notification specification is being updated. 
    */
  var HITTypeId: EntityId
  
  /**
    *  The notification specification for the HIT type. 
    */
  var Notification: js.UndefOr[NotificationSpecification] = js.undefined
}
object UpdateNotificationSettingsRequest {
  
  inline def apply(HITTypeId: EntityId): UpdateNotificationSettingsRequest = {
    val __obj = js.Dynamic.literal(HITTypeId = HITTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationSettingsRequest]
  }
  
  extension [Self <: UpdateNotificationSettingsRequest](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setHITTypeId(value: EntityId): Self = StObject.set(x, "HITTypeId", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: NotificationSpecification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
  }
}
