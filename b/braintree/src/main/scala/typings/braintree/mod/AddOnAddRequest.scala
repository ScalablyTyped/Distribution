package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOnAddRequest extends js.Object {
  var amount: js.UndefOr[String] = js.undefined
  var inheritedFromId: String
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
}

object AddOnAddRequest {
  @scala.inline
  def apply(
    inheritedFromId: String,
    amount: String = null,
    neverExpires: js.UndefOr[Boolean] = js.undefined,
    numberOfBillingCycles: js.UndefOr[Double] = js.undefined,
    quantity: js.UndefOr[Double] = js.undefined
  ): AddOnAddRequest = {
    val __obj = js.Dynamic.literal(inheritedFromId = inheritedFromId.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (!js.isUndefined(neverExpires)) __obj.updateDynamic("neverExpires")(neverExpires.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfBillingCycles)) __obj.updateDynamic("numberOfBillingCycles")(numberOfBillingCycles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnAddRequest]
  }
}

