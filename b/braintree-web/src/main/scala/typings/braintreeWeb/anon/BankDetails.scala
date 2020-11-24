package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankDetails extends js.Object {
  
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
  implicit class BankDetailsOps[Self <: BankDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBankDetails(value: js.Any): Self = this.set("bankDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankLogin(value: js.Any): Self = this.set("bankLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandateText(value: String): Self = this.set("mandateText", value.asInstanceOf[js.Any])
  }
}
