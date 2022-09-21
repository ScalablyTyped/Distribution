package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerUpdate extends StObject {
  
  /**
    * The actions initiated by this trigger.
    */
  var Actions: js.UndefOr[ActionList] = js.undefined
  
  /**
    * A description of this trigger.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires.
    */
  var EventBatchingCondition: js.UndefOr[typings.awsSdk.glueMod.EventBatchingCondition] = js.undefined
  
  /**
    * Reserved for future use.
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
}
object TriggerUpdate {
  
  inline def apply(): TriggerUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerUpdate]
  }
  
  extension [Self <: TriggerUpdate](x: Self) {
    
    inline def setActions(value: ActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventBatchingCondition(value: EventBatchingCondition): Self = StObject.set(x, "EventBatchingCondition", value.asInstanceOf[js.Any])
    
    inline def setEventBatchingConditionUndefined: Self = StObject.set(x, "EventBatchingCondition", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPredicate(value: Predicate): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateUndefined: Self = StObject.set(x, "Predicate", js.undefined)
    
    inline def setSchedule(value: GenericString): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
  }
}
