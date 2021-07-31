package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSmsChannelRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var SMSChannelRequest: typings.awsSdk.pinpointMod.SMSChannelRequest
}
object UpdateSmsChannelRequest {
  
  @scala.inline
  def apply(ApplicationId: string, SMSChannelRequest: SMSChannelRequest): UpdateSmsChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SMSChannelRequest = SMSChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSmsChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateSmsChannelRequestMutableBuilder[Self <: UpdateSmsChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMSChannelRequest(value: SMSChannelRequest): Self = StObject.set(x, "SMSChannelRequest", value.asInstanceOf[js.Any])
  }
}
