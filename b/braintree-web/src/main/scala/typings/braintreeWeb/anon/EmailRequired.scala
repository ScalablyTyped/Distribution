package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailRequired extends StObject {
  
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
  implicit class EmailRequiredMutableBuilder[Self <: EmailRequired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailRequired(value: Boolean): Self = StObject.set(x, "emailRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRequiredUndefined: Self = StObject.set(x, "emailRequired", js.undefined)
    
    @scala.inline
    def setMerchantInfo(value: MerchantId): Self = StObject.set(x, "merchantInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantInfoUndefined: Self = StObject.set(x, "merchantInfo", js.undefined)
    
    @scala.inline
    def setTransactionInfo(value: CurrencyCode): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
  }
}
