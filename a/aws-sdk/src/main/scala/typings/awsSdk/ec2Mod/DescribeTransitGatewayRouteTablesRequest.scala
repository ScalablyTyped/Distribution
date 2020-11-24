package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTransitGatewayRouteTablesRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. The possible values are:    default-association-route-table - Indicates whether this is the default association route table for the transit gateway (true | false).    default-propagation-route-table - Indicates whether this is the default propagation route table for the transit gateway (true | false).    state - The state of the route table (available | deleting | deleted | pending).    transit-gateway-id - The ID of the transit gateway.    transit-gateway-route-table-id - The ID of the transit gateway route table.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the transit gateway route tables.
    */
  var TransitGatewayRouteTableIds: js.UndefOr[TransitGatewayRouteTableIdStringList] = js.native
}
object DescribeTransitGatewayRouteTablesRequest {
  
  @scala.inline
  def apply(): DescribeTransitGatewayRouteTablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayRouteTablesRequest]
  }
  
  @scala.inline
  implicit class DescribeTransitGatewayRouteTablesRequestOps[Self <: DescribeTransitGatewayRouteTablesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: TransitGatewayMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTableIdsVarargs(value: TransitGatewayRouteTableId*): Self = this.set("TransitGatewayRouteTableIds", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayRouteTableIds(value: TransitGatewayRouteTableIdStringList): Self = this.set("TransitGatewayRouteTableIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayRouteTableIds: Self = this.set("TransitGatewayRouteTableIds", js.undefined)
  }
}
