package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuingBank extends js.Object {
  
  var CountryOfIssuance: String = js.native
  
  var IssuingBank: String = js.native
}
object IssuingBank {
  
  @scala.inline
  def apply(CountryOfIssuance: String, IssuingBank: String): IssuingBank = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuingBank]
  }
  
  @scala.inline
  implicit class IssuingBankOps[Self <: IssuingBank] (val x: Self) extends AnyVal {
    
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
    def setCountryOfIssuance(value: String): Self = this.set("CountryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = this.set("IssuingBank", value.asInstanceOf[js.Any])
  }
}
