package typings.braintreeWebDropIn.mod

import typings.googlepay.google.payments.api.ButtonOptions
import typings.googlepay.google.payments.api.TransactionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait googlePayCreateOptions extends js.Object {
  
  var button: js.UndefOr[ButtonOptions] = js.native
  
  var googlePayVersion: js.UndefOr[String] = js.native
  
  var merchantId: String = js.native
  
  var transactionInfo: TransactionInfo = js.native
}
object googlePayCreateOptions {
  
  @scala.inline
  def apply(merchantId: String, transactionInfo: TransactionInfo): googlePayCreateOptions = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any], transactionInfo = transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[googlePayCreateOptions]
  }
  
  @scala.inline
  implicit class googlePayCreateOptionsOps[Self <: googlePayCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionInfo(value: TransactionInfo): Self = this.set("transactionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: ButtonOptions): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setGooglePayVersion(value: String): Self = this.set("googlePayVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePayVersion: Self = this.set("googlePayVersion", js.undefined)
  }
}
