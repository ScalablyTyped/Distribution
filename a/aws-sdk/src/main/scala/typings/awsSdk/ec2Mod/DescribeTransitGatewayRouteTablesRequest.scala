package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayRouteTablesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. The possible values are:    default-association-route-table - Indicates whether this is the default association route table for the transit gateway (true | false).    default-propagation-route-table - Indicates whether this is the default propagation route table for the transit gateway (true | false).    state - The state of the route table (available | deleting | deleted | pending).    transit-gateway-id - The ID of the transit gateway.    transit-gateway-route-table-id - The ID of the transit gateway route table.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the transit gateway route tables.
    */
  var TransitGatewayRouteTableIds: js.UndefOr[TransitGatewayRouteTableIdStringList] = js.undefined
}
object DescribeTransitGatewayRouteTablesRequest {
  
  inline def apply(): DescribeTransitGatewayRouteTablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayRouteTablesRequest]
  }
  
  extension [Self <: DescribeTransitGatewayRouteTablesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayRouteTableIds(value: TransitGatewayRouteTableIdStringList): Self = StObject.set(x, "TransitGatewayRouteTableIds", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableIdsUndefined: Self = StObject.set(x, "TransitGatewayRouteTableIds", js.undefined)
    
    inline def setTransitGatewayRouteTableIdsVarargs(value: TransitGatewayRouteTableId*): Self = StObject.set(x, "TransitGatewayRouteTableIds", js.Array(value :_*))
  }
}
