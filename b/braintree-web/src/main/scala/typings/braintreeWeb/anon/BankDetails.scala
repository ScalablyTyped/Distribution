package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankDetails extends StObject {
  
  var bankDetails: js.Any
  
  var bankLogin: js.Any
  
  var mandateText: String
}
object BankDetails {
  
  inline def apply(bankDetails: js.Any, bankLogin: js.Any, mandateText: String): BankDetails = {
    val __obj = js.Dynamic.literal(bankDetails = bankDetails.asInstanceOf[js.Any], bankLogin = bankLogin.asInstanceOf[js.Any], mandateText = mandateText.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankDetails]
  }
  
  extension [Self <: BankDetails](x: Self) {
    
    inline def setBankDetails(value: js.Any): Self = StObject.set(x, "bankDetails", value.asInstanceOf[js.Any])
    
    inline def setBankLogin(value: js.Any): Self = StObject.set(x, "bankLogin", value.asInstanceOf[js.Any])
    
    inline def setMandateText(value: String): Self = StObject.set(x, "mandateText", value.asInstanceOf[js.Any])
  }
}
