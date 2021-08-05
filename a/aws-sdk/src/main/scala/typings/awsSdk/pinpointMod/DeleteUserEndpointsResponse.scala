package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserEndpointsResponse extends StObject {
  
  var EndpointsResponse: typings.awsSdk.pinpointMod.EndpointsResponse
}
object DeleteUserEndpointsResponse {
  
  inline def apply(EndpointsResponse: EndpointsResponse): DeleteUserEndpointsResponse = {
    val __obj = js.Dynamic.literal(EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserEndpointsResponse]
  }
  
  extension [Self <: DeleteUserEndpointsResponse](x: Self) {
    
    inline def setEndpointsResponse(value: EndpointsResponse): Self = StObject.set(x, "EndpointsResponse", value.asInstanceOf[js.Any])
  }
}
