package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmModelSummary extends StObject {
  
  /**
    * The description of the alarm model.
    */
  var alarmModelDescription: js.UndefOr[AlarmModelDescription] = js.undefined
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: js.UndefOr[AlarmModelName] = js.undefined
  
  /**
    * The time the alarm model was created, in the Unix epoch format.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
}
object AlarmModelSummary {
  
  inline def apply(): AlarmModelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmModelSummary]
  }
  
  extension [Self <: AlarmModelSummary](x: Self) {
    
    inline def setAlarmModelDescription(value: AlarmModelDescription): Self = StObject.set(x, "alarmModelDescription", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelDescriptionUndefined: Self = StObject.set(x, "alarmModelDescription", js.undefined)
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelNameUndefined: Self = StObject.set(x, "alarmModelName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
  }
}
