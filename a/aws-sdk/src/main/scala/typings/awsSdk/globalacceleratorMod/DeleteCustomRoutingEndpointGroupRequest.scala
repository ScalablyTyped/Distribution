package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomRoutingEndpointGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to delete.
    */
  var EndpointGroupArn: GenericString
}
object DeleteCustomRoutingEndpointGroupRequest {
  
  inline def apply(EndpointGroupArn: GenericString): DeleteCustomRoutingEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomRoutingEndpointGroupRequest]
  }
  
  extension [Self <: DeleteCustomRoutingEndpointGroupRequest](x: Self) {
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
  }
}
