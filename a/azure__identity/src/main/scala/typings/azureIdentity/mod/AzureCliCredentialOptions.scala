package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureCliCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions {
  
  /**
    * Allows specifying a tenant ID
    */
  var tenantId: js.UndefOr[String] = js.undefined
}
object AzureCliCredentialOptions {
  
  inline def apply(): AzureCliCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureCliCredentialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureCliCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
