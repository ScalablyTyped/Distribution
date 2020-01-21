package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDoNotInheritAddOnsOrDiscounts extends js.Object {
  var doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.undefined
  var paypal: js.UndefOr[AnonDescription] = js.undefined
  var startImmediately: js.UndefOr[Boolean] = js.undefined
}

object AnonDoNotInheritAddOnsOrDiscounts {
  @scala.inline
  def apply(
    doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.undefined,
    paypal: AnonDescription = null,
    startImmediately: js.UndefOr[Boolean] = js.undefined
  ): AnonDoNotInheritAddOnsOrDiscounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doNotInheritAddOnsOrDiscounts)) __obj.updateDynamic("doNotInheritAddOnsOrDiscounts")(doNotInheritAddOnsOrDiscounts.asInstanceOf[js.Any])
    if (paypal != null) __obj.updateDynamic("paypal")(paypal.asInstanceOf[js.Any])
    if (!js.isUndefined(startImmediately)) __obj.updateDynamic("startImmediately")(startImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoNotInheritAddOnsOrDiscounts]
  }
}

