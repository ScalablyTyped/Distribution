package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetAlarmStateInput extends js.Object {
  /**
    * The name for the alarm. This name must be unique within the AWS account. The maximum length is 255 characters.
    */
  var AlarmName: typings.awsSdk.cloudwatchMod.AlarmName = js.native
  /**
    * The reason that this alarm is set to this specific state, in text format.
    */
  var StateReason: typings.awsSdk.cloudwatchMod.StateReason = js.native
  /**
    * The reason that this alarm is set to this specific state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReasonData] = js.native
  /**
    * The value of the state.
    */
  var StateValue: typings.awsSdk.cloudwatchMod.StateValue = js.native
}

object SetAlarmStateInput {
  @scala.inline
  def apply(
    AlarmName: AlarmName,
    StateReason: StateReason,
    StateValue: StateValue,
    StateReasonData: StateReasonData = null
  ): SetAlarmStateInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], StateReason = StateReason.asInstanceOf[js.Any], StateValue = StateValue.asInstanceOf[js.Any])
    if (StateReasonData != null) __obj.updateDynamic("StateReasonData")(StateReasonData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAlarmStateInput]
  }
}

