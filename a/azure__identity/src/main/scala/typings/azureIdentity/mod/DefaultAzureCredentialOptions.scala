package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAzureCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions {
  
  /**
    * Optionally pass in a Tenant ID to be used as part of the credential.
    * By default it may use a generic tenant ID depending on the underlying credential.
    */
  var tenantId: js.UndefOr[String] = js.undefined
}
object DefaultAzureCredentialOptions {
  
  inline def apply(): DefaultAzureCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultAzureCredentialOptions]
  }
  
  extension [Self <: DefaultAzureCredentialOptions](x: Self) {
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
