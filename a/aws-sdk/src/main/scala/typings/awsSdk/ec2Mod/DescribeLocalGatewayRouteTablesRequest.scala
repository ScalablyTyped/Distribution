package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocalGatewayRouteTablesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    local-gateway-id - The ID of a local gateway.    local-gateway-route-table-id - The ID of a local gateway route table.    outpost-arn - The Amazon Resource Name (ARN) of the Outpost.    state - The state of the local gateway route table.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The IDs of the local gateway route tables.
    */
  var LocalGatewayRouteTableIds: js.UndefOr[LocalGatewayRouteTableIdSet] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeLocalGatewayRouteTablesRequest {
  
  @scala.inline
  def apply(): DescribeLocalGatewayRouteTablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayRouteTablesRequest]
  }
  
  @scala.inline
  implicit class DescribeLocalGatewayRouteTablesRequestMutableBuilder[Self <: DescribeLocalGatewayRouteTablesRequest] (val x: Self) extends AnyVal {
    
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
    def setLocalGatewayRouteTableIds(value: LocalGatewayRouteTableIdSet): Self = StObject.set(x, "LocalGatewayRouteTableIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayRouteTableIdsUndefined: Self = StObject.set(x, "LocalGatewayRouteTableIds", js.undefined)
    
    @scala.inline
    def setLocalGatewayRouteTableIdsVarargs(value: LocalGatewayRoutetableId*): Self = StObject.set(x, "LocalGatewayRouteTableIds", js.Array(value :_*))
    
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
