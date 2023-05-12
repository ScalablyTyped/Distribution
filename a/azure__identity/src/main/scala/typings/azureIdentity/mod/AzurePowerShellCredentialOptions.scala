package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzurePowerShellCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions {
  
  /**
    * Process timeout configurable for making token requests, provided in milliseconds
    */
  var processTimeoutInMs: js.UndefOr[Double] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzurePowerShellCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setProcessTimeoutInMs(value: Double): Self = StObject.set(x, "processTimeoutInMs", value.asInstanceOf[js.Any])
    
    inline def setProcessTimeoutInMsUndefined: Self = StObject.set(x, "processTimeoutInMs", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
