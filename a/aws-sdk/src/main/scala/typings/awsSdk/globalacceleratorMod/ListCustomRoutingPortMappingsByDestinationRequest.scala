package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomRoutingPortMappingsByDestinationRequest extends StObject {
  
  /**
    * The endpoint IP address in a virtual private cloud (VPC) subnet for which you want to receive back port mappings.
    */
  var DestinationAddress: GenericString
  
  /**
    * The ID for the virtual private cloud (VPC) subnet.
    */
  var EndpointId: GenericString
  
  /**
    * The number of destination port mappings that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[PortMappingsMaxResults] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListCustomRoutingPortMappingsByDestinationRequest {
  
  inline def apply(DestinationAddress: GenericString, EndpointId: GenericString): ListCustomRoutingPortMappingsByDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationAddress = DestinationAddress.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomRoutingPortMappingsByDestinationRequest]
  }
  
  extension [Self <: ListCustomRoutingPortMappingsByDestinationRequest](x: Self) {
    
    inline def setDestinationAddress(value: GenericString): Self = StObject.set(x, "DestinationAddress", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: GenericString): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: PortMappingsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
