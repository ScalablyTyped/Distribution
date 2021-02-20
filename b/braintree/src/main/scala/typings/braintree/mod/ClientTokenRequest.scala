package typings.braintree.mod

import typings.braintree.anon.FailOnDuplicatePaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientTokenRequest extends StObject {
  
  var customerId: js.UndefOr[String] = js.native
  
  var merchantAccountId: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[FailOnDuplicatePaymentMethod] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object ClientTokenRequest {
  
  @scala.inline
  def apply(): ClientTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientTokenRequest]
  }
  
  @scala.inline
  implicit class ClientTokenRequestMutableBuilder[Self <: ClientTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
    
    @scala.inline
    def setOptions(value: FailOnDuplicatePaymentMethod): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
