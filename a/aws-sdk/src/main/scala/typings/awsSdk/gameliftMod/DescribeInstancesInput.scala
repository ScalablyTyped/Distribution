package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancesInput extends js.Object {
  /**
    * A unique identifier for a fleet to retrieve instance information for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
  /**
    * A unique identifier for an instance to retrieve. Specify an instance ID or leave blank to retrieve all instances in the fleet.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.gameliftMod.InstanceId] = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeInstancesInput {
  @scala.inline
  def apply(
    FleetId: FleetIdOrArn,
    InstanceId: InstanceId = null,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null
  ): DescribeInstancesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancesInput]
  }
}

