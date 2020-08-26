package typings.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var applePay: js.UndefOr[applePayCreateOptions] = js.native
  var authorization: String = js.native
  var card: js.UndefOr[Boolean | cardCreateOptions] = js.native
  var container: js.Any = js.native
  var dataCollector: js.UndefOr[dataCollectorOptions] = js.native
  var googlePay: js.UndefOr[googlePayCreateOptions] = js.native
  var locale: js.UndefOr[String] = js.native
  var paymentOptionPriority: js.UndefOr[js.Array[String]] = js.native
  var paypal: js.UndefOr[paypalCreateOptions] = js.native
  var paypalCredit: js.UndefOr[paypalCreateOptions] = js.native
  var preselectVaultedPaymentMethod: js.UndefOr[Boolean] = js.native
  var threeDSecure: js.UndefOr[threeDSecureOptions] = js.native
  var translations: js.UndefOr[js.Object] = js.native
  var vaultManager: js.UndefOr[Boolean] = js.native
  var venmo: js.UndefOr[venmoCreateOptions | Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(authorization: String, container: js.Any): Options = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplePay(value: applePayCreateOptions): Self = this.set("applePay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplePay: Self = this.set("applePay", js.undefined)
    @scala.inline
    def setCard(value: Boolean | cardCreateOptions): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setDataCollector(value: dataCollectorOptions): Self = this.set("dataCollector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataCollector: Self = this.set("dataCollector", js.undefined)
    @scala.inline
    def setGooglePay(value: googlePayCreateOptions): Self = this.set("googlePay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGooglePay: Self = this.set("googlePay", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPaymentOptionPriorityVarargs(value: String*): Self = this.set("paymentOptionPriority", js.Array(value :_*))
    @scala.inline
    def setPaymentOptionPriority(value: js.Array[String]): Self = this.set("paymentOptionPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentOptionPriority: Self = this.set("paymentOptionPriority", js.undefined)
    @scala.inline
    def setPaypal(value: paypalCreateOptions): Self = this.set("paypal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaypal: Self = this.set("paypal", js.undefined)
    @scala.inline
    def setPaypalCredit(value: paypalCreateOptions): Self = this.set("paypalCredit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaypalCredit: Self = this.set("paypalCredit", js.undefined)
    @scala.inline
    def setPreselectVaultedPaymentMethod(value: Boolean): Self = this.set("preselectVaultedPaymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreselectVaultedPaymentMethod: Self = this.set("preselectVaultedPaymentMethod", js.undefined)
    @scala.inline
    def setThreeDSecure(value: threeDSecureOptions): Self = this.set("threeDSecure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreeDSecure: Self = this.set("threeDSecure", js.undefined)
    @scala.inline
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setVaultManager(value: Boolean): Self = this.set("vaultManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVaultManager: Self = this.set("vaultManager", js.undefined)
    @scala.inline
    def setVenmo(value: venmoCreateOptions | Boolean): Self = this.set("venmo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVenmo: Self = this.set("venmo", js.undefined)
  }
  
}

