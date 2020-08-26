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
  def apply(): DescribeAlarmHistoryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmHistoryInput]
  }
  @scala.inline
  implicit class DescribeAlarmHistoryInputOps[Self <: DescribeAlarmHistoryInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlarmName(value: AlarmName): Self = this.set("AlarmName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmName: Self = this.set("AlarmName", js.undefined)
    @scala.inline
    def setAlarmTypesVarargs(value: AlarmType*): Self = this.set("AlarmTypes", js.Array(value :_*))
    @scala.inline
    def setAlarmTypes(value: AlarmTypes): Self = this.set("AlarmTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmTypes: Self = this.set("AlarmTypes", js.undefined)
    @scala.inline
    def setEndDate(value: Timestamp): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
    @scala.inline
    def setHistoryItemType(value: HistoryItemType): Self = this.set("HistoryItemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryItemType: Self = this.set("HistoryItemType", js.undefined)
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScanBy(value: ScanBy): Self = this.set("ScanBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanBy: Self = this.set("ScanBy", js.undefined)
    @scala.inline
    def setStartDate(value: Timestamp): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
  }
  
}

