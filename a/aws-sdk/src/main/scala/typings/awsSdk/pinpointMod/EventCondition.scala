package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCondition extends js.Object {
  /**
    * The dimensions for the event filter to use for the activity.
    */
  var Dimensions: EventDimensions = js.native
  /**
    * The message identifier (message_id) for the message to use when determining whether message events meet the condition.
    */
  var MessageActivity: js.UndefOr[string] = js.native
}

object EventCondition {
  @scala.inline
  def apply(Dimensions: EventDimensions, MessageActivity: string = null): EventCondition = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any])
    if (MessageActivity != null) __obj.updateDynamic("MessageActivity")(MessageActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCondition]
  }
}

