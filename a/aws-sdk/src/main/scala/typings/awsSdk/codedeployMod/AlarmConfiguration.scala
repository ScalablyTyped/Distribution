package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlarmConfiguration extends StObject {
  
  /**
    * A list of alarms configured for the deployment group. A maximum of 10 alarms can be added to a deployment group.
    */
  var alarms: js.UndefOr[AlarmList] = js.native
  
  /**
    * Indicates whether the alarm configuration is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from Amazon CloudWatch. The default value is false.    true: The deployment proceeds even if alarm status information can't be retrieved from Amazon CloudWatch.    false: The deployment stops if alarm status information can't be retrieved from Amazon CloudWatch.  
    */
  var ignorePollAlarmFailure: js.UndefOr[Boolean] = js.native
}
object AlarmConfiguration {
  
  @scala.inline
  def apply(): AlarmConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmConfiguration]
  }
  
  @scala.inline
  implicit class AlarmConfigurationMutableBuilder[Self <: AlarmConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarms(value: AlarmList): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmsUndefined: Self = StObject.set(x, "alarms", js.undefined)
    
    @scala.inline
    def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "alarms", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIgnorePollAlarmFailure(value: Boolean): Self = StObject.set(x, "ignorePollAlarmFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePollAlarmFailureUndefined: Self = StObject.set(x, "ignorePollAlarmFailure", js.undefined)
  }
}
