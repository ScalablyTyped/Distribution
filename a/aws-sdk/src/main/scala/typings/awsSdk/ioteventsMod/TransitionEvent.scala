package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionEvent extends StObject {
  
  /**
    * The actions to be performed.
    */
  var actions: js.UndefOr[Actions] = js.undefined
  
  /**
    * Required. A Boolean expression that when TRUE causes the actions to be performed and the nextState to be entered.
    */
  var condition: Condition
  
  /**
    * The name of the transition event.
    */
  var eventName: EventName
  
  /**
    * The next state to enter.
    */
  var nextState: StateName
}
object TransitionEvent {
  
  inline def apply(condition: Condition, eventName: EventName, nextState: StateName): TransitionEvent = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEvent]
  }
  
  extension [Self <: TransitionEvent](x: Self) {
    
    inline def setActions(value: Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: EventName): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setNextState(value: StateName): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
  }
}
