package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountKey extends StObject {
  
  /**
    * Identifier for the account, unique to the provider
    */
  var accountId: String = js.native
  
  /**
    * Any arguments that identify an instantiation of the provider
    */
  var providerArgs: js.UndefOr[js.Any] = js.native
  
  /**
    * Identifier of the provider
    */
  var providerId: String = js.native
}
object AccountKey {
  
  @scala.inline
  def apply(accountId: String, providerId: String): AccountKey = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountKey]
  }
  
  @scala.inline
  implicit class AccountKeyMutableBuilder[Self <: AccountKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderArgs(value: js.Any): Self = StObject.set(x, "providerArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderArgsUndefined: Self = StObject.set(x, "providerArgs", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
