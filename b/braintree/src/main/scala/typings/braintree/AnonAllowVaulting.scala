package typings.braintree

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowVaulting extends js.Object {
  var allowVaulting: js.UndefOr[Boolean] = js.undefined
  var includeBillingPostalCode: js.UndefOr[Boolean] = js.undefined
  var revokeAfter: js.UndefOr[Date] = js.undefined
}

object AnonAllowVaulting {
  @scala.inline
  def apply(
    allowVaulting: js.UndefOr[Boolean] = js.undefined,
    includeBillingPostalCode: js.UndefOr[Boolean] = js.undefined,
    revokeAfter: Date = null
  ): AnonAllowVaulting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowVaulting)) __obj.updateDynamic("allowVaulting")(allowVaulting.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBillingPostalCode)) __obj.updateDynamic("includeBillingPostalCode")(includeBillingPostalCode.asInstanceOf[js.Any])
    if (revokeAfter != null) __obj.updateDynamic("revokeAfter")(revokeAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowVaulting]
  }
}

