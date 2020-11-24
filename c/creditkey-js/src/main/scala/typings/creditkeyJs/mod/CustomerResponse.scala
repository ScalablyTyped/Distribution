package typings.creditkeyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerResponse extends js.Object {
  
  var amount: Double = js.native
  
  var amount_available: Double = js.native
  
  var status: Status = js.native
}
object CustomerResponse {
  
  @scala.inline
  def apply(amount: Double, amount_available: Double, status: Status): CustomerResponse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_available = amount_available.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerResponse]
  }
  
  @scala.inline
  implicit class CustomerResponseOps[Self <: CustomerResponse] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_available(value: Double): Self = this.set("amount_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
