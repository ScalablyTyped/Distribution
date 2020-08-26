package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetAlarmStateInput extends js.Object {
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
  implicit class SetAlarmStateInputOps[Self <: SetAlarmStateInput] (val x: Self) extends AnyVal {
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
    def setAlarmName(value: AlarmName): Self = this.set("AlarmName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateReason(value: StateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateValue(value: StateValue): Self = this.set("StateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateReasonData(value: StateReasonData): Self = this.set("StateReasonData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateReasonData: Self = this.set("StateReasonData", js.undefined)
  }
  
}

