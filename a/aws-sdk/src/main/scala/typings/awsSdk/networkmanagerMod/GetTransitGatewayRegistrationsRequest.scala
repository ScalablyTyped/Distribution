package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayRegistrationsRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of one or more transit gateways. The maximum is 10.
    */
  var TransitGatewayArns: js.UndefOr[StringList] = js.undefined
}
object GetTransitGatewayRegistrationsRequest {
  
  inline def apply(GlobalNetworkId: String): GetTransitGatewayRegistrationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayRegistrationsRequest]
  }
  
  extension [Self <: GetTransitGatewayRegistrationsRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayArns(value: StringList): Self = StObject.set(x, "TransitGatewayArns", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayArnsUndefined: Self = StObject.set(x, "TransitGatewayArns", js.undefined)
    
    inline def setTransitGatewayArnsVarargs(value: String*): Self = StObject.set(x, "TransitGatewayArns", js.Array(value :_*))
  }
}
