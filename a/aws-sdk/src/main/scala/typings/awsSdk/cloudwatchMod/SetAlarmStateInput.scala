package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAlarmStateInput extends StObject {
  
  /**
    * The name of the alarm.
    */
  var AlarmName: typings.awsSdk.cloudwatchMod.AlarmName = js.native
  
  /**
    * The reason that this alarm is set to this specific state, in text format.
    */
  var StateReason: typings.awsSdk.cloudwatchMod.StateReason = js.native
  
  /**
    * The reason that this alarm is set to this specific state, in JSON format. For SNS or EC2 alarm actions, this is just informational. But for EC2 Auto Scaling or application Auto Scaling alarm actions, the Auto Scaling policy uses the information in this field to take the correct action.
    */
  var StateReasonData: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReasonData] = js.native
  
  /**
    * The value of the state.
    */
  var StateValue: typings.awsSdk.cloudwatchMod.StateValue = js.native
}
object SetAlarmStateInput {
  
  @scala.inline
  def apply(AlarmName: AlarmName, StateReason: StateReason, StateValue: StateValue): SetAlarmStateInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], StateReason = StateReason.asInstanceOf[js.Any], StateValue = StateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAlarmStateInput]
  }
  
  @scala.inline
  implicit class SetAlarmStateInputMutableBuilder[Self <: SetAlarmStateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonData(value: StateReasonData): Self = StObject.set(x, "StateReasonData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonDataUndefined: Self = StObject.set(x, "StateReasonData", js.undefined)
    
    @scala.inline
    def setStateValue(value: StateValue): Self = StObject.set(x, "StateValue", value.asInstanceOf[js.Any])
  }
}
