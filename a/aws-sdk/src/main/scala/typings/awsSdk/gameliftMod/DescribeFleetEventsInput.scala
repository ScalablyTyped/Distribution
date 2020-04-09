package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetEventsInput extends js.Object {
  /**
    * Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from the specified start time up to the present. Format is a number expressed in Unix time as milliseconds (ex: "1469498468.057").
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * A unique identifier for a fleet to get event logs for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Earliest date to retrieve event logs for. If no start time is specified, this call returns entries starting from when the fleet was created to the specified end time. Format is a number expressed in Unix time as milliseconds (ex: "1469498468.057").
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
}

object DescribeFleetEventsInput {
  @scala.inline
  def apply(
    FleetId: FleetIdOrArn,
    EndTime: Timestamp = null,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null,
    StartTime: Timestamp = null
  ): DescribeFleetEventsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetEventsInput]
  }
}

