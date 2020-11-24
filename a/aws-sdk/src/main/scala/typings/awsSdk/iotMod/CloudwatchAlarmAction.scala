package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudwatchAlarmAction extends js.Object {
  
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: AlarmName = js.native
  
  /**
    * The IAM role that allows access to the CloudWatch alarm.
    */
  var roleArn: AwsArn = js.native
  
  /**
    * The reason for the alarm change.
    */
  var stateReason: StateReason = js.native
  
  /**
    * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
    */
  var stateValue: StateValue = js.native
}
object CloudwatchAlarmAction {
  
  @scala.inline
  def apply(alarmName: AlarmName, roleArn: AwsArn, stateReason: StateReason, stateValue: StateValue): CloudwatchAlarmAction = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchAlarmAction]
  }
  
  @scala.inline
  implicit class CloudwatchAlarmActionOps[Self <: CloudwatchAlarmAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlarmName(value: AlarmName): Self = this.set("alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: StateReason): Self = this.set("stateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateValue(value: StateValue): Self = this.set("stateValue", value.asInstanceOf[js.Any])
  }
}
