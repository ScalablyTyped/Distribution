package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendOTPMessageRequest extends StObject {
  
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: string
  
  var SendOTPMessageRequestParameters: typings.awsSdk.pinpointMod.SendOTPMessageRequestParameters
}
object SendOTPMessageRequest {
  
  inline def apply(ApplicationId: string, SendOTPMessageRequestParameters: SendOTPMessageRequestParameters): SendOTPMessageRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendOTPMessageRequestParameters = SendOTPMessageRequestParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOTPMessageRequest]
  }
  
  extension [Self <: SendOTPMessageRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSendOTPMessageRequestParameters(value: SendOTPMessageRequestParameters): Self = StObject.set(x, "SendOTPMessageRequestParameters", value.asInstanceOf[js.Any])
  }
}
