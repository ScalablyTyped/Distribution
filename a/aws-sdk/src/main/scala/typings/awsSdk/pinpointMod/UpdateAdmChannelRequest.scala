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
  
  inline def apply(ADMChannelRequest: ADMChannelRequest, ApplicationId: string): UpdateAdmChannelRequest = {
    val __obj = js.Dynamic.literal(ADMChannelRequest = ADMChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAdmChannelRequest]
  }
  
  extension [Self <: UpdateAdmChannelRequest](x: Self) {
    
    inline def setADMChannelRequest(value: ADMChannelRequest): Self = StObject.set(x, "ADMChannelRequest", value.asInstanceOf[js.Any])
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
