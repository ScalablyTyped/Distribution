package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerGatewayAssociationsRequest extends StObject {
  
  /**
    * One or more customer gateway Amazon Resource Names (ARNs). For more information, see Resources Defined by Amazon EC2. The maximum is 10.
    */
  var CustomerGatewayArns: js.UndefOr[StringList] = js.undefined
  
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
}
object GetCustomerGatewayAssociationsRequest {
  
  inline def apply(GlobalNetworkId: String): GetCustomerGatewayAssociationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerGatewayAssociationsRequest]
  }
  
  extension [Self <: GetCustomerGatewayAssociationsRequest](x: Self) {
    
    inline def setCustomerGatewayArns(value: StringList): Self = StObject.set(x, "CustomerGatewayArns", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayArnsUndefined: Self = StObject.set(x, "CustomerGatewayArns", js.undefined)
    
    inline def setCustomerGatewayArnsVarargs(value: String*): Self = StObject.set(x, "CustomerGatewayArns", js.Array(value :_*))
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
