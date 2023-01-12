package typings.braintree.mod

import typings.braintree.anon.FailOnDuplicatePaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientTokenRequest extends StObject {
  
  var customerId: js.UndefOr[String] = js.undefined
  
  var merchantAccountId: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[FailOnDuplicatePaymentMethod] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object ClientTokenRequest {
  
  inline def apply(): ClientTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    inline def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
    
    inline def setOptions(value: FailOnDuplicatePaymentMethod): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
