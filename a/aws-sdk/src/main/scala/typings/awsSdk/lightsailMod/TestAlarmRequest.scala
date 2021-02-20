package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestAlarmRequest extends StObject {
  
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
  implicit class TestAlarmRequestMutableBuilder[Self <: TestAlarmRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmName(value: ResourceName): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: AlarmState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
