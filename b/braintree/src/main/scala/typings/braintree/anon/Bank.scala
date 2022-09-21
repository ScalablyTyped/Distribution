package typings.braintree.anon

import typings.braintree.braintreeStrings.bank
import typings.braintree.braintreeStrings.email
import typings.braintree.braintreeStrings.mobile_phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bank extends StObject {
  
  var Bank: bank
  
  var Email: email
  
  var MobilePhone: mobile_phone
}
object Bank {
  
  inline def apply(): Bank = {
    val __obj = js.Dynamic.literal(Bank = "bank", Email = "email", MobilePhone = "mobile_phone")
    __obj.asInstanceOf[Bank]
  }
  
  extension [Self <: Bank](x: Self) {
    
    inline def setBank(value: bank): Self = StObject.set(x, "Bank", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setMobilePhone(value: mobile_phone): Self = StObject.set(x, "MobilePhone", value.asInstanceOf[js.Any])
  }
}
