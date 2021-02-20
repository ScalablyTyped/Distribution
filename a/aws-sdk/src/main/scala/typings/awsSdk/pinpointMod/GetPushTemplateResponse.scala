package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPushTemplateResponse extends StObject {
  
  var PushNotificationTemplateResponse: typings.awsSdk.pinpointMod.PushNotificationTemplateResponse = js.native
}
object GetPushTemplateResponse {
  
  @scala.inline
  def apply(PushNotificationTemplateResponse: PushNotificationTemplateResponse): GetPushTemplateResponse = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateResponse = PushNotificationTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPushTemplateResponse]
  }
  
  @scala.inline
  implicit class GetPushTemplateResponseMutableBuilder[Self <: GetPushTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushNotificationTemplateResponse(value: PushNotificationTemplateResponse): Self = StObject.set(x, "PushNotificationTemplateResponse", value.asInstanceOf[js.Any])
  }
}
