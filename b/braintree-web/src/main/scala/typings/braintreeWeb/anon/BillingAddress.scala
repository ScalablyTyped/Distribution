package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingAddress extends js.Object {
  var billingAddress: js.UndefOr[js.Any] = js.undefined
  var cardholderName: js.UndefOr[String] = js.undefined
  var vault: js.UndefOr[Boolean] = js.undefined
}

object BillingAddress {
  @scala.inline
  def apply(
    billingAddress: js.Any = null,
    cardholderName: String = null,
    vault: js.UndefOr[Boolean] = js.undefined
  ): BillingAddress = {
    val __obj = js.Dynamic.literal()
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (!js.isUndefined(vault)) __obj.updateDynamic("vault")(vault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAddress]
  }
}

