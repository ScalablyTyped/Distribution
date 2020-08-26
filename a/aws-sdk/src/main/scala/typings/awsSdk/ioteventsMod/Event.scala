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
    * Optional. The Boolean expression that, when TRUE, causes the actions to be performed. If not present, the actions are performed (=TRUE). If the expression result is not a Boolean value, the actions are not performed (=FALSE).
    */
  var condition: js.UndefOr[Condition] = js.native
  /**
    * The name of the event.
    */
  var eventName: EventName = js.native
}

object Event {
  @scala.inline
  def apply(eventName: EventName): Event = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setEventName(value: EventName): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: Actions): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
  }
  
}

