package typings.braintreeWebDropIn.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var applePay: js.UndefOr[applePayCreateOptions] = js.native
  
  var authorization: String = js.native
  
  var card: js.UndefOr[Boolean | cardCreateOptions] = js.native
  
  var container: String | HTMLElement = js.native
  
  var dataCollector: js.UndefOr[dataCollectorOptions | Boolean] = js.native
  
  var googlePay: js.UndefOr[googlePayCreateOptions] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var paymentOptionPriority: js.UndefOr[js.Array[String]] = js.native
  
  var paypal: js.UndefOr[paypalCreateOptions] = js.native
  
  var paypalCredit: js.UndefOr[paypalCreateOptions] = js.native
  
  var preselectVaultedPaymentMethod: js.UndefOr[Boolean] = js.native
  
  var threeDSecure: js.UndefOr[Boolean | threeDSecureOptions] = js.native
  
  var translations: js.UndefOr[js.Object] = js.native
  
  var vaultManager: js.UndefOr[Boolean] = js.native
  
  var venmo: js.UndefOr[venmoCreateOptions | Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(authorization: String, container: String | HTMLElement): Options = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplePay(value: applePayCreateOptions): Self = StObject.set(x, "applePay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplePayUndefined: Self = StObject.set(x, "applePay", js.undefined)
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard(value: Boolean | cardCreateOptions): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCollector(value: dataCollectorOptions | Boolean): Self = StObject.set(x, "dataCollector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCollectorUndefined: Self = StObject.set(x, "dataCollector", js.undefined)
    
    @scala.inline
    def setGooglePay(value: googlePayCreateOptions): Self = StObject.set(x, "googlePay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePayUndefined: Self = StObject.set(x, "googlePay", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setPaymentOptionPriority(value: js.Array[String]): Self = StObject.set(x, "paymentOptionPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionPriorityUndefined: Self = StObject.set(x, "paymentOptionPriority", js.undefined)
    
    @scala.inline
    def setPaymentOptionPriorityVarargs(value: String*): Self = StObject.set(x, "paymentOptionPriority", js.Array(value :_*))
    
    @scala.inline
    def setPaypal(value: paypalCreateOptions): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaypalCredit(value: paypalCreateOptions): Self = StObject.set(x, "paypalCredit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaypalCreditUndefined: Self = StObject.set(x, "paypalCredit", js.undefined)
    
    @scala.inline
    def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
    
    @scala.inline
    def setPreselectVaultedPaymentMethod(value: Boolean): Self = StObject.set(x, "preselectVaultedPaymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreselectVaultedPaymentMethodUndefined: Self = StObject.set(x, "preselectVaultedPaymentMethod", js.undefined)
    
    @scala.inline
    def setThreeDSecure(value: Boolean | threeDSecureOptions): Self = StObject.set(x, "threeDSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeDSecureUndefined: Self = StObject.set(x, "threeDSecure", js.undefined)
    
    @scala.inline
    def setTranslations(value: js.Object): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setVaultManager(value: Boolean): Self = StObject.set(x, "vaultManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultManagerUndefined: Self = StObject.set(x, "vaultManager", js.undefined)
    
    @scala.inline
    def setVenmo(value: venmoCreateOptions | Boolean): Self = StObject.set(x, "venmo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVenmoUndefined: Self = StObject.set(x, "venmo", js.undefined)
  }
}
