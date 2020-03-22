package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlarmHistoryItem extends js.Object {
  /**
    * The descriptive name for the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * The type of alarm, either metric alarm or composite alarm.
    */
  var AlarmType: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmType] = js.native
  /**
    * Data about the alarm, in JSON format.
    */
  var HistoryData: js.UndefOr[typings.awsSdk.cloudwatchMod.HistoryData] = js.native
  /**
    * The type of alarm history item.
    */
  var HistoryItemType: js.UndefOr[typings.awsSdk.cloudwatchMod.HistoryItemType] = js.native
  /**
    * A summary of the alarm history, in text format.
    */
  var HistorySummary: js.UndefOr[typings.awsSdk.cloudwatchMod.HistorySummary] = js.native
  /**
    * The time stamp for the alarm history item.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.cloudwatchMod.Timestamp] = js.native
}

object AlarmHistoryItem {
  @scala.inline
  def apply(
    AlarmName: AlarmName = null,
    AlarmType: AlarmType = null,
    HistoryData: HistoryData = null,
    HistoryItemType: HistoryItemType = null,
    HistorySummary: HistorySummary = null,
    Timestamp: Timestamp = null
  ): AlarmHistoryItem = {
    val __obj = js.Dynamic.literal()
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName.asInstanceOf[js.Any])
    if (AlarmType != null) __obj.updateDynamic("AlarmType")(AlarmType.asInstanceOf[js.Any])
    if (HistoryData != null) __obj.updateDynamic("HistoryData")(HistoryData.asInstanceOf[js.Any])
    if (HistoryItemType != null) __obj.updateDynamic("HistoryItemType")(HistoryItemType.asInstanceOf[js.Any])
    if (HistorySummary != null) __obj.updateDynamic("HistorySummary")(HistorySummary.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmHistoryItem]
  }
}

