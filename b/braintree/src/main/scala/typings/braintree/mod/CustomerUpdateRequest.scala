package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerUpdateRequest extends StObject {
  
  var company: js.UndefOr[String] = js.undefined
  
  var creditCard: js.UndefOr[CreditCardUpdateRequest] = js.undefined
  
  var customFields: js.UndefOr[js.Any] = js.undefined
  
  var defaultPaymentMethodToken: js.UndefOr[String] = js.undefined
  
  var deviceData: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var fax: js.UndefOr[String] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var paymentMethodNonce: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[String] = js.undefined
  
  var riskData: js.UndefOr[CustomerRiskData] = js.undefined
  
  var website: js.UndefOr[String] = js.undefined
}
object CustomerUpdateRequest {
  
  @scala.inline
  def apply(): CustomerUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerUpdateRequest]
  }
  
  @scala.inline
  implicit class CustomerUpdateRequestMutableBuilder[Self <: CustomerUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    @scala.inline
    def setCreditCard(value: CreditCardUpdateRequest): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    @scala.inline
    def setCustomFields(value: js.Any): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setDefaultPaymentMethodToken(value: String): Self = StObject.set(x, "defaultPaymentMethodToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPaymentMethodTokenUndefined: Self = StObject.set(x, "defaultPaymentMethodToken", js.undefined)
    
    @scala.inline
    def setDeviceData(value: String): Self = StObject.set(x, "deviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDataUndefined: Self = StObject.set(x, "deviceData", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodNonceUndefined: Self = StObject.set(x, "paymentMethodNonce", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setRiskData(value: CustomerRiskData): Self = StObject.set(x, "riskData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskDataUndefined: Self = StObject.set(x, "riskData", js.undefined)
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
