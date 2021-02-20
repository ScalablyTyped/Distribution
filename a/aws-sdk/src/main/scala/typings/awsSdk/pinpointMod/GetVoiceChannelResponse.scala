package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceChannelResponse extends StObject {
  
  var VoiceChannelResponse: typings.awsSdk.pinpointMod.VoiceChannelResponse = js.native
}
object GetVoiceChannelResponse {
  
  @scala.inline
  def apply(VoiceChannelResponse: VoiceChannelResponse): GetVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceChannelResponse]
  }
  
  @scala.inline
  implicit class GetVoiceChannelResponseMutableBuilder[Self <: GetVoiceChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceChannelResponse(value: VoiceChannelResponse): Self = StObject.set(x, "VoiceChannelResponse", value.asInstanceOf[js.Any])
  }
}
