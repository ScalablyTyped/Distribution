package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInAppTemplateResponse extends StObject {
  
  var InAppTemplateResponse: typings.awsSdk.pinpointMod.InAppTemplateResponse
}
object GetInAppTemplateResponse {
  
  inline def apply(InAppTemplateResponse: InAppTemplateResponse): GetInAppTemplateResponse = {
    val __obj = js.Dynamic.literal(InAppTemplateResponse = InAppTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInAppTemplateResponse]
  }
  
  extension [Self <: GetInAppTemplateResponse](x: Self) {
    
    inline def setInAppTemplateResponse(value: InAppTemplateResponse): Self = StObject.set(x, "InAppTemplateResponse", value.asInstanceOf[js.Any])
  }
}
