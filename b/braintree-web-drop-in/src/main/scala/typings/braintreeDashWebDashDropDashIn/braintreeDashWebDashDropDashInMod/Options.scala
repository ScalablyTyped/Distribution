package typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var applePay: js.UndefOr[applePayCreateOptions] = js.undefined
  var authorization: String
  var card: js.UndefOr[Boolean | cardCreateOptions] = js.undefined
  var container: js.Any
  var dataCollector: js.UndefOr[dataCollectorOptions] = js.undefined
  var googlePay: js.UndefOr[googlePayCreateOptions] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var paymentOptionPriority: js.UndefOr[js.Array[String]] = js.undefined
  var paypal: js.UndefOr[paypalCreateOptions] = js.undefined
  var paypalCredit: js.UndefOr[paypalCreateOptions] = js.undefined
  var preselectVaultedPaymentMethod: js.UndefOr[Boolean] = js.undefined
  var threeDSecure: js.UndefOr[threeDSecureOptions] = js.undefined
  var translations: js.UndefOr[js.Object] = js.undefined
  var vaultManager: js.UndefOr[Boolean] = js.undefined
  var venmo: js.UndefOr[venmoCreateOptions | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    authorization: String,
    container: js.Any,
    applePay: applePayCreateOptions = null,
    card: Boolean | cardCreateOptions = null,
    dataCollector: dataCollectorOptions = null,
    googlePay: googlePayCreateOptions = null,
    locale: String = null,
    paymentOptionPriority: js.Array[String] = null,
    paypal: paypalCreateOptions = null,
    paypalCredit: paypalCreateOptions = null,
    preselectVaultedPaymentMethod: js.UndefOr[Boolean] = js.undefined,
    threeDSecure: threeDSecureOptions = null,
    translations: js.Object = null,
    vaultManager: js.UndefOr[Boolean] = js.undefined,
    venmo: venmoCreateOptions | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    if (applePay != null) __obj.updateDynamic("applePay")(applePay.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (dataCollector != null) __obj.updateDynamic("dataCollector")(dataCollector.asInstanceOf[js.Any])
    if (googlePay != null) __obj.updateDynamic("googlePay")(googlePay.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (paymentOptionPriority != null) __obj.updateDynamic("paymentOptionPriority")(paymentOptionPriority.asInstanceOf[js.Any])
    if (paypal != null) __obj.updateDynamic("paypal")(paypal.asInstanceOf[js.Any])
    if (paypalCredit != null) __obj.updateDynamic("paypalCredit")(paypalCredit.asInstanceOf[js.Any])
    if (!js.isUndefined(preselectVaultedPaymentMethod)) __obj.updateDynamic("preselectVaultedPaymentMethod")(preselectVaultedPaymentMethod.asInstanceOf[js.Any])
    if (threeDSecure != null) __obj.updateDynamic("threeDSecure")(threeDSecure.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (!js.isUndefined(vaultManager)) __obj.updateDynamic("vaultManager")(vaultManager.asInstanceOf[js.Any])
    if (venmo != null) __obj.updateDynamic("venmo")(venmo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

