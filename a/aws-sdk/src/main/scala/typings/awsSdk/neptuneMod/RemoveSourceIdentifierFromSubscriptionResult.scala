package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[typings.awsSdk.neptuneMod.EventSubscription] = js.native
}

object RemoveSourceIdentifierFromSubscriptionResult {
  @scala.inline
  def apply(EventSubscription: EventSubscription = null): RemoveSourceIdentifierFromSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    if (EventSubscription != null) __obj.updateDynamic("EventSubscription")(EventSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
  }
}

