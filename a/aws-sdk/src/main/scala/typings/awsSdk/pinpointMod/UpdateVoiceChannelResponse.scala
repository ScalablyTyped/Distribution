package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceChannelResponse extends StObject {
  
  var VoiceChannelResponse: typings.awsSdk.pinpointMod.VoiceChannelResponse
}
object UpdateVoiceChannelResponse {
  
  inline def apply(VoiceChannelResponse: VoiceChannelResponse): UpdateVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceChannelResponse]
  }
  
  extension [Self <: UpdateVoiceChannelResponse](x: Self) {
    
    inline def setVoiceChannelResponse(value: VoiceChannelResponse): Self = StObject.set(x, "VoiceChannelResponse", value.asInstanceOf[js.Any])
  }
}
