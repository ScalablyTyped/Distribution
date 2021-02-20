package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTransitGatewayRegistrationsRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.networkmanagerMod.MaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of one or more transit gateways. The maximum is 10.
    */
  var TransitGatewayArns: js.UndefOr[StringList] = js.native
}
object GetTransitGatewayRegistrationsRequest {
  
  @scala.inline
  def apply(GlobalNetworkId: String): GetTransitGatewayRegistrationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayRegistrationsRequest]
  }
  
  @scala.inline
  implicit class GetTransitGatewayRegistrationsRequestMutableBuilder[Self <: GetTransitGatewayRegistrationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayArns(value: StringList): Self = StObject.set(x, "TransitGatewayArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayArnsUndefined: Self = StObject.set(x, "TransitGatewayArns", js.undefined)
    
    @scala.inline
    def setTransitGatewayArnsVarargs(value: String*): Self = StObject.set(x, "TransitGatewayArns", js.Array(value :_*))
  }
}
