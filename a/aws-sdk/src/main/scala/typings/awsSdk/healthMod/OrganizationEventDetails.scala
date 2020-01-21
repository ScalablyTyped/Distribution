package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationEventDetails extends js.Object {
  /**
    * The 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  var event: js.UndefOr[Event] = js.native
  var eventDescription: js.UndefOr[EventDescription_] = js.native
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[typings.awsSdk.healthMod.eventMetadata] = js.native
}

object OrganizationEventDetails {
  @scala.inline
  def apply(
    awsAccountId: accountId = null,
    event: Event = null,
    eventDescription: EventDescription_ = null,
    eventMetadata: eventMetadata = null
  ): OrganizationEventDetails = {
    val __obj = js.Dynamic.literal()
    if (awsAccountId != null) __obj.updateDynamic("awsAccountId")(awsAccountId.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventDescription != null) __obj.updateDynamic("eventDescription")(eventDescription.asInstanceOf[js.Any])
    if (eventMetadata != null) __obj.updateDynamic("eventMetadata")(eventMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationEventDetails]
  }
}

