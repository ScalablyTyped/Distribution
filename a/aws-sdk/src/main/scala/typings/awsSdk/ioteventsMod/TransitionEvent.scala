package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionEvent extends StObject {
  
  /**
    * The actions to be performed.
    */
  var actions: js.UndefOr[Actions] = js.native
  
  /**
    * Required. A Boolean expression that when TRUE causes the actions to be performed and the nextState to be entered.
    */
  var condition: Condition = js.native
  
  /**
    * The name of the transition event.
    */
  var eventName: EventName = js.native
  
  /**
    * The next state to enter.
    */
  var nextState: StateName = js.native
}
object TransitionEvent {
  
  @scala.inline
  def apply(condition: Condition, eventName: EventName, nextState: StateName): TransitionEvent = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEvent]
  }
  
  @scala.inline
  implicit class TransitionEventMutableBuilder[Self <: TransitionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventName(value: EventName): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextState(value: StateName): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
  }
}
