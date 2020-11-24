package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class TestAlarmRequestOps[Self <: TestAlarmRequest] (val x: Self) extends AnyVal {
    
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
    def setAlarmName(value: ResourceName): Self = this.set("alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: AlarmState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
