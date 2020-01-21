package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventSubscriptionResponse extends js.Object {
  /**
    * The event subscription that was created.
    */
  var EventSubscription: js.UndefOr[typings.awsSdk.dmsMod.EventSubscription] = js.native
}

object CreateEventSubscriptionResponse {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): CreateEventSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventSubscriptionResponse]
  }
}

