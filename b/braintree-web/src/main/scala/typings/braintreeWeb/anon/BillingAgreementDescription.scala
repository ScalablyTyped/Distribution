package typings.braintreeWeb.anon

import typings.braintreeWeb.paypalMod.PayPalShippingAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingAgreementDescription extends StObject {
  
  var amount: js.UndefOr[String | Double] = js.native
  
  var billingAgreementDescription: js.UndefOr[String] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var enableShippingAddress: js.UndefOr[Boolean] = js.native
  
  var flow: String = js.native
  
  var intent: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var offerCredit: js.UndefOr[Boolean] = js.native
  
  var shippingAddressEditable: js.UndefOr[Boolean] = js.native
  
  var shippingAddressOverride: js.UndefOr[PayPalShippingAddress] = js.native
  
  var useraction: js.UndefOr[String] = js.native
}
object BillingAgreementDescription {
  
  @scala.inline
  def apply(flow: String): BillingAgreementDescription = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAgreementDescription]
  }
  
  @scala.inline
  implicit class BillingAgreementDescriptionMutableBuilder[Self <: BillingAgreementDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setBillingAgreementDescription(value: String): Self = StObject.set(x, "billingAgreementDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAgreementDescriptionUndefined: Self = StObject.set(x, "billingAgreementDescription", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEnableShippingAddress(value: Boolean): Self = StObject.set(x, "enableShippingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableShippingAddressUndefined: Self = StObject.set(x, "enableShippingAddress", js.undefined)
    
    @scala.inline
    def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setOfferCredit(value: Boolean): Self = StObject.set(x, "offerCredit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferCreditUndefined: Self = StObject.set(x, "offerCredit", js.undefined)
    
    @scala.inline
    def setShippingAddressEditable(value: Boolean): Self = StObject.set(x, "shippingAddressEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressEditableUndefined: Self = StObject.set(x, "shippingAddressEditable", js.undefined)
    
    @scala.inline
    def setShippingAddressOverride(value: PayPalShippingAddress): Self = StObject.set(x, "shippingAddressOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressOverrideUndefined: Self = StObject.set(x, "shippingAddressOverride", js.undefined)
    
    @scala.inline
    def setUseraction(value: String): Self = StObject.set(x, "useraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseractionUndefined: Self = StObject.set(x, "useraction", js.undefined)
  }
}
