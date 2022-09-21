package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmHistoryInput extends StObject {
  
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmName] = js.undefined
  
  /**
    * Use this parameter to specify whether you want the operation to return metric alarms or composite alarms. If you omit this parameter, only metric alarms are returned.
    */
  var AlarmTypes: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmTypes] = js.undefined
  
  /**
    * The ending date to retrieve alarm history.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of alarm histories to retrieve.
    */
  var HistoryItemType: js.UndefOr[typings.awsSdk.cloudwatchMod.HistoryItemType] = js.undefined
  
  /**
    * The maximum number of alarm history records to retrieve.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.cloudwatchMod.MaxRecords] = js.undefined
  
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
  
  /**
    * Specified whether to return the newest or oldest alarm history first. Specify TimestampDescending to have the newest event history returned first, and specify TimestampAscending to have the oldest history returned first.
    */
  var ScanBy: js.UndefOr[typings.awsSdk.cloudwatchMod.ScanBy] = js.undefined
  
  /**
    * The starting date to retrieve alarm history.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
}
object DescribeAlarmHistoryInput {
  
  inline def apply(): DescribeAlarmHistoryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmHistoryInput]
  }
  
  extension [Self <: DescribeAlarmHistoryInput](x: Self) {
    
    inline def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    inline def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
    
    inline def setAlarmTypes(value: AlarmTypes): Self = StObject.set(x, "AlarmTypes", value.asInstanceOf[js.Any])
    
    inline def setAlarmTypesUndefined: Self = StObject.set(x, "AlarmTypes", js.undefined)
    
    inline def setAlarmTypesVarargs(value: AlarmType*): Self = StObject.set(x, "AlarmTypes", js.Array(value*))
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setHistoryItemType(value: HistoryItemType): Self = StObject.set(x, "HistoryItemType", value.asInstanceOf[js.Any])
    
    inline def setHistoryItemTypeUndefined: Self = StObject.set(x, "HistoryItemType", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScanBy(value: ScanBy): Self = StObject.set(x, "ScanBy", value.asInstanceOf[js.Any])
    
    inline def setScanByUndefined: Self = StObject.set(x, "ScanBy", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
  }
}
