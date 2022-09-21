package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiTenantTokenCredentialOptions
  extends StObject
     with TokenCredentialOptions {
  
  /**
    * For multi-tenant applications, specifies additional tenants for which the credential may acquire tokens.
    * Add the wildcard value "*" to allow the credential to acquire tokens for any tenant the application is installed.
    */
  var additionallyAllowedTenants: js.UndefOr[js.Array[String]] = js.undefined
}
object MultiTenantTokenCredentialOptions {
  
  inline def apply(): MultiTenantTokenCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiTenantTokenCredentialOptions]
  }
  
  extension [Self <: MultiTenantTokenCredentialOptions](x: Self) {
    
    inline def setAdditionallyAllowedTenants(value: js.Array[String]): Self = StObject.set(x, "additionallyAllowedTenants", value.asInstanceOf[js.Any])
    
    inline def setAdditionallyAllowedTenantsUndefined: Self = StObject.set(x, "additionallyAllowedTenants", js.undefined)
    
    inline def setAdditionallyAllowedTenantsVarargs(value: String*): Self = StObject.set(x, "additionallyAllowedTenants", js.Array(value*))
  }
}
