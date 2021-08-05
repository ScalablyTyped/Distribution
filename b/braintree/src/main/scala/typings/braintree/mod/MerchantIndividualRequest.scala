package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantIndividualRequest extends StObject {
  
  var address: MerchantAddressDetails
  
  var dateOfBirth: String
  
  var email: String
  
  var firstName: String
  
  var lastName: String
  
  var phone: js.UndefOr[String] = js.undefined
  
  var ssn: js.UndefOr[String] = js.undefined
  
  var ssnLast4: js.UndefOr[String] = js.undefined
}
object MerchantIndividualRequest {
  
  inline def apply(
    address: MerchantAddressDetails,
    dateOfBirth: String,
    email: String,
    firstName: String,
    lastName: String
  ): MerchantIndividualRequest = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], dateOfBirth = dateOfBirth.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantIndividualRequest]
  }
  
  extension [Self <: MerchantIndividualRequest](x: Self) {
    
    inline def setAddress(value: MerchantAddressDetails): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setDateOfBirth(value: String): Self = StObject.set(x, "dateOfBirth", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setSsn(value: String): Self = StObject.set(x, "ssn", value.asInstanceOf[js.Any])
    
    inline def setSsnLast4(value: String): Self = StObject.set(x, "ssnLast4", value.asInstanceOf[js.Any])
    
    inline def setSsnLast4Undefined: Self = StObject.set(x, "ssnLast4", js.undefined)
    
    inline def setSsnUndefined: Self = StObject.set(x, "ssn", js.undefined)
  }
}
