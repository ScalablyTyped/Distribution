package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAdmChannelRequest extends StObject {
  
  var ADMChannelRequest: typings.awsSdk.pinpointMod.ADMChannelRequest
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
}
object UpdateAdmChannelRequest {
  
  @scala.inline
  def apply(ADMChannelRequest: ADMChannelRequest, ApplicationId: string): UpdateAdmChannelRequest = {
    val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAdmChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateAdmChannelRequestMutableBuilder[Self <: UpdateAdmChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setADMChannelRequest(value: ADMChannelRequest): Self = StObject.set(x, "ADMChannelRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
