package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotFleetInstancesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[DescribeSpotFleetInstancesMaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: typings.awsSdk.ec2Mod.SpotFleetRequestId = js.native
}

object DescribeSpotFleetInstancesRequest {
  @scala.inline
  def apply(
    SpotFleetRequestId: SpotFleetRequestId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeSpotFleetInstancesRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestId = SpotFleetRequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpotFleetInstancesRequest]
  }
}

