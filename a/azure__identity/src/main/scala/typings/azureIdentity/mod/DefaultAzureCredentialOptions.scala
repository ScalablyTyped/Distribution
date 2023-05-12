package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAzureCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions
     with AuthorityValidationOptions {
  
  /**
    * Timeout configurable for making token requests for developer credentials, namely, {@link AzurePowershellCredential},
    * {@link AzureDeveloperCliCredential} and {@link AzureCliCredential}.
    * Process timeout for credentials should be provided in milliseconds.
    */
  var processTimeoutInMs: js.UndefOr[Double] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultAzureCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setProcessTimeoutInMs(value: Double): Self = StObject.set(x, "processTimeoutInMs", value.asInstanceOf[js.Any])
    
    inline def setProcessTimeoutInMsUndefined: Self = StObject.set(x, "processTimeoutInMs", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
