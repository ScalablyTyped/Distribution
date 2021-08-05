package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  var endpoint: js.Any
  
  var endpointResource: js.Any
}
object Endpoint {
  
  inline def apply(endpoint: js.Any, endpointResource: js.Any): Endpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], endpointResource = endpointResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setEndpoint(value: js.Any): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointResource(value: js.Any): Self = StObject.set(x, "endpointResource", value.asInstanceOf[js.Any])
  }
}
