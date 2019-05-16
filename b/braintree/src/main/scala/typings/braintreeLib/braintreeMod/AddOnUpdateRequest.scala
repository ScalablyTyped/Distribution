package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOnUpdateRequest extends js.Object {
  var amount: js.UndefOr[java.lang.String] = js.undefined
  var existingId: java.lang.String
  var neverExpires: js.UndefOr[scala.Boolean] = js.undefined
  var numberOfBillingCycles: js.UndefOr[scala.Double] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

object AddOnUpdateRequest {
  @scala.inline
  def apply(
    existingId: java.lang.String,
    amount: java.lang.String = null,
    neverExpires: js.UndefOr[scala.Boolean] = js.undefined,
    numberOfBillingCycles: scala.Int | scala.Double = null,
    quantity: scala.Int | scala.Double = null
  ): AddOnUpdateRequest = {
    val __obj = js.Dynamic.literal(existingId = existingId)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (!js.isUndefined(neverExpires)) __obj.updateDynamic("neverExpires")(neverExpires)
    if (numberOfBillingCycles != null) __obj.updateDynamic("numberOfBillingCycles")(numberOfBillingCycles.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnUpdateRequest]
  }
}

