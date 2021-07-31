package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudwatchAlarmAction extends StObject {
  
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: AlarmName
  
  /**
    * The IAM role that allows access to the CloudWatch alarm.
    */
  var roleArn: AwsArn
  
  /**
    * The reason for the alarm change.
    */
  var stateReason: StateReason
  
  /**
    * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
    */
  var stateValue: StateValue
}
object CloudwatchAlarmAction {
  
  @scala.inline
  def apply(alarmName: AlarmName, roleArn: AwsArn, stateReason: StateReason, stateValue: StateValue): CloudwatchAlarmAction = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchAlarmAction]
  }
  
  @scala.inline
  implicit class CloudwatchAlarmActionMutableBuilder[Self <: CloudwatchAlarmAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmName(value: AlarmName): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: StateReason): Self = StObject.set(x, "stateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateValue(value: StateValue): Self = StObject.set(x, "stateValue", value.asInstanceOf[js.Any])
  }
}
