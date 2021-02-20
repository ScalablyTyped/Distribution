package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVoiceTemplateRequest extends StObject {
  
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
  implicit class CreateVoiceTemplateRequestMutableBuilder[Self <: CreateVoiceTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: string): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceTemplateRequest(value: VoiceTemplateRequest): Self = StObject.set(x, "VoiceTemplateRequest", value.asInstanceOf[js.Any])
  }
}
