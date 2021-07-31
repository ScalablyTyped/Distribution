package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceTemplateResponse extends StObject {
  
  var VoiceTemplateResponse: typings.awsSdk.pinpointMod.VoiceTemplateResponse
}
object GetVoiceTemplateResponse {
  
  @scala.inline
  def apply(VoiceTemplateResponse: VoiceTemplateResponse): GetVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(VoiceTemplateResponse = VoiceTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceTemplateResponse]
  }
  
  @scala.inline
  implicit class GetVoiceTemplateResponseMutableBuilder[Self <: GetVoiceTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceTemplateResponse(value: VoiceTemplateResponse): Self = StObject.set(x, "VoiceTemplateResponse", value.asInstanceOf[js.Any])
  }
}
