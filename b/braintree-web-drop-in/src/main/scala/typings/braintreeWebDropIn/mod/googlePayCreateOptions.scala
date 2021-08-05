package typings.braintreeWebDropIn.mod

import typings.googlepay.google.payments.api.ButtonOptions
import typings.googlepay.google.payments.api.TransactionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait googlePayCreateOptions extends StObject {
  
  var button: js.UndefOr[ButtonOptions] = js.undefined
  
  var googlePayVersion: js.UndefOr[String] = js.undefined
  
  var merchantId: String
  
  var transactionInfo: TransactionInfo
}
object googlePayCreateOptions {
  
  inline def apply(merchantId: String, transactionInfo: TransactionInfo): googlePayCreateOptions = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any], transactionInfo = transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[googlePayCreateOptions]
  }
  
  extension [Self <: googlePayCreateOptions](x: Self) {
    
    inline def setButton(value: ButtonOptions): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setGooglePayVersion(value: String): Self = StObject.set(x, "googlePayVersion", value.asInstanceOf[js.Any])
    
    inline def setGooglePayVersionUndefined: Self = StObject.set(x, "googlePayVersion", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setTransactionInfo(value: TransactionInfo): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
  }
}
