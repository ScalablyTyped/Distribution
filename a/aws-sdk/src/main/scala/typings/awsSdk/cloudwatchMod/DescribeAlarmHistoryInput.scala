package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmHistoryInput extends js.Object {
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you omit this parameter, only metric alarms are returned.
    */
  var AlarmTypes: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmTypes] = js.native
  /**
    * The ending date to retrieve alarm history.
    */
  var EndDate: js.UndefOr[Timestamp] = js.native
  /**
    * The type of alarm histories to retrieve.
    */
  var HistoryItemType: js.UndefOr[typings.awsSdk.cloudwatchMod.HistoryItemType] = js.native
  /**
    * The maximum number of alarm history records to retrieve.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.cloudwatchMod.MaxRecords] = js.native
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
  /**
    * Specified whether to return the newest or oldest alarm history first. Specify TimestampDescending to have the newest event history returned first, and specify TimestampAscending to have the oldest history returned first.
    */
  var ScanBy: js.UndefOr[typings.awsSdk.cloudwatchMod.ScanBy] = js.native
  /**
    * The starting date to retrieve alarm history.
    */
  var StartDate: js.UndefOr[Timestamp] = js.native
}

object DescribeAlarmHistoryInput {
  @scala.inline
  def apply(
    AlarmName: AlarmName = null,
    AlarmTypes: AlarmTypes = null,
    EndDate: Timestamp = null,
    HistoryItemType: HistoryItemType = null,
    MaxRecords: Int | Double = null,
    NextToken: NextToken = null,
    ScanBy: ScanBy = null,
    StartDate: Timestamp = null
  ): DescribeAlarmHistoryInput = {
    val __obj = js.Dynamic.literal()
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName.asInstanceOf[js.Any])
    if (AlarmTypes != null) __obj.updateDynamic("AlarmTypes")(AlarmTypes.asInstanceOf[js.Any])
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (HistoryItemType != null) __obj.updateDynamic("HistoryItemType")(HistoryItemType.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScanBy != null) __obj.updateDynamic("ScanBy")(ScanBy.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmHistoryInput]
  }
}

