package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClientVpnTargetNetworksRequest extends StObject {
  
  /**
    * The IDs of the target network associations.
    */
  var AssociationIds: js.UndefOr[ValueStringList] = js.native
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. Filter names and values are case-sensitive.    association-id - The ID of the association.    target-network-id - The ID of the subnet specified as the target network.    vpc-id - The ID of the VPC in which the target network is located.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeClientVpnTargetNetworksMaxResults] = js.native
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeClientVpnTargetNetworksRequest {
  
  @scala.inline
  def apply(ClientVpnEndpointId: ClientVpnEndpointId): DescribeClientVpnTargetNetworksRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientVpnTargetNetworksRequest]
  }
  
  @scala.inline
  implicit class DescribeClientVpnTargetNetworksRequestMutableBuilder[Self <: DescribeClientVpnTargetNetworksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationIds(value: ValueStringList): Self = StObject.set(x, "AssociationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdsUndefined: Self = StObject.set(x, "AssociationIds", js.undefined)
    
    @scala.inline
    def setAssociationIdsVarargs(value: String*): Self = StObject.set(x, "AssociationIds", js.Array(value :_*))
    
    @scala.inline
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: DescribeClientVpnTargetNetworksMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
