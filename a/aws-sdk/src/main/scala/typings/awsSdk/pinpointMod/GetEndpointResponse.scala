package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointResponse extends StObject {
  
  var EndpointResponse: typings.awsSdk.pinpointMod.EndpointResponse
}
object GetEndpointResponse {
  
  inline def apply(EndpointResponse: EndpointResponse): GetEndpointResponse = {
    val __obj = js.Dynamic.literal(EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointResponse]
  }
  
  extension [Self <: GetEndpointResponse](x: Self) {
    
    inline def setEndpointResponse(value: EndpointResponse): Self = StObject.set(x, "EndpointResponse", value.asInstanceOf[js.Any])
  }
}
