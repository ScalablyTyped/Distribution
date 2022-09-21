package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnoozeAlarmActionRequest extends StObject {
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: AlarmModelName
  
  /**
    * The value of the key used as a filter to select only the alarms associated with the key.
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  
  /**
    * The note that you can leave when you snooze the alarm.
    */
  var note: js.UndefOr[Note] = js.undefined
  
  /**
    * The request ID. Each ID must be unique within each batch.
    */
  var requestId: RequestId
  
  /**
    * The snooze time in seconds. The alarm automatically changes to the NORMAL state after this duration.
    */
  var snoozeDuration: SnoozeDuration
}
object SnoozeAlarmActionRequest {
  
  inline def apply(alarmModelName: AlarmModelName, requestId: RequestId, snoozeDuration: SnoozeDuration): SnoozeAlarmActionRequest = {
    val __obj = js.Dynamic.literal(alarmModelName = alarmModelName.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], snoozeDuration = snoozeDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnoozeAlarmActionRequest]
  }
  
  extension [Self <: SnoozeAlarmActionRequest](x: Self) {
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setNote(value: Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setSnoozeDuration(value: SnoozeDuration): Self = StObject.set(x, "snoozeDuration", value.asInstanceOf[js.Any])
  }
}
