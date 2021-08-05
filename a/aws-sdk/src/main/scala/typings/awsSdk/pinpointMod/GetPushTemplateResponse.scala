package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPushTemplateResponse extends StObject {
  
  var PushNotificationTemplateResponse: typings.awsSdk.pinpointMod.PushNotificationTemplateResponse
}
object GetPushTemplateResponse {
  
  inline def apply(PushNotificationTemplateResponse: PushNotificationTemplateResponse): GetPushTemplateResponse = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateResponse = PushNotificationTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPushTemplateResponse]
  }
  
  extension [Self <: GetPushTemplateResponse](x: Self) {
    
    inline def setPushNotificationTemplateResponse(value: PushNotificationTemplateResponse): Self = StObject.set(x, "PushNotificationTemplateResponse", value.asInstanceOf[js.Any])
  }
}
