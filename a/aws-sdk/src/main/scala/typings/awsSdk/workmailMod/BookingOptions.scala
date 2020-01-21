package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookingOptions extends js.Object {
  /**
    * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the resource.
    */
  var AutoAcceptRequests: js.UndefOr[Boolean] = js.native
  /**
    * The resource's ability to automatically decline any conflicting requests.
    */
  var AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.native
  /**
    * The resource's ability to automatically decline any recurring requests.
    */
  var AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.native
}

object BookingOptions {
  @scala.inline
  def apply(
    AutoAcceptRequests: js.UndefOr[scala.Boolean] = js.undefined,
    AutoDeclineConflictingRequests: js.UndefOr[scala.Boolean] = js.undefined,
    AutoDeclineRecurringRequests: js.UndefOr[scala.Boolean] = js.undefined
  ): BookingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoAcceptRequests)) __obj.updateDynamic("AutoAcceptRequests")(AutoAcceptRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoDeclineConflictingRequests)) __obj.updateDynamic("AutoDeclineConflictingRequests")(AutoDeclineConflictingRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoDeclineRecurringRequests)) __obj.updateDynamic("AutoDeclineRecurringRequests")(AutoDeclineRecurringRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookingOptions]
  }
}

