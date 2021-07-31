package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsVoipChannelRequest extends StObject {
  
  var APNSVoipChannelRequest: typings.awsSdk.pinpointMod.APNSVoipChannelRequest
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
}
object UpdateApnsVoipChannelRequest {
  
  @scala.inline
  def apply(APNSVoipChannelRequest: APNSVoipChannelRequest, ApplicationId: string): UpdateApnsVoipChannelRequest = {
    val __obj = js.Dynamic.literal(APNSVoipChannelRequest = APNSVoipChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateApnsVoipChannelRequestMutableBuilder[Self <: UpdateApnsVoipChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSVoipChannelRequest(value: APNSVoipChannelRequest): Self = StObject.set(x, "APNSVoipChannelRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
