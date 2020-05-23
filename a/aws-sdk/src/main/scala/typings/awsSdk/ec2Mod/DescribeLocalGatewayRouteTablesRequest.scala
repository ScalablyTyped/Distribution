package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayRouteTablesRequest extends js.Object {
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
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    LocalGatewayRouteTableIds: LocalGatewayRouteTableIdSet = null,
    MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.undefined,
    NextToken: String = null
  ): DescribeLocalGatewayRouteTablesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (LocalGatewayRouteTableIds != null) __obj.updateDynamic("LocalGatewayRouteTableIds")(LocalGatewayRouteTableIds.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewayRouteTablesRequest]
  }
}

