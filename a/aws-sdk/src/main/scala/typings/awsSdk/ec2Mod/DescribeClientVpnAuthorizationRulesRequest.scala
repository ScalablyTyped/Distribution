package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClientVpnAuthorizationRulesRequest extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. Filter names and values are case-sensitive.    description - The description of the authorization rule.    destination-cidr - The CIDR of the network to which the authorization rule applies.    group-id - The ID of the Active Directory group to which the authorization rule grants access.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeClientVpnAuthorizationRulesMaxResults] = js.native
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeClientVpnAuthorizationRulesRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null
  ): DescribeClientVpnAuthorizationRulesRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientVpnAuthorizationRulesRequest]
  }
}

