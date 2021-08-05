package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTriggerRequest extends StObject {
  
  /**
    * The actions initiated by this trigger when it fires.
    */
  var Actions: ActionList
  
  /**
    * A description of the new trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The name of the trigger.
    */
  var Name: NameString
  
  /**
    * A predicate to specify when the new trigger should fire. This field is required when the trigger type is CONDITIONAL.
    */
  var Predicate: js.UndefOr[typings.awsSdk.glueMod.Predicate] = js.undefined
  
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *). This field is required when the trigger type is SCHEDULED.
    */
  var Schedule: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True is not supported for ON_DEMAND triggers.
    */
  var StartOnCreation: js.UndefOr[BooleanValue] = js.undefined
  
  /**
    * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide. 
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * The type of the new trigger.
    */
  var Type: TriggerType
  
  /**
    * The name of the workflow associated with the trigger.
    */
  var WorkflowName: js.UndefOr[NameString] = js.undefined
}
object CreateTriggerRequest {
  
  inline def apply(Actions: ActionList, Name: NameString, Type: TriggerType): CreateTriggerRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTriggerRequest]
  }
  
  extension [Self <: CreateTriggerRequest](x: Self) {
    
    inline def setActions(value: ActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: Predicate): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateUndefined: Self = StObject.set(x, "Predicate", js.undefined)
    
    inline def setSchedule(value: GenericString): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setStartOnCreation(value: BooleanValue): Self = StObject.set(x, "StartOnCreation", value.asInstanceOf[js.Any])
    
    inline def setStartOnCreationUndefined: Self = StObject.set(x, "StartOnCreation", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: TriggerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWorkflowName(value: NameString): Self = StObject.set(x, "WorkflowName", value.asInstanceOf[js.Any])
    
    inline def setWorkflowNameUndefined: Self = StObject.set(x, "WorkflowName", js.undefined)
  }
}
