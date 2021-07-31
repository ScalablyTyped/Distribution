package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsVoipSandboxChannelResponse extends StObject {
  
  var APNSVoipSandboxChannelResponse: typings.awsSdk.pinpointMod.APNSVoipSandboxChannelResponse
}
object UpdateApnsVoipSandboxChannelResponse {
  
  @scala.inline
  def apply(APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse): UpdateApnsVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelResponse]
  }
  
  @scala.inline
  implicit class UpdateApnsVoipSandboxChannelResponseMutableBuilder[Self <: UpdateApnsVoipSandboxChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSVoipSandboxChannelResponse(value: APNSVoipSandboxChannelResponse): Self = StObject.set(x, "APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
}
