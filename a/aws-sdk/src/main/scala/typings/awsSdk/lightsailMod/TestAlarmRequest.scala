package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestAlarmRequest extends js.Object {
  /**
    * The name of the alarm to test.
    */
  var alarmName: ResourceName = js.native
  /**
    * The alarm state to test. An alarm has the following possible states that can be tested:    ALARM - The metric is outside of the defined threshold.    INSUFFICIENT_DATA - The alarm has just started, the metric is not available, or not enough data is available for the metric to determine the alarm state.    OK - The metric is within the defined threshold.  
    */
  var state: AlarmState = js.native
}

object TestAlarmRequest {
  @scala.inline
  def apply(alarmName: ResourceName, state: AlarmState): TestAlarmRequest = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAlarmRequest]
  }
}

