package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeAlarm extends StObject {
  
  /**
    * Indicates whether actions should be executed during any changes to the alarm state.
    */
  var ActionsEnabled: js.UndefOr[typings.awsSdk.cloudwatchMod.ActionsEnabled] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmArn: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmArn] = js.undefined
  
  /**
    * The time stamp of the last update to the alarm configuration.
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description of the alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmDescription] = js.undefined
  
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmName] = js.undefined
  
  /**
    * The rule that this alarm uses to evaluate its alarm state.
    */
  var AlarmRule: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmRule] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var OKActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * An explanation for the alarm state, in text format.
    */
  var StateReason: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReason] = js.undefined
  
  /**
    * An explanation for the alarm state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typings.awsSdk.cloudwatchMod.StateReasonData] = js.undefined
  
  /**
    * The time stamp of the last update to the alarm state.
    */
  var StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The state value for the alarm.
    */
  var StateValue: js.UndefOr[typings.awsSdk.cloudwatchMod.StateValue] = js.undefined
}
object CompositeAlarm {
  
  @scala.inline
  def apply(): CompositeAlarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeAlarm]
  }
  
  @scala.inline
  implicit class CompositeAlarmMutableBuilder[Self <: CompositeAlarm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionsEnabled(value: ActionsEnabled): Self = StObject.set(x, "ActionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsEnabledUndefined: Self = StObject.set(x, "ActionsEnabled", js.undefined)
    
    @scala.inline
    def setAlarmActions(value: ResourceList): Self = StObject.set(x, "AlarmActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmActionsUndefined: Self = StObject.set(x, "AlarmActions", js.undefined)
    
    @scala.inline
    def setAlarmActionsVarargs(value: ResourceName*): Self = StObject.set(x, "AlarmActions", js.Array(value :_*))
    
    @scala.inline
    def setAlarmArn(value: AlarmArn): Self = StObject.set(x, "AlarmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmArnUndefined: Self = StObject.set(x, "AlarmArn", js.undefined)
    
    @scala.inline
    def setAlarmConfigurationUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "AlarmConfigurationUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmConfigurationUpdatedTimestampUndefined: Self = StObject.set(x, "AlarmConfigurationUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setAlarmDescription(value: AlarmDescription): Self = StObject.set(x, "AlarmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmDescriptionUndefined: Self = StObject.set(x, "AlarmDescription", js.undefined)
    
    @scala.inline
    def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
    
    @scala.inline
    def setAlarmRule(value: AlarmRule): Self = StObject.set(x, "AlarmRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmRuleUndefined: Self = StObject.set(x, "AlarmRule", js.undefined)
    
    @scala.inline
    def setInsufficientDataActions(value: ResourceList): Self = StObject.set(x, "InsufficientDataActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsufficientDataActionsUndefined: Self = StObject.set(x, "InsufficientDataActions", js.undefined)
    
    @scala.inline
    def setInsufficientDataActionsVarargs(value: ResourceName*): Self = StObject.set(x, "InsufficientDataActions", js.Array(value :_*))
    
    @scala.inline
    def setOKActions(value: ResourceList): Self = StObject.set(x, "OKActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOKActionsUndefined: Self = StObject.set(x, "OKActions", js.undefined)
    
    @scala.inline
    def setOKActionsVarargs(value: ResourceName*): Self = StObject.set(x, "OKActions", js.Array(value :_*))
    
    @scala.inline
    def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonData(value: StateReasonData): Self = StObject.set(x, "StateReasonData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonDataUndefined: Self = StObject.set(x, "StateReasonData", js.undefined)
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "StateUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUpdatedTimestampUndefined: Self = StObject.set(x, "StateUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setStateValue(value: StateValue): Self = StObject.set(x, "StateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateValueUndefined: Self = StObject.set(x, "StateValue", js.undefined)
  }
}
