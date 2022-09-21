package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "ClientSecretCredential")
@js.native
open class ClientSecretCredential protected ()
  extends StObject
     with TokenCredential {
  /**
    * Creates an instance of the ClientSecretCredential with the details
    * needed to authenticate against Azure Active Directory with a client
    * secret.
    *
    * @param tenantId - The Azure Active Directory tenant (directory) ID.
    * @param clientId - The client (application) ID of an App Registration in the tenant.
    * @param clientSecret - A client secret that was generated for the App Registration.
    * @param options - Options for configuring the client which makes the authentication request.
    */
  def this(tenantId: String, clientId: String, clientSecret: String) = this()
  def this(tenantId: String, clientId: String, clientSecret: String, options: ClientSecretCredentialOptions) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var msalFlow: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}
