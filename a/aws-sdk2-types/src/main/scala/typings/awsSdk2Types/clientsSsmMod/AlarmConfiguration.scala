package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmConfiguration extends StObject {
  
  /**
    * The name of the CloudWatch alarm specified in the configuration.
    */
  var Alarms: AlarmList
  
  /**
    * If you specify true for this value, your automation or command continue to run even if we can't gather information about the state of your CloudWatch alarm. The default value is false.
    */
  var IgnorePollAlarmFailure: js.UndefOr[Boolean] = js.undefined
}
object AlarmConfiguration {
  
  inline def apply(Alarms: AlarmList): AlarmConfiguration = {
    val __obj = js.Dynamic.literal(Alarms = Alarms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlarmConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAlarms(value: AlarmList): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value*))
    
    inline def setIgnorePollAlarmFailure(value: Boolean): Self = StObject.set(x, "IgnorePollAlarmFailure", value.asInstanceOf[js.Any])
    
    inline def setIgnorePollAlarmFailureUndefined: Self = StObject.set(x, "IgnorePollAlarmFailure", js.undefined)
  }
}
