package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var billingAgreementDescription: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var enableShippingAddress: js.UndefOr[scala.Boolean] = js.undefined
  var flow: java.lang.String
  var intent: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var offerCredit: js.UndefOr[scala.Boolean] = js.undefined
  var shippingAddressEditable: js.UndefOr[scala.Boolean] = js.undefined
  var shippingAddressOverride: js.UndefOr[braintreeDashWebLib.braintreeDashWebMod.braintreeNs.PayPalShippingAddress] = js.undefined
  var useraction: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Amount {
  @scala.inline
  def apply(
    flow: java.lang.String,
    amount: java.lang.String | scala.Double = null,
    billingAgreementDescription: java.lang.String = null,
    currency: java.lang.String = null,
    displayName: java.lang.String = null,
    enableShippingAddress: js.UndefOr[scala.Boolean] = js.undefined,
    intent: java.lang.String = null,
    locale: java.lang.String = null,
    offerCredit: js.UndefOr[scala.Boolean] = js.undefined,
    shippingAddressEditable: js.UndefOr[scala.Boolean] = js.undefined,
    shippingAddressOverride: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.PayPalShippingAddress = null,
    useraction: java.lang.String = null
  ): Anon_Amount = {
    val __obj = js.Dynamic.literal(flow = flow)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (billingAgreementDescription != null) __obj.updateDynamic("billingAgreementDescription")(billingAgreementDescription)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enableShippingAddress)) __obj.updateDynamic("enableShippingAddress")(enableShippingAddress)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(offerCredit)) __obj.updateDynamic("offerCredit")(offerCredit)
    if (!js.isUndefined(shippingAddressEditable)) __obj.updateDynamic("shippingAddressEditable")(shippingAddressEditable)
    if (shippingAddressOverride != null) __obj.updateDynamic("shippingAddressOverride")(shippingAddressOverride)
    if (useraction != null) __obj.updateDynamic("useraction")(useraction)
    __obj.asInstanceOf[Anon_Amount]
  }
}

