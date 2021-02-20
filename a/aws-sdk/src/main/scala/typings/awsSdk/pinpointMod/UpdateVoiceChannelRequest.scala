package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVoiceChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  
  var VoiceChannelRequest: typings.awsSdk.pinpointMod.VoiceChannelRequest = js.native
}
object UpdateVoiceChannelRequest {
  
  @scala.inline
  def apply(ApplicationId: string, VoiceChannelRequest: VoiceChannelRequest): UpdateVoiceChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], VoiceChannelRequest = VoiceChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateVoiceChannelRequestMutableBuilder[Self <: UpdateVoiceChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceChannelRequest(value: VoiceChannelRequest): Self = StObject.set(x, "VoiceChannelRequest", value.asInstanceOf[js.Any])
  }
}
