package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceTemplateRequest extends js.Object {
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string = js.native
  var VoiceTemplateRequest: typings.awsSdk.pinpointMod.VoiceTemplateRequest = js.native
}

object CreateVoiceTemplateRequest {
  @scala.inline
  def apply(TemplateName: string, VoiceTemplateRequest: VoiceTemplateRequest): CreateVoiceTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any], VoiceTemplateRequest = VoiceTemplateRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateVoiceTemplateRequest]
  }
}

