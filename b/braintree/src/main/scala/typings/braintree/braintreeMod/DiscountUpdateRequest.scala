package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscountUpdateRequest extends js.Object {
  var amount: js.UndefOr[String] = js.undefined
  var existingId: String
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
}

object DiscountUpdateRequest {
  @scala.inline
  def apply(
    existingId: String,
    amount: String = null,
    neverExpires: js.UndefOr[Boolean] = js.undefined,
    numberOfBillingCycles: Int | Double = null,
    quantity: Int | Double = null
  ): DiscountUpdateRequest = {
    val __obj = js.Dynamic.literal(existingId = existingId.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (!js.isUndefined(neverExpires)) __obj.updateDynamic("neverExpires")(neverExpires.asInstanceOf[js.Any])
    if (numberOfBillingCycles != null) __obj.updateDynamic("numberOfBillingCycles")(numberOfBillingCycles.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountUpdateRequest]
  }
}

