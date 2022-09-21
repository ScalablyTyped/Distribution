package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzurePowerShellCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions {
  
  /**
    * Allows specifying a tenant ID
    */
  var tenantId: js.UndefOr[String] = js.undefined
}
object AzurePowerShellCredentialOptions {
  
  inline def apply(): AzurePowerShellCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzurePowerShellCredentialOptions]
  }
  
  extension [Self <: AzurePowerShellCredentialOptions](x: Self) {
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
