package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompositeAlarm extends js.Object {
  /**
    * Indicates whether actions should be executed during any changes to the alarm state.
    */
  var ActionsEnabled: js.UndefOr[typings.awsSdk.cloudwatchMod.ActionsEnabled] = js.native
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmArn: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmArn] = js.native
  /**
    * The time stamp of the last update to the alarm configuration.
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmDescription] = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * The rule that this alarm uses to evaluate its alarm state.
    */
  var AlarmRule: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmRule] = js.native
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.native
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var OKActions: js.UndefOr[ResourceList] = js.native
  /**
    * An explanation for the alarm state, in text format.
    */
  var StateReason: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReason] = js.native
  /**
    * An explanation for the alarm state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReasonData] = js.native
  /**
    * The time stamp of the last update to the alarm state.
    */
  var StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The state value for the alarm.
    */
  var StateValue: js.UndefOr[typings.awsSdk.cloudwatchMod.StateValue] = js.native
}

object CompositeAlarm {
  @scala.inline
  def apply(
    ActionsEnabled: js.UndefOr[Boolean] = js.undefined,
    AlarmActions: ResourceList = null,
    AlarmArn: AlarmArn = null,
    AlarmConfigurationUpdatedTimestamp: Timestamp = null,
    AlarmDescription: AlarmDescription = null,
    AlarmName: AlarmName = null,
    AlarmRule: AlarmRule = null,
    InsufficientDataActions: ResourceList = null,
    OKActions: ResourceList = null,
    StateReason: StateReason = null,
    StateReasonData: StateReasonData = null,
    StateUpdatedTimestamp: Timestamp = null,
    StateValue: StateValue = null
  ): CompositeAlarm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ActionsEnabled)) __obj.updateDynamic("ActionsEnabled")(ActionsEnabled.asInstanceOf[js.Any])
    if (AlarmActions != null) __obj.updateDynamic("AlarmActions")(AlarmActions.asInstanceOf[js.Any])
    if (AlarmArn != null) __obj.updateDynamic("AlarmArn")(AlarmArn.asInstanceOf[js.Any])
    if (AlarmConfigurationUpdatedTimestamp != null) __obj.updateDynamic("AlarmConfigurationUpdatedTimestamp")(AlarmConfigurationUpdatedTimestamp.asInstanceOf[js.Any])
    if (AlarmDescription != null) __obj.updateDynamic("AlarmDescription")(AlarmDescription.asInstanceOf[js.Any])
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName.asInstanceOf[js.Any])
    if (AlarmRule != null) __obj.updateDynamic("AlarmRule")(AlarmRule.asInstanceOf[js.Any])
    if (InsufficientDataActions != null) __obj.updateDynamic("InsufficientDataActions")(InsufficientDataActions.asInstanceOf[js.Any])
    if (OKActions != null) __obj.updateDynamic("OKActions")(OKActions.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (StateReasonData != null) __obj.updateDynamic("StateReasonData")(StateReasonData.asInstanceOf[js.Any])
    if (StateUpdatedTimestamp != null) __obj.updateDynamic("StateUpdatedTimestamp")(StateUpdatedTimestamp.asInstanceOf[js.Any])
    if (StateValue != null) __obj.updateDynamic("StateValue")(StateValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeAlarm]
  }
}

