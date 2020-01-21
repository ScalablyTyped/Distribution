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
}

