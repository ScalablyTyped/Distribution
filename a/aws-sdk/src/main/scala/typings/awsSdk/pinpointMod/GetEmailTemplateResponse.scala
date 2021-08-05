package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEmailTemplateResponse extends StObject {
  
  var EmailTemplateResponse: typings.awsSdk.pinpointMod.EmailTemplateResponse
}
object GetEmailTemplateResponse {
  
  inline def apply(EmailTemplateResponse: EmailTemplateResponse): GetEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(EmailTemplateResponse = EmailTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailTemplateResponse]
  }
  
  extension [Self <: GetEmailTemplateResponse](x: Self) {
    
    inline def setEmailTemplateResponse(value: EmailTemplateResponse): Self = StObject.set(x, "EmailTemplateResponse", value.asInstanceOf[js.Any])
  }
}
