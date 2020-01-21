package typings.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBillingAddress extends js.Object {
  var billingAddress: js.UndefOr[js.Any] = js.undefined
  var cardholderName: js.UndefOr[String] = js.undefined
  var vault: js.UndefOr[Boolean] = js.undefined
}

object AnonBillingAddress {
  @scala.inline
  def apply(
    billingAddress: js.Any = null,
    cardholderName: String = null,
    vault: js.UndefOr[Boolean] = js.undefined
  ): AnonBillingAddress = {
    val __obj = js.Dynamic.literal()
    if (billingAddress != null) __obj.updateDynamic("billingAddress")(billingAddress.asInstanceOf[js.Any])
    if (cardholderName != null) __obj.updateDynamic("cardholderName")(cardholderName.asInstanceOf[js.Any])
    if (!js.isUndefined(vault)) __obj.updateDynamic("vault")(vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBillingAddress]
  }
}

