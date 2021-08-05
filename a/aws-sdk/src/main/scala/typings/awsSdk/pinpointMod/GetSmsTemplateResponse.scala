package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSmsTemplateResponse extends StObject {
  
  var SMSTemplateResponse: typings.awsSdk.pinpointMod.SMSTemplateResponse
}
object GetSmsTemplateResponse {
  
  inline def apply(SMSTemplateResponse: SMSTemplateResponse): GetSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(SMSTemplateResponse = SMSTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsTemplateResponse]
  }
  
  extension [Self <: GetSmsTemplateResponse](x: Self) {
    
    inline def setSMSTemplateResponse(value: SMSTemplateResponse): Self = StObject.set(x, "SMSTemplateResponse", value.asInstanceOf[js.Any])
  }
}
