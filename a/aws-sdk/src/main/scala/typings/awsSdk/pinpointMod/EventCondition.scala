package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCondition extends js.Object {
  /**
    * The dimensions for the event filter to use for the activity.
    */
  var Dimensions: js.UndefOr[EventDimensions] = js.native
  /**
    * The message identifier (message_id) for the message to use when determining whether message events meet the condition.
    */
  var MessageActivity: js.UndefOr[string] = js.native
}

object EventCondition {
  @scala.inline
  def apply(): EventCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCondition]
  }
  @scala.inline
  implicit class EventConditionOps[Self <: EventCondition] (val x: Self) extends AnyVal {
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
    def setDimensions(value: EventDimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setMessageActivity(value: string): Self = this.set("MessageActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageActivity: Self = this.set("MessageActivity", js.undefined)
  }
  
}

