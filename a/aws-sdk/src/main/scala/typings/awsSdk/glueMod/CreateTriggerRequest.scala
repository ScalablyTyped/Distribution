package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTriggerRequest extends js.Object {
  
  /**
    * The actions initiated by this trigger when it fires.
    */
  var Actions: ActionList = js.native
  
  /**
    * A description of the new trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The name of the trigger.
    */
  var Name: NameString = js.native
  
  /**
    * A predicate to specify when the new trigger should fire. This field is required when the trigger type is CONDITIONAL.
    */
  var Predicate: js.UndefOr[typings.awsSdk.glueMod.Predicate] = js.native
  
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *). This field is required when the trigger type is SCHEDULED.
    */
  var Schedule: js.UndefOr[GenericString] = js.native
  
  /**
    * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True is not supported for ON_DEMAND triggers.
    */
  var StartOnCreation: js.UndefOr[BooleanValue] = js.native
  
  /**
    * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide. 
    */
  var Tags: js.UndefOr[TagsMap] = js.native
  
  /**
    * The type of the new trigger.
    */
  var Type: TriggerType = js.native
  
  /**
    * The name of the workflow associated with the trigger.
    */
  var WorkflowName: js.UndefOr[NameString] = js.native
}
object CreateTriggerRequest {
  
  @scala.inline
  def apply(Actions: ActionList, Name: NameString, Type: TriggerType): CreateTriggerRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTriggerRequest]
  }
  
  @scala.inline
  implicit class CreateTriggerRequestOps[Self <: CreateTriggerRequest] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: Action*): Self = this.set("Actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: ActionList): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TriggerType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setPredicate(value: Predicate): Self = this.set("Predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredicate: Self = this.set("Predicate", js.undefined)
    
    @scala.inline
    def setSchedule(value: GenericString): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setStartOnCreation(value: BooleanValue): Self = this.set("StartOnCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOnCreation: Self = this.set("StartOnCreation", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setWorkflowName(value: NameString): Self = this.set("WorkflowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowName: Self = this.set("WorkflowName", js.undefined)
  }
}
