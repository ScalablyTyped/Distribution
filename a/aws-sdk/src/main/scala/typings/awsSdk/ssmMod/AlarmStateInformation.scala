package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmStateInformation extends StObject {
  
  /**
    * The name of your CloudWatch alarm.
    */
  var Name: AlarmName
  
  /**
    * The state of your CloudWatch alarm.
    */
  var State: ExternalAlarmState
}
object AlarmStateInformation {
  
  inline def apply(Name: AlarmName, State: ExternalAlarmState): AlarmStateInformation = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmStateInformation]
  }
  
  extension [Self <: AlarmStateInformation](x: Self) {
    
    inline def setName(value: AlarmName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setState(value: ExternalAlarmState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
