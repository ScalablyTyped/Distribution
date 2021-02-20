package typings.braintree.mod

import typings.braintree.anon.CountryCodeAlpha2
import typings.braintree.anon.VerificationAcmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentMethodUpdateRequest extends StObject {
  
  var billingAddress: js.UndefOr[CountryCodeAlpha2] = js.native
  
  var billingAddressId: js.UndefOr[String] = js.native
  
  var cardholderName: js.UndefOr[String] = js.native
  
  var cvv: js.UndefOr[String] = js.native
  
  var deviceData: js.UndefOr[String] = js.native
  
  var expirationDate: js.UndefOr[String] = js.native
  
  var expirationMonth: js.UndefOr[String] = js.native
  
  var expirationYear: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[VerificationAcmount] = js.native
  
  var paymentMethodNonce: js.UndefOr[String] = js.native
}
object PaymentMethodUpdateRequest {
  
  @scala.inline
  def apply(): PaymentMethodUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodUpdateRequest]
  }
  
  @scala.inline
  implicit class PaymentMethodUpdateRequestMutableBuilder[Self <: PaymentMethodUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAddress(value: CountryCodeAlpha2): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressId(value: String): Self = StObject.set(x, "billingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressIdUndefined: Self = StObject.set(x, "billingAddressId", js.undefined)
    
    @scala.inline
    def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    @scala.inline
    def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    @scala.inline
    def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    @scala.inline
    def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOptions(value: VerificationAcmount): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodNonceUndefined: Self = StObject.set(x, "paymentMethodNonce", js.undefined)
  }
}
