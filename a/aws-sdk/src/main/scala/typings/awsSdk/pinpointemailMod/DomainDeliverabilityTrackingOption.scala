package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDeliverabilityTrackingOption extends js.Object {
  /**
    * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard subscription.
    */
  var Domain: js.UndefOr[typings.awsSdk.pinpointemailMod.Domain] = js.native
  /**
    * An object that contains information about the inbox placement data settings for the domain.
    */
  var InboxPlacementTrackingOption: js.UndefOr[typings.awsSdk.pinpointemailMod.InboxPlacementTrackingOption] = js.native
  /**
    * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
    */
  var SubscriptionStartDate: js.UndefOr[Timestamp] = js.native
}

object DomainDeliverabilityTrackingOption {
  @scala.inline
  def apply(
    Domain: Domain = null,
    InboxPlacementTrackingOption: InboxPlacementTrackingOption = null,
    SubscriptionStartDate: Timestamp = null
  ): DomainDeliverabilityTrackingOption = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (InboxPlacementTrackingOption != null) __obj.updateDynamic("InboxPlacementTrackingOption")(InboxPlacementTrackingOption.asInstanceOf[js.Any])
    if (SubscriptionStartDate != null) __obj.updateDynamic("SubscriptionStartDate")(SubscriptionStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDeliverabilityTrackingOption]
  }
}

