package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociatedIpv6PoolCidrsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[Ipv6PoolMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
  /**
    * The ID of the IPv6 address pool.
    */
  var PoolId: Ipv6PoolEc2Id = js.native
}

object GetAssociatedIpv6PoolCidrsRequest {
  @scala.inline
  def apply(
    PoolId: Ipv6PoolEc2Id,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    MaxResults: js.UndefOr[Ipv6PoolMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): GetAssociatedIpv6PoolCidrsRequest = {
    val __obj = js.Dynamic.literal(PoolId = PoolId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssociatedIpv6PoolCidrsRequest]
  }
}

