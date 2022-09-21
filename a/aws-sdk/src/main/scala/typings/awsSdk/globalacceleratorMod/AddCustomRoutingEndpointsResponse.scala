package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomRoutingEndpointsResponse extends StObject {
  
  /**
    * The endpoint objects added to the custom routing accelerator.
    */
  var EndpointDescriptions: js.UndefOr[CustomRoutingEndpointDescriptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group for the custom routing endpoint.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.undefined
}
object AddCustomRoutingEndpointsResponse {
  
  inline def apply(): AddCustomRoutingEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddCustomRoutingEndpointsResponse]
  }
  
  extension [Self <: AddCustomRoutingEndpointsResponse](x: Self) {
    
    inline def setEndpointDescriptions(value: CustomRoutingEndpointDescriptions): Self = StObject.set(x, "EndpointDescriptions", value.asInstanceOf[js.Any])
    
    inline def setEndpointDescriptionsUndefined: Self = StObject.set(x, "EndpointDescriptions", js.undefined)
    
    inline def setEndpointDescriptionsVarargs(value: CustomRoutingEndpointDescription*): Self = StObject.set(x, "EndpointDescriptions", js.Array(value*))
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupArnUndefined: Self = StObject.set(x, "EndpointGroupArn", js.undefined)
  }
}
