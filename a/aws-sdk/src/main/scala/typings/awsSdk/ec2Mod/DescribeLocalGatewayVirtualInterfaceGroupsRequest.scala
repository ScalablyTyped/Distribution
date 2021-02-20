package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocalGatewayVirtualInterfaceGroupsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    local-gateway-id - The ID of a local gateway.    local-gateway-virtual-interface-id - The ID of the virtual interface.    local-gateway-virtual-interface-group-id - The ID of the virtual interface group.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The IDs of the virtual interface groups.
    */
  var LocalGatewayVirtualInterfaceGroupIds: js.UndefOr[LocalGatewayVirtualInterfaceGroupIdSet] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeLocalGatewayVirtualInterfaceGroupsRequest {
  
  @scala.inline
  def apply(): DescribeLocalGatewayVirtualInterfaceGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfaceGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeLocalGatewayVirtualInterfaceGroupsRequestMutableBuilder[Self <: DescribeLocalGatewayVirtualInterfaceGroupsRequest] (val x: Self) extends AnyVal {
    
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
    def setLocalGatewayVirtualInterfaceGroupIds(value: LocalGatewayVirtualInterfaceGroupIdSet): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupIdsUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupIds", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupIdsVarargs(value: LocalGatewayVirtualInterfaceGroupId*): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: LocalGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
