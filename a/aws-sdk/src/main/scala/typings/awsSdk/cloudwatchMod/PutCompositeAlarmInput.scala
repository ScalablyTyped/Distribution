package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutCompositeAlarmInput extends js.Object {
  
  /**
    * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. The default is TRUE.
    */
  var ActionsEnabled: js.UndefOr[typings.awsSdk.cloudwatchMod.ActionsEnabled] = js.native
  
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.native
  
  /**
    * The description for the composite alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsSdk.cloudwatchMod.AlarmDescription] = js.native
  
  /**
    * The name for the composite alarm. This name must be unique within the Region.
    */
  var AlarmName: typings.awsSdk.cloudwatchMod.AlarmName = js.native
  
  /**
    * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For each alarm that you reference, you designate a function that specifies whether that alarm needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to combine multiple functions in a single expression. You can use parenthesis to logically group the functions in your expression. You can use either alarm names or ARNs to reference the other alarms that are to be evaluated. Functions can include the following:    ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.    OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.    INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in INSUFFICIENT_DATA state.    TRUE always evaluates to TRUE.    FALSE always evaluates to FALSE.   TRUE and FALSE are useful for testing a complex AlarmRule structure, and for testing your alarm actions. Alarm names specified in AlarmRule can be surrounded with double-quotes ("), but do not have to be. The following are some examples of AlarmRule:    ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh) specifies that the composite alarm goes into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.    ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress) specifies that the alarm goes to ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM state. This example reduces alarm noise during a known deployment window.    (ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh) goes into ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if NetworkOutTooHigh is in OK state. This provides another example of using a composite alarm to prevent noise. This rule ensures that you are not notified with an alarm action on high CPU or disk usage if a known network problem is also occurring.   The AlarmRule can specify as many as 100 "children" alarms. The AlarmRule expression can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and parentheses.
    */
  var AlarmRule: typings.awsSdk.cloudwatchMod.AlarmRule = js.native
  
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.native
  
  /**
    * The actions to execute when this alarm transitions to an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  
    */
  var OKActions: js.UndefOr[ResourceList] = js.native
  
  /**
    * A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with an alarm. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object PutCompositeAlarmInput {
  
  @scala.inline
  def apply(AlarmName: AlarmName, AlarmRule: AlarmRule): PutCompositeAlarmInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], AlarmRule = AlarmRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCompositeAlarmInput]
  }
  
  @scala.inline
  implicit class PutCompositeAlarmInputOps[Self <: PutCompositeAlarmInput] (val x: Self) extends AnyVal {
    
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
    def setAlarmRule(value: AlarmRule): Self = this.set("AlarmRule", value.asInstanceOf[js.Any])
    
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
    def setAlarmDescription(value: AlarmDescription): Self = this.set("AlarmDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmDescription: Self = this.set("AlarmDescription", js.undefined)
    
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
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
