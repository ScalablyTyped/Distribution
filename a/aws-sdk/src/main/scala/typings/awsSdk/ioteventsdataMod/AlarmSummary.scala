package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmSummary extends StObject {
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: js.UndefOr[AlarmModelName] = js.undefined
  
  /**
    * The version of the alarm model.
    */
  var alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined
  
  /**
    * The time the alarm was created, in the Unix epoch format.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The value of the key used as a filter to select only the alarms associated with the key.
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  
  /**
    * The time the alarm was last updated, in the Unix epoch format.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the alarm state. The state name can be one of the following values:    DISABLED - When the alarm is in the DISABLED state, it isn't ready to evaluate data. To enable the alarm, you must change the alarm to the NORMAL state.    NORMAL - When the alarm is in the NORMAL state, it's ready to evaluate data.    ACTIVE - If the alarm is in the ACTIVE state, the alarm is invoked.    ACKNOWLEDGED - When the alarm is in the ACKNOWLEDGED state, the alarm was invoked and you acknowledged the alarm.    SNOOZE_DISABLED - When the alarm is in the SNOOZE_DISABLED state, the alarm is disabled for a specified period of time. After the snooze time, the alarm automatically changes to the NORMAL state.     LATCHED - When the alarm is in the LATCHED state, the alarm was invoked. However, the data that the alarm is currently evaluating is within the specified range. To change the alarm to the NORMAL state, you must acknowledge the alarm.  
    */
  var stateName: js.UndefOr[AlarmStateName] = js.undefined
}
object AlarmSummary {
  
  inline def apply(): AlarmSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmSummary]
  }
  
  extension [Self <: AlarmSummary](x: Self) {
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelNameUndefined: Self = StObject.set(x, "alarmModelName", js.undefined)
    
    inline def setAlarmModelVersion(value: AlarmModelVersion): Self = StObject.set(x, "alarmModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelVersionUndefined: Self = StObject.set(x, "alarmModelVersion", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setStateName(value: AlarmStateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    inline def setStateNameUndefined: Self = StObject.set(x, "stateName", js.undefined)
  }
}
