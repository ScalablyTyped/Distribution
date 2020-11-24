package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPushTemplateResponse extends js.Object {
  
  var PushNotificationTemplateResponse: typings.awsSdk.pinpointMod.PushNotificationTemplateResponse = js.native
}
object GetPushTemplateResponse {
  
  @scala.inline
  def apply(PushNotificationTemplateResponse: PushNotificationTemplateResponse): GetPushTemplateResponse = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateResponse = PushNotificationTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPushTemplateResponse]
  }
  
  @scala.inline
  implicit class GetPushTemplateResponseOps[Self <: GetPushTemplateResponse] (val x: Self) extends AnyVal {
    
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
    def setPushNotificationTemplateResponse(value: PushNotificationTemplateResponse): Self = this.set("PushNotificationTemplateResponse", value.asInstanceOf[js.Any])
  }
}
