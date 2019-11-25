package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DoNotInheritAddOnsOrDiscounts extends js.Object {
  var doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.undefined
  var paypal: js.UndefOr[Anon_Description] = js.undefined
  var startImmediately: js.UndefOr[Boolean] = js.undefined
}

object Anon_DoNotInheritAddOnsOrDiscounts {
  @scala.inline
  def apply(
    doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.undefined,
    paypal: Anon_Description = null,
    startImmediately: js.UndefOr[Boolean] = js.undefined
  ): Anon_DoNotInheritAddOnsOrDiscounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doNotInheritAddOnsOrDiscounts)) __obj.updateDynamic("doNotInheritAddOnsOrDiscounts")(doNotInheritAddOnsOrDiscounts.asInstanceOf[js.Any])
    if (paypal != null) __obj.updateDynamic("paypal")(paypal.asInstanceOf[js.Any])
    if (!js.isUndefined(startImmediately)) __obj.updateDynamic("startImmediately")(startImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DoNotInheritAddOnsOrDiscounts]
  }
}

