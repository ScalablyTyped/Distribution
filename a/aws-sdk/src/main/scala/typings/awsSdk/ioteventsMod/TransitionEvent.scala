package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionEvent extends js.Object {
  /**
    * The actions to be performed.
    */
  var actions: js.UndefOr[Actions] = js.native
  /**
    * [Required] A Boolean expression that when TRUE causes the actions to be performed and the "nextState" to be entered.
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
  def apply(condition: Condition, eventName: EventName, nextState: StateName, actions: Actions = null): TransitionEvent = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEvent]
  }
}

