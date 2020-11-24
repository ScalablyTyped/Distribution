package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionEvent extends js.Object {
  
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
  implicit class TransitionEventOps[Self <: TransitionEvent] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventName(value: EventName): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextState(value: StateName): Self = this.set("nextState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: Actions): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
  }
}
