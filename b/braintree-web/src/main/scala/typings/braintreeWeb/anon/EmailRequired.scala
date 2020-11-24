package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailRequired extends js.Object {
  
  var emailRequired: js.UndefOr[Boolean] = js.native
  
  var merchantInfo: js.UndefOr[MerchantId] = js.native
  
  var transactionInfo: CurrencyCode = js.native
}
object EmailRequired {
  
  @scala.inline
  def apply(transactionInfo: CurrencyCode): EmailRequired = {
    val __obj = js.Dynamic.literal(transactionInfo = transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRequired]
  }
  
  @scala.inline
  implicit class EmailRequiredOps[Self <: EmailRequired] (val x: Self) extends AnyVal {
    
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
    def setTransactionInfo(value: CurrencyCode): Self = this.set("transactionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRequired(value: Boolean): Self = this.set("emailRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailRequired: Self = this.set("emailRequired", js.undefined)
    
    @scala.inline
    def setMerchantInfo(value: MerchantId): Self = this.set("merchantInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantInfo: Self = this.set("merchantInfo", js.undefined)
  }
}
