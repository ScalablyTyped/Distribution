package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

