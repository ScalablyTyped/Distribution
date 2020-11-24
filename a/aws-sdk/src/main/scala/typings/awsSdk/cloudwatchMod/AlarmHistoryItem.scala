package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): AlarmHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmHistoryItem]
  }
  
  @scala.inline
  implicit class AlarmHistoryItemOps[Self <: AlarmHistoryItem] (val x: Self) extends AnyVal {
    
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
    def setAlarmType(value: AlarmType): Self = this.set("AlarmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmType: Self = this.set("AlarmType", js.undefined)
    
    @scala.inline
    def setHistoryData(value: HistoryData): Self = this.set("HistoryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryData: Self = this.set("HistoryData", js.undefined)
    
    @scala.inline
    def setHistoryItemType(value: HistoryItemType): Self = this.set("HistoryItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryItemType: Self = this.set("HistoryItemType", js.undefined)
    
    @scala.inline
    def setHistorySummary(value: HistorySummary): Self = this.set("HistorySummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistorySummary: Self = this.set("HistorySummary", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
}
