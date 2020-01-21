package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetUtilizationOutput extends js.Object {
  /**
    * A collection of objects containing utilization information for each requested fleet ID.
    */
  var FleetUtilization: js.UndefOr[FleetUtilizationList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeFleetUtilizationOutput {
  @scala.inline
  def apply(FleetUtilization: FleetUtilizationList = null, NextToken: NonZeroAndMaxString = null): DescribeFleetUtilizationOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetUtilization != null) __obj.updateDynamic("FleetUtilization")(FleetUtilization.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetUtilizationOutput]
  }
}

