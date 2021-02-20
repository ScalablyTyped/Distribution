package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankDetails extends StObject {
  
  var bankDetails: js.Any = js.native
  
  var bankLogin: js.Any = js.native
  
  var mandateText: String = js.native
}
object BankDetails {
  
  @scala.inline
  def apply(bankDetails: js.Any, bankLogin: js.Any, mandateText: String): BankDetails = {
    val __obj = js.Dynamic.literal(bankDetails = bankDetails.asInstanceOf[js.Any], bankLogin = bankLogin.asInstanceOf[js.Any], mandateText = mandateText.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankDetails]
  }
  
  @scala.inline
  implicit class BankDetailsMutableBuilder[Self <: BankDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBankDetails(value: js.Any): Self = StObject.set(x, "bankDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankLogin(value: js.Any): Self = StObject.set(x, "bankLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandateText(value: String): Self = StObject.set(x, "mandateText", value.asInstanceOf[js.Any])
  }
}
