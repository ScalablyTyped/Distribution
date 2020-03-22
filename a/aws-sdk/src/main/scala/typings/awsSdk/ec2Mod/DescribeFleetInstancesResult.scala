package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetInstancesResult extends js.Object {
  /**
    * The running instances. This list is refreshed periodically and might be out of date.
    */
  var ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeFleetInstancesResult {
  @scala.inline
  def apply(ActiveInstances: ActiveInstanceSet = null, FleetId: FleetId = null, NextToken: String = null): DescribeFleetInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (ActiveInstances != null) __obj.updateDynamic("ActiveInstances")(ActiveInstances.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetInstancesResult]
  }
}

