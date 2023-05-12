package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadIdentityCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions
     with AuthorityValidationOptions {
  
  /**
    * The client ID of an Azure AD app registration.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the application's Azure Active Directory tenant. Also called its directory ID.
    */
  var tenantId: js.UndefOr[String] = js.undefined
  
  /**
    * The path to a file containing a Kubernetes service account token that authenticates the identity.
    */
  var tokenFilePath: js.UndefOr[String] = js.undefined
}
object WorkloadIdentityCredentialOptions {
  
  inline def apply(): WorkloadIdentityCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadIdentityCredentialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkloadIdentityCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setTokenFilePath(value: String): Self = StObject.set(x, "tokenFilePath", value.asInstanceOf[js.Any])
    
    inline def setTokenFilePathUndefined: Self = StObject.set(x, "tokenFilePath", js.undefined)
  }
}
