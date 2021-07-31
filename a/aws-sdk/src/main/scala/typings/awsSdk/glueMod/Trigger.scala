package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trigger extends StObject {
  
  /**
    * The actions initiated by this trigger.
    */
  var Actions: js.UndefOr[ActionList] = js.undefined
  
  /**
    * A description of this trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var Id: js.UndefOr[IdString] = js.undefined
  
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * The predicate of this trigger, which defines when it will fire.
    */
  var Predicate: js.UndefOr[typings.awsSdk.glueMod.Predicate] = js.undefined
  
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The current state of the trigger.
    */
  var State: js.UndefOr[TriggerState] = js.undefined
  
  /**
    * The type of trigger that this is.
    */
  var Type: js.UndefOr[TriggerType] = js.undefined
  
  /**
    * The name of the workflow associated with the trigger.
    */
  var WorkflowName: js.UndefOr[NameString] = js.undefined
}
object Trigger {
  
  @scala.inline
  def apply(): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  implicit class TriggerMutableBuilder[Self <: Trigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: IdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPredicate(value: Predicate): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicateUndefined: Self = StObject.set(x, "Predicate", js.undefined)
    
    @scala.inline
    def setSchedule(value: GenericString): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setState(value: TriggerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setType(value: TriggerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setWorkflowName(value: NameString): Self = StObject.set(x, "WorkflowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowNameUndefined: Self = StObject.set(x, "WorkflowName", js.undefined)
  }
}
