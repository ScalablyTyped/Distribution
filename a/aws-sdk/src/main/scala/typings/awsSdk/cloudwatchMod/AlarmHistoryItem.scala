package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlarmHistoryItem extends StObject {
  
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
  implicit class AlarmHistoryItemMutableBuilder[Self <: AlarmHistoryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
    
    @scala.inline
    def setAlarmType(value: AlarmType): Self = StObject.set(x, "AlarmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmTypeUndefined: Self = StObject.set(x, "AlarmType", js.undefined)
    
    @scala.inline
    def setHistoryData(value: HistoryData): Self = StObject.set(x, "HistoryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryDataUndefined: Self = StObject.set(x, "HistoryData", js.undefined)
    
    @scala.inline
    def setHistoryItemType(value: HistoryItemType): Self = StObject.set(x, "HistoryItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryItemTypeUndefined: Self = StObject.set(x, "HistoryItemType", js.undefined)
    
    @scala.inline
    def setHistorySummary(value: HistorySummary): Self = StObject.set(x, "HistorySummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistorySummaryUndefined: Self = StObject.set(x, "HistorySummary", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
