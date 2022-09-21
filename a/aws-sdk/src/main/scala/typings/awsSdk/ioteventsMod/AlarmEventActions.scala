package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmEventActions extends StObject {
  
  /**
    * Specifies one or more supported actions to receive notifications when the alarm state changes.
    */
  var alarmActions: js.UndefOr[AlarmActions] = js.undefined
}
object AlarmEventActions {
  
  inline def apply(): AlarmEventActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmEventActions]
  }
  
  extension [Self <: AlarmEventActions](x: Self) {
    
    inline def setAlarmActions(value: AlarmActions): Self = StObject.set(x, "alarmActions", value.asInstanceOf[js.Any])
    
    inline def setAlarmActionsUndefined: Self = StObject.set(x, "alarmActions", js.undefined)
    
    inline def setAlarmActionsVarargs(value: AlarmAction*): Self = StObject.set(x, "alarmActions", js.Array(value*))
  }
}
