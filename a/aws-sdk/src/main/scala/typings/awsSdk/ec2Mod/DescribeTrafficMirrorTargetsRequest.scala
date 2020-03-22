package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrafficMirrorTargetsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. The possible values are:    description: The Traffic Mirror target description.    network-interface-id: The ID of the Traffic Mirror session network interface.    network-load-balancer-arn: The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the session.    owner-id: The ID of the account that owns the Traffic Mirror session.    traffic-mirror-target-id: The ID of the Traffic Mirror target.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TrafficMirroringMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
  /**
    * The ID of the Traffic Mirror targets.
    */
  var TrafficMirrorTargetIds: js.UndefOr[TrafficMirrorTargetIdList] = js.native
}

object DescribeTrafficMirrorTargetsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null,
    TrafficMirrorTargetIds: TrafficMirrorTargetIdList = null
  ): DescribeTrafficMirrorTargetsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TrafficMirrorTargetIds != null) __obj.updateDynamic("TrafficMirrorTargetIds")(TrafficMirrorTargetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrafficMirrorTargetsRequest]
  }
}

