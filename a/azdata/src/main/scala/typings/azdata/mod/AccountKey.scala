package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountKey extends StObject {
  
  /**
    * Identifier for the account, unique to the provider
    */
  var accountId: String
  
  /**
    * A version string for an account
    */
  var accountVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Any arguments that identify an instantiation of the provider
    */
  var providerArgs: js.UndefOr[Any] = js.undefined
  
  /**
    * Identifier of the provider
    */
  var providerId: String
}
object AccountKey {
  
  inline def apply(accountId: String, providerId: String): AccountKey = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountKey] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountVersion(value: String): Self = StObject.set(x, "accountVersion", value.asInstanceOf[js.Any])
    
    inline def setAccountVersionUndefined: Self = StObject.set(x, "accountVersion", js.undefined)
    
    inline def setProviderArgs(value: Any): Self = StObject.set(x, "providerArgs", value.asInstanceOf[js.Any])
    
    inline def setProviderArgsUndefined: Self = StObject.set(x, "providerArgs", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
