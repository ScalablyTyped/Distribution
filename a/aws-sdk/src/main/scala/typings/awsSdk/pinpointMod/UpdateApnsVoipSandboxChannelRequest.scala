package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsVoipSandboxChannelRequest extends StObject {
  
  var APNSVoipSandboxChannelRequest: typings.awsSdk.pinpointMod.APNSVoipSandboxChannelRequest
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
}
object UpdateApnsVoipSandboxChannelRequest {
  
  @scala.inline
  def apply(APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest, ApplicationId: string): UpdateApnsVoipSandboxChannelRequest = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelRequest = APNSVoipSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateApnsVoipSandboxChannelRequestMutableBuilder[Self <: UpdateApnsVoipSandboxChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSVoipSandboxChannelRequest(value: APNSVoipSandboxChannelRequest): Self = StObject.set(x, "APNSVoipSandboxChannelRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
