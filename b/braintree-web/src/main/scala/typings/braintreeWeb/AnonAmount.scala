package typings.braintreeWeb

import typings.braintreeWeb.mod.PayPalShippingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmount extends js.Object {
  var amount: js.UndefOr[String | Double] = js.undefined
  var billingAgreementDescription: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var enableShippingAddress: js.UndefOr[Boolean] = js.undefined
  var flow: String
  var intent: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var offerCredit: js.UndefOr[Boolean] = js.undefined
  var shippingAddressEditable: js.UndefOr[Boolean] = js.undefined
  var shippingAddressOverride: js.UndefOr[PayPalShippingAddress] = js.undefined
  var useraction: js.UndefOr[String] = js.undefined
}

object AnonAmount {
  @scala.inline
  def apply(
    flow: String,
    amount: String | Double = null,
    billingAgreementDescription: String = null,
    currency: String = null,
    displayName: String = null,
    enableShippingAddress: js.UndefOr[Boolean] = js.undefined,
    intent: String = null,
    locale: String = null,
    offerCredit: js.UndefOr[Boolean] = js.undefined,
    shippingAddressEditable: js.UndefOr[Boolean] = js.undefined,
    shippingAddressOverride: PayPalShippingAddress = null,
    useraction: String = null
  ): AnonAmount = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (billingAgreementDescription != null) __obj.updateDynamic("billingAgreementDescription")(billingAgreementDescription.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableShippingAddress)) __obj.updateDynamic("enableShippingAddress")(enableShippingAddress.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(offerCredit)) __obj.updateDynamic("offerCredit")(offerCredit.asInstanceOf[js.Any])
    if (!js.isUndefined(shippingAddressEditable)) __obj.updateDynamic("shippingAddressEditable")(shippingAddressEditable.asInstanceOf[js.Any])
    if (shippingAddressOverride != null) __obj.updateDynamic("shippingAddressOverride")(shippingAddressOverride.asInstanceOf[js.Any])
    if (useraction != null) __obj.updateDynamic("useraction")(useraction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmount]
  }
}

