package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveNotificationChannelRequest extends StObject {
  
  /**
    *  The ID of the notification channel to be removed. 
    */
  var Id: NotificationChannelId
}
object RemoveNotificationChannelRequest {
  
  inline def apply(Id: NotificationChannelId): RemoveNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNotificationChannelRequest]
  }
  
  extension [Self <: RemoveNotificationChannelRequest](x: Self) {
    
    inline def setId(value: NotificationChannelId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
