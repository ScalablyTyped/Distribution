package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayRouteTableVpcAssociationsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    local-gateway-id - The ID of a local gateway.    local-gateway-route-table-id - The ID of the local gateway route table.    local-gateway-route-table-vpc-association-id - The ID of the association.    state - The state of the association.    vpc-id - The ID of the VPC.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The IDs of the associations.
    */
  var LocalGatewayRouteTableVpcAssociationIds: js.UndefOr[LocalGatewayRouteTableVpcAssociationIdSet] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayRouteTableVpcAssociationsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    LocalGatewayRouteTableVpcAssociationIds: LocalGatewayRouteTableVpcAssociationIdSet = null,
    MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.undefined,
    NextToken: String = null
  ): DescribeLocalGatewayRouteTableVpcAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (LocalGatewayRouteTableVpcAssociationIds != null) __obj.updateDynamic("LocalGatewayRouteTableVpcAssociationIds")(LocalGatewayRouteTableVpcAssociationIds.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewayRouteTableVpcAssociationsRequest]
  }
}

