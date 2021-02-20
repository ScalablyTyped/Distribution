package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerchantAccountId extends StObject {
  
  var authorization: js.UndefOr[String] = js.native
  
  var client: js.UndefOr[typings.braintreeWeb.clientMod.Client] = js.native
  
  var merchantAccountId: js.UndefOr[String] = js.native
}
object MerchantAccountId {
  
  @scala.inline
  def apply(): MerchantAccountId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantAccountId]
  }
  
  @scala.inline
  implicit class MerchantAccountIdMutableBuilder[Self <: MerchantAccountId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
  }
}
