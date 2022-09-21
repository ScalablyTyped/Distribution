package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmModelRequest extends StObject {
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: AlarmModelName
  
  /**
    * The version of the alarm model.
    */
  var alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined
}
object DescribeAlarmModelRequest {
  
  inline def apply(alarmModelName: AlarmModelName): DescribeAlarmModelRequest = {
    val __obj = js.Dynamic.literal(alarmModelName = alarmModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmModelRequest]
  }
  
  extension [Self <: DescribeAlarmModelRequest](x: Self) {
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelVersion(value: AlarmModelVersion): Self = StObject.set(x, "alarmModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelVersionUndefined: Self = StObject.set(x, "alarmModelVersion", js.undefined)
  }
}
