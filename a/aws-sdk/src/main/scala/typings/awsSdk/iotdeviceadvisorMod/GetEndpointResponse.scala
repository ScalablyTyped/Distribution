package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointResponse extends StObject {
  
  /**
    * The response of an Device Advisor endpoint.
    */
  var endpoint: js.UndefOr[Endpoint] = js.undefined
}
object GetEndpointResponse {
  
  inline def apply(): GetEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEndpointResponse]
  }
  
  extension [Self <: GetEndpointResponse](x: Self) {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
