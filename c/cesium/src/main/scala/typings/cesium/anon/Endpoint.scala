package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends StObject {
  
  var endpoint: js.Any = js.native
  
  var endpointResource: js.Any = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(endpoint: js.Any, endpointResource: js.Any): Endpoint = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], endpointResource = endpointResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: js.Any): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointResource(value: js.Any): Self = StObject.set(x, "endpointResource", value.asInstanceOf[js.Any])
  }
}
