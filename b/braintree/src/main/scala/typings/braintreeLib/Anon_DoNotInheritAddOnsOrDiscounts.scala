package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DoNotInheritAddOnsOrDiscounts extends js.Object {
  var doNotInheritAddOnsOrDiscounts: js.UndefOr[scala.Boolean] = js.undefined
  var paypal: js.UndefOr[Anon_Description] = js.undefined
  var startImmediately: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DoNotInheritAddOnsOrDiscounts {
  @scala.inline
  def apply(
    doNotInheritAddOnsOrDiscounts: js.UndefOr[scala.Boolean] = js.undefined,
    paypal: Anon_Description = null,
    startImmediately: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DoNotInheritAddOnsOrDiscounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doNotInheritAddOnsOrDiscounts)) __obj.updateDynamic("doNotInheritAddOnsOrDiscounts")(doNotInheritAddOnsOrDiscounts)
    if (paypal != null) __obj.updateDynamic("paypal")(paypal)
    if (!js.isUndefined(startImmediately)) __obj.updateDynamic("startImmediately")(startImmediately)
    __obj.asInstanceOf[Anon_DoNotInheritAddOnsOrDiscounts]
  }
}

