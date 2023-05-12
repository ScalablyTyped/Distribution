package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureCliCredentialOptions
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
object AzureCliCredentialOptions {
  
  inline def apply(): AzureCliCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureCliCredentialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureCliCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setProcessTimeoutInMs(value: Double): Self = StObject.set(x, "processTimeoutInMs", value.asInstanceOf[js.Any])
    
    inline def setProcessTimeoutInMsUndefined: Self = StObject.set(x, "processTimeoutInMs", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
