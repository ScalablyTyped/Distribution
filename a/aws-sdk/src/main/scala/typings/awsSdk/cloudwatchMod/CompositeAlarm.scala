package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): CompositeAlarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeAlarm]
  }
  
  @scala.inline
  implicit class CompositeAlarmOps[Self <: CompositeAlarm] (val x: Self) extends AnyVal {
    
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
    def setActionsEnabled(value: ActionsEnabled): Self = this.set("ActionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsEnabled: Self = this.set("ActionsEnabled", js.undefined)
    
    @scala.inline
    def setAlarmActionsVarargs(value: ResourceName*): Self = this.set("AlarmActions", js.Array(value :_*))
    
    @scala.inline
    def setAlarmActions(value: ResourceList): Self = this.set("AlarmActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmActions: Self = this.set("AlarmActions", js.undefined)
    
    @scala.inline
    def setAlarmArn(value: AlarmArn): Self = this.set("AlarmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmArn: Self = this.set("AlarmArn", js.undefined)
    
    @scala.inline
    def setAlarmConfigurationUpdatedTimestamp(value: Timestamp): Self = this.set("AlarmConfigurationUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmConfigurationUpdatedTimestamp: Self = this.set("AlarmConfigurationUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setAlarmDescription(value: AlarmDescription): Self = this.set("AlarmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmDescription: Self = this.set("AlarmDescription", js.undefined)
    
    @scala.inline
    def setAlarmName(value: AlarmName): Self = this.set("AlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmName: Self = this.set("AlarmName", js.undefined)
    
    @scala.inline
    def setAlarmRule(value: AlarmRule): Self = this.set("AlarmRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmRule: Self = this.set("AlarmRule", js.undefined)
    
    @scala.inline
    def setInsufficientDataActionsVarargs(value: ResourceName*): Self = this.set("InsufficientDataActions", js.Array(value :_*))
    
    @scala.inline
    def setInsufficientDataActions(value: ResourceList): Self = this.set("InsufficientDataActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsufficientDataActions: Self = this.set("InsufficientDataActions", js.undefined)
    
    @scala.inline
    def setOKActionsVarargs(value: ResourceName*): Self = this.set("OKActions", js.Array(value :_*))
    
    @scala.inline
    def setOKActions(value: ResourceList): Self = this.set("OKActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOKActions: Self = this.set("OKActions", js.undefined)
    
    @scala.inline
    def setStateReason(value: StateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
    
    @scala.inline
    def setStateReasonData(value: StateReasonData): Self = this.set("StateReasonData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReasonData: Self = this.set("StateReasonData", js.undefined)
    
    @scala.inline
    def setStateUpdatedTimestamp(value: Timestamp): Self = this.set("StateUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateUpdatedTimestamp: Self = this.set("StateUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setStateValue(value: StateValue): Self = this.set("StateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateValue: Self = this.set("StateValue", js.undefined)
  }
}
