package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetHistoryResult extends js.Object {
  /**
    * The ID of the EC Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
  /**
    * Information about the events in the history of the EC2 Fleet.
    */
  var HistoryRecords: js.UndefOr[HistoryRecordSet] = js.native
  /**
    * The last date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). All records up to this time were retrieved. If nextToken indicates that there are more results, this value is not present.
    */
  var LastEvaluatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The start date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[DateTime] = js.native
}

object DescribeFleetHistoryResult {
  @scala.inline
  def apply(
    FleetId: FleetId = null,
    HistoryRecords: HistoryRecordSet = null,
    LastEvaluatedTime: DateTime = null,
    NextToken: String = null,
    StartTime: DateTime = null
  ): DescribeFleetHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (HistoryRecords != null) __obj.updateDynamic("HistoryRecords")(HistoryRecords.asInstanceOf[js.Any])
    if (LastEvaluatedTime != null) __obj.updateDynamic("LastEvaluatedTime")(LastEvaluatedTime.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetHistoryResult]
  }
}

