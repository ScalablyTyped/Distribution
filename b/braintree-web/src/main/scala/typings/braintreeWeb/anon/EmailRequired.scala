package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailRequired extends StObject {
  
  var emailRequired: js.UndefOr[Boolean] = js.undefined
  
  var merchantInfo: js.UndefOr[MerchantId] = js.undefined
  
  var transactionInfo: CurrencyCode
}
object EmailRequired {
  
  inline def apply(transactionInfo: CurrencyCode): EmailRequired = {
    val __obj = js.Dynamic.literal(transactionInfo = transactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRequired]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailRequired] (val x: Self) extends AnyVal {
    
    inline def setEmailRequired(value: Boolean): Self = StObject.set(x, "emailRequired", value.asInstanceOf[js.Any])
    
    inline def setEmailRequiredUndefined: Self = StObject.set(x, "emailRequired", js.undefined)
    
    inline def setMerchantInfo(value: MerchantId): Self = StObject.set(x, "merchantInfo", value.asInstanceOf[js.Any])
    
    inline def setMerchantInfoUndefined: Self = StObject.set(x, "merchantInfo", js.undefined)
    
    inline def setTransactionInfo(value: CurrencyCode): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
  }
}
