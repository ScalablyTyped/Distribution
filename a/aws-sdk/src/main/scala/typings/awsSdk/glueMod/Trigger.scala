package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trigger extends js.Object {
  
  /**
    * The actions initiated by this trigger.
    */
  var Actions: js.UndefOr[ActionList] = js.native
  
  /**
    * A description of this trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * Reserved for future use.
    */
  var Id: js.UndefOr[IdString] = js.native
  
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * The predicate of this trigger, which defines when it will fire.
    */
  var Predicate: js.UndefOr[typings.awsSdk.glueMod.Predicate] = js.native
  
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[GenericString] = js.native
  
  /**
    * The current state of the trigger.
    */
  var State: js.UndefOr[TriggerState] = js.native
  
  /**
    * The type of trigger that this is.
    */
  var Type: js.UndefOr[TriggerType] = js.native
  
  /**
    * The name of the workflow associated with the trigger.
    */
  var WorkflowName: js.UndefOr[NameString] = js.native
}
object Trigger {
  
  @scala.inline
  def apply(): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  implicit class TriggerOps[Self <: Trigger] (val x: Self) extends AnyVal {
    
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
    def deleteActions: Self = this.set("Actions", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setId(value: IdString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPredicate(value: Predicate): Self = this.set("Predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredicate: Self = this.set("Predicate", js.undefined)
    
    @scala.inline
    def setSchedule(value: GenericString): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setState(value: TriggerState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setType(value: TriggerType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setWorkflowName(value: NameString): Self = this.set("WorkflowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowName: Self = this.set("WorkflowName", js.undefined)
  }
}
