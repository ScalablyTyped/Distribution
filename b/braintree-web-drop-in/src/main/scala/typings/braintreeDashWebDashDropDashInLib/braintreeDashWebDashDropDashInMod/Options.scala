package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var applePay: js.UndefOr[applePayCreateOptions] = js.undefined
  var authorization: java.lang.String
  var card: js.UndefOr[scala.Boolean | cardCreateOptions] = js.undefined
  var container: js.Any
  var dataCollector: js.UndefOr[dataCollectorOptions] = js.undefined
  var googlePay: js.UndefOr[googlePayCreateOptions] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var paymentOptionPriority: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var paypal: js.UndefOr[paypalCreateOptions] = js.undefined
  var paypalCredit: js.UndefOr[paypalCreateOptions] = js.undefined
  var preselectVaultedPaymentMethod: js.UndefOr[scala.Boolean] = js.undefined
  var threeDSecure: js.UndefOr[threeDSecureOptions] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
  var vaultManager: js.UndefOr[scala.Boolean] = js.undefined
  var venmo: js.UndefOr[venmoCreateOptions | scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    authorization: java.lang.String,
    container: js.Any,
    applePay: applePayCreateOptions = null,
    card: scala.Boolean | cardCreateOptions = null,
    dataCollector: dataCollectorOptions = null,
    googlePay: googlePayCreateOptions = null,
    locale: java.lang.String = null,
    paymentOptionPriority: js.Array[java.lang.String] = null,
    paypal: paypalCreateOptions = null,
    paypalCredit: paypalCreateOptions = null,
    preselectVaultedPaymentMethod: js.UndefOr[scala.Boolean] = js.undefined,
    threeDSecure: threeDSecureOptions = null,
    translations: js.Object = null,
    vaultManager: js.UndefOr[scala.Boolean] = js.undefined,
    venmo: venmoCreateOptions | scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal(authorization = authorization, container = container)
    if (applePay != null) __obj.updateDynamic("applePay")(applePay)
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (dataCollector != null) __obj.updateDynamic("dataCollector")(dataCollector)
    if (googlePay != null) __obj.updateDynamic("googlePay")(googlePay)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (paymentOptionPriority != null) __obj.updateDynamic("paymentOptionPriority")(paymentOptionPriority)
    if (paypal != null) __obj.updateDynamic("paypal")(paypal)
    if (paypalCredit != null) __obj.updateDynamic("paypalCredit")(paypalCredit)
    if (!js.isUndefined(preselectVaultedPaymentMethod)) __obj.updateDynamic("preselectVaultedPaymentMethod")(preselectVaultedPaymentMethod)
    if (threeDSecure != null) __obj.updateDynamic("threeDSecure")(threeDSecure)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    if (!js.isUndefined(vaultManager)) __obj.updateDynamic("vaultManager")(vaultManager)
    if (venmo != null) __obj.updateDynamic("venmo")(venmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

