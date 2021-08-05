package typings.braintree.mod

import typings.braintree.anon.CountryCodeAlpha2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditCardUpdateRequest extends StObject {
  
  var billingAddress: js.UndefOr[CountryCodeAlpha2] = js.undefined
  
  var cardholderName: js.UndefOr[String] = js.undefined
  
  var cvv: js.UndefOr[String] = js.undefined
  
  var expirationDate: js.UndefOr[String] = js.undefined
  
  var expirationMonth: js.UndefOr[String] = js.undefined
  
  var expirationYear: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
}
object CreditCardUpdateRequest {
  
  inline def apply(): CreditCardUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditCardUpdateRequest]
  }
  
  extension [Self <: CreditCardUpdateRequest](x: Self) {
    
    inline def setBillingAddress(value: CountryCodeAlpha2): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
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
  }
}
