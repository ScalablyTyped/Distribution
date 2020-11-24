package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class CreateVoiceTemplateRequestOps[Self <: CreateVoiceTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setTemplateName(value: string): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceTemplateRequest(value: VoiceTemplateRequest): Self = this.set("VoiceTemplateRequest", value.asInstanceOf[js.Any])
  }
}
