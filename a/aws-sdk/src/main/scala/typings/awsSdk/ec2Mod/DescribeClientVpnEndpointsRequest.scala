package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClientVpnEndpointsRequest extends StObject {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointIds: js.UndefOr[ClientVpnEndpointIdList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. Filter names and values are case-sensitive.    endpoint-id - The ID of the Client VPN endpoint.    transport-protocol - The transport protocol (tcp | udp).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeClientVpnEndpointMaxResults] = js.native
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeClientVpnEndpointsRequest {
  
  @scala.inline
  def apply(): DescribeClientVpnEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnEndpointsRequest]
  }
  
  @scala.inline
  implicit class DescribeClientVpnEndpointsRequestMutableBuilder[Self <: DescribeClientVpnEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientVpnEndpointIds(value: ClientVpnEndpointIdList): Self = StObject.set(x, "ClientVpnEndpointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVpnEndpointIdsUndefined: Self = StObject.set(x, "ClientVpnEndpointIds", js.undefined)
    
    @scala.inline
    def setClientVpnEndpointIdsVarargs(value: ClientVpnEndpointId*): Self = StObject.set(x, "ClientVpnEndpointIds", js.Array(value :_*))
    
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
    def setMaxResults(value: DescribeClientVpnEndpointMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
