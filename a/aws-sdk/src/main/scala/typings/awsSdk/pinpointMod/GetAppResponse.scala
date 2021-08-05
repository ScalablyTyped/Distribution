package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppResponse extends StObject {
  
  var ApplicationResponse: typings.awsSdk.pinpointMod.ApplicationResponse
}
object GetAppResponse {
  
  inline def apply(ApplicationResponse: ApplicationResponse): GetAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppResponse]
  }
  
  extension [Self <: GetAppResponse](x: Self) {
    
    inline def setApplicationResponse(value: ApplicationResponse): Self = StObject.set(x, "ApplicationResponse", value.asInstanceOf[js.Any])
  }
}
