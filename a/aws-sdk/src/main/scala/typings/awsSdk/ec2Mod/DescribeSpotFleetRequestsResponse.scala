package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotFleetRequestsResponse extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the configuration of your Spot Fleet.
    */
  var SpotFleetRequestConfigs: js.UndefOr[SpotFleetRequestConfigSet] = js.native
}

object DescribeSpotFleetRequestsResponse {
  @scala.inline
  def apply(NextToken: String = null, SpotFleetRequestConfigs: SpotFleetRequestConfigSet = null): DescribeSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SpotFleetRequestConfigs != null) __obj.updateDynamic("SpotFleetRequestConfigs")(SpotFleetRequestConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpotFleetRequestsResponse]
  }
}

