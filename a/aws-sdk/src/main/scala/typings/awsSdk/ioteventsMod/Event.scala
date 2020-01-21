package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * The actions to be performed.
    */
  var actions: js.UndefOr[Actions] = js.native
  /**
    * [Optional] The Boolean expression that when TRUE causes the "actions" to be performed. If not present, the actions are performed (=TRUE); if the expression result is not a Boolean value, the actions are NOT performed (=FALSE).
    */
  var condition: js.UndefOr[Condition] = js.native
  /**
    * The name of the event.
    */
  var eventName: EventName = js.native
}

object Event {
  @scala.inline
  def apply(eventName: EventName, actions: Actions = null, condition: Condition = null): Event = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

