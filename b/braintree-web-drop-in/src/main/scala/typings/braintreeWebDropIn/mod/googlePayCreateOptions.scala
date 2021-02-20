package typings.braintreeWebDropIn.mod

import typings.googlepay.google.payments.api.ButtonOptions
import typings.googlepay.google.payments.api.TransactionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait googlePayCreateOptions extends StObject {
  
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
  implicit class googlePayCreateOptionsMutableBuilder[Self <: googlePayCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: ButtonOptions): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setGooglePayVersion(value: String): Self = StObject.set(x, "googlePayVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePayVersionUndefined: Self = StObject.set(x, "googlePayVersion", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionInfo(value: TransactionInfo): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
  }
}
