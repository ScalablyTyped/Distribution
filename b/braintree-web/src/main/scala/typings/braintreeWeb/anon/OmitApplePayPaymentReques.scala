package typings.braintreeWeb.anon

import typings.braintreeWeb.modulesApplePayMod.ApplePayLineItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<braintree-web.braintree-web/modules/apple-pay.ApplePayPaymentRequest, 'countryCode' | 'currencyCode' | 'merchantCapabilities' | 'supportedNetworks'> & std.Partial<std.Pick<braintree-web.braintree-web/modules/apple-pay.ApplePayPaymentRequest, 'countryCode' | 'currencyCode' | 'merchantCapabilities' | 'supportedNetworks'>> */
trait OmitApplePayPaymentReques extends StObject {
  
  var billingContact: js.UndefOr[Any] = js.undefined
  
  var countryCode: js.UndefOr[String] = js.undefined
  
  var currencyCode: js.UndefOr[String] = js.undefined
  
  var lineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  
  var merchantCapabilities: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiredBillingContactFields: js.UndefOr[Any] = js.undefined
  
  var requiredShippingContactFields: js.UndefOr[Any] = js.undefined
  
  var shippingContact: js.UndefOr[Any] = js.undefined
  
  var shippingMethods: js.UndefOr[Any] = js.undefined
  
  var shippingType: js.UndefOr[Any] = js.undefined
  
  var supportedNetworks: js.UndefOr[js.Array[String]] = js.undefined
  
  var total: Amount
}
object OmitApplePayPaymentReques {
  
  inline def apply(total: Amount): OmitApplePayPaymentReques = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitApplePayPaymentReques]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitApplePayPaymentReques] (val x: Self) extends AnyVal {
    
    inline def setBillingContact(value: Any): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    inline def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setMerchantCapabilities(value: js.Array[String]): Self = StObject.set(x, "merchantCapabilities", value.asInstanceOf[js.Any])
    
    inline def setMerchantCapabilitiesUndefined: Self = StObject.set(x, "merchantCapabilities", js.undefined)
    
    inline def setMerchantCapabilitiesVarargs(value: String*): Self = StObject.set(x, "merchantCapabilities", js.Array(value*))
    
    inline def setRequiredBillingContactFields(value: Any): Self = StObject.set(x, "requiredBillingContactFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredBillingContactFieldsUndefined: Self = StObject.set(x, "requiredBillingContactFields", js.undefined)
    
    inline def setRequiredShippingContactFields(value: Any): Self = StObject.set(x, "requiredShippingContactFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredShippingContactFieldsUndefined: Self = StObject.set(x, "requiredShippingContactFields", js.undefined)
    
    inline def setShippingContact(value: Any): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    inline def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    inline def setShippingMethods(value: Any): Self = StObject.set(x, "shippingMethods", value.asInstanceOf[js.Any])
    
    inline def setShippingMethodsUndefined: Self = StObject.set(x, "shippingMethods", js.undefined)
    
    inline def setShippingType(value: Any): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
    
    inline def setShippingTypeUndefined: Self = StObject.set(x, "shippingType", js.undefined)
    
    inline def setSupportedNetworks(value: js.Array[String]): Self = StObject.set(x, "supportedNetworks", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworksUndefined: Self = StObject.set(x, "supportedNetworks", js.undefined)
    
    inline def setSupportedNetworksVarargs(value: String*): Self = StObject.set(x, "supportedNetworks", js.Array(value*))
    
    inline def setTotal(value: Amount): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
