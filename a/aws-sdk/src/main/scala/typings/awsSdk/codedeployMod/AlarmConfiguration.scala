package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlarmConfiguration extends js.Object {
  
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
  implicit class AlarmConfigurationOps[Self <: AlarmConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlarmsVarargs(value: Alarm*): Self = this.set("alarms", js.Array(value :_*))
    
    @scala.inline
    def setAlarms(value: AlarmList): Self = this.set("alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarms: Self = this.set("alarms", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setIgnorePollAlarmFailure(value: Boolean): Self = this.set("ignorePollAlarmFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePollAlarmFailure: Self = this.set("ignorePollAlarmFailure", js.undefined)
  }
}
