package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchLocalGatewayRoutesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.
    */
  var Filters: FilterList = js.native
  /**
    * The ID of the local gateway route table.
    */
  var LocalGatewayRouteTableId: LocalGatewayRoutetableId = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ec2Mod.MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object SearchLocalGatewayRoutesRequest {
  @scala.inline
  def apply(
    Filters: FilterList,
    LocalGatewayRouteTableId: LocalGatewayRoutetableId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): SearchLocalGatewayRoutesRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], LocalGatewayRouteTableId = LocalGatewayRouteTableId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLocalGatewayRoutesRequest]
  }
}

