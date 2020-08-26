package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePushTemplateRequest extends js.Object {
  var PushNotificationTemplateRequest: typings.awsSdk.pinpointMod.PushNotificationTemplateRequest = js.native
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string = js.native
}

object CreatePushTemplateRequest {
  @scala.inline
  def apply(PushNotificationTemplateRequest: PushNotificationTemplateRequest, TemplateName: string): CreatePushTemplateRequest = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateRequest = PushNotificationTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePushTemplateRequest]
  }
  @scala.inline
  implicit class CreatePushTemplateRequestOps[Self <: CreatePushTemplateRequest] (val x: Self) extends AnyVal {
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
    def setPushNotificationTemplateRequest(value: PushNotificationTemplateRequest): Self = this.set("PushNotificationTemplateRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateName(value: string): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
  }
  
}

