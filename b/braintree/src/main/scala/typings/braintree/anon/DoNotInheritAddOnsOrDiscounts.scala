package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoNotInheritAddOnsOrDiscounts extends js.Object {
  var doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.undefined
  var paypal: js.UndefOr[Description] = js.undefined
  var startImmediately: js.UndefOr[Boolean] = js.undefined
}

object DoNotInheritAddOnsOrDiscounts {
  @scala.inline
  def apply(
    doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.undefined,
    paypal: Description = null,
    startImmediately: js.UndefOr[Boolean] = js.undefined
  ): DoNotInheritAddOnsOrDiscounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doNotInheritAddOnsOrDiscounts)) __obj.updateDynamic("doNotInheritAddOnsOrDiscounts")(doNotInheritAddOnsOrDiscounts.get.asInstanceOf[js.Any])
    if (paypal != null) __obj.updateDynamic("paypal")(paypal.asInstanceOf[js.Any])
    if (!js.isUndefined(startImmediately)) __obj.updateDynamic("startImmediately")(startImmediately.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotInheritAddOnsOrDiscounts]
  }
}

