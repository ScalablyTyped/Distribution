package typings.braintree.mod

import typings.braintree.anon.Company
import typings.braintree.anon.MakeDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditCardCreateRequest extends StObject {
  
  var billingAddress: js.UndefOr[Company] = js.undefined
  
  var billingAddressId: js.UndefOr[String] = js.undefined
  
  var cardholderName: js.UndefOr[String] = js.undefined
  
  var customerId: String
  
  var cvv: js.UndefOr[String] = js.undefined
  
  var expirationDate: js.UndefOr[String] = js.undefined
  
  var expirationMonth: js.UndefOr[String] = js.undefined
  
  var expirationYear: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[MakeDefault] = js.undefined
  
  var paymentMethodNonce: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object CreditCardCreateRequest {
  
  inline def apply(customerId: String): CreditCardCreateRequest = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreditCardCreateRequest]
  }
  
  extension [Self <: CreditCardCreateRequest](x: Self) {
    
    inline def setBillingAddress(value: Company): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressId(value: String): Self = StObject.set(x, "billingAddressId", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressIdUndefined: Self = StObject.set(x, "billingAddressId", js.undefined)
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    inline def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOptions(value: MakeDefault): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodNonceUndefined: Self = StObject.set(x, "paymentMethodNonce", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
