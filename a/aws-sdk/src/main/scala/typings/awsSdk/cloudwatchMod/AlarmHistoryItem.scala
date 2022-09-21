package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmHistoryItem extends StObject {
  
  /**
    * The descriptive name for the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmName] = js.undefined
  
  /**
    * The type of alarm, either metric alarm or composite alarm.
    */
  var AlarmType: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmType] = js.undefined
  
  /**
    * Data about the alarm, in JSON format.
    */
  var HistoryData: js.UndefOr[typings.awsSdk.cloudwatchMod.HistoryData] = js.undefined
  
  /**
    * The type of alarm history item.
    */
  var HistoryItemType: js.UndefOr[typings.awsSdk.cloudwatchMod.HistoryItemType] = js.undefined
  
  /**
    * A summary of the alarm history, in text format.
    */
  var HistorySummary: js.UndefOr[typings.awsSdk.cloudwatchMod.HistorySummary] = js.undefined
  
  /**
    * The time stamp for the alarm history item.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object AlarmHistoryItem {
  
  inline def apply(): AlarmHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmHistoryItem]
  }
  
  extension [Self <: AlarmHistoryItem](x: Self) {
    
    inline def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    inline def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
    
    inline def setAlarmType(value: AlarmType): Self = StObject.set(x, "AlarmType", value.asInstanceOf[js.Any])
    
    inline def setAlarmTypeUndefined: Self = StObject.set(x, "AlarmType", js.undefined)
    
    inline def setHistoryData(value: HistoryData): Self = StObject.set(x, "HistoryData", value.asInstanceOf[js.Any])
    
    inline def setHistoryDataUndefined: Self = StObject.set(x, "HistoryData", js.undefined)
    
    inline def setHistoryItemType(value: HistoryItemType): Self = StObject.set(x, "HistoryItemType", value.asInstanceOf[js.Any])
    
    inline def setHistoryItemTypeUndefined: Self = StObject.set(x, "HistoryItemType", js.undefined)
    
    inline def setHistorySummary(value: HistorySummary): Self = StObject.set(x, "HistorySummary", value.asInstanceOf[js.Any])
    
    inline def setHistorySummaryUndefined: Self = StObject.set(x, "HistorySummary", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
