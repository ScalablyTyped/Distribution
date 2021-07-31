package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsChannelRequest extends StObject {
  
  var APNSChannelRequest: typings.awsSdk.pinpointMod.APNSChannelRequest
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
}
object UpdateApnsChannelRequest {
  
  @scala.inline
  def apply(APNSChannelRequest: APNSChannelRequest, ApplicationId: string): UpdateApnsChannelRequest = {
    val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateApnsChannelRequestMutableBuilder[Self <: UpdateApnsChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPNSChannelRequest(value: APNSChannelRequest): Self = StObject.set(x, "APNSChannelRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
