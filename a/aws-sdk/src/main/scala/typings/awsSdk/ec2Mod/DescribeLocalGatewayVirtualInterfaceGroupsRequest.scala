package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayVirtualInterfaceGroupsRequest extends js.Object {
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
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    LocalGatewayVirtualInterfaceGroupIds: LocalGatewayVirtualInterfaceGroupIdSet = null,
    MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.undefined,
    NextToken: String = null
  ): DescribeLocalGatewayVirtualInterfaceGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (LocalGatewayVirtualInterfaceGroupIds != null) __obj.updateDynamic("LocalGatewayVirtualInterfaceGroupIds")(LocalGatewayVirtualInterfaceGroupIds.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfaceGroupsRequest]
  }
}

