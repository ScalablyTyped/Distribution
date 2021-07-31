package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The actions to be performed.
    */
  var actions: js.UndefOr[Actions] = js.undefined
  
  /**
    * Optional. The Boolean expression that, when TRUE, causes the actions to be performed. If not present, the actions are performed (=TRUE). If the expression result is not a Boolean value, the actions are not performed (=FALSE).
    */
  var condition: js.UndefOr[Condition] = js.undefined
  
  /**
    * The name of the event.
    */
  var eventName: EventName
}
object Event {
  
  @scala.inline
  def apply(eventName: EventName): Event = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setEventName(value: EventName): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
  }
}
