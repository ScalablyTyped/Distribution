package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "UsernamePasswordCredential")
@js.native
open class UsernamePasswordCredential protected ()
  extends StObject
     with TokenCredential {
  /**
    * Creates an instance of the UsernamePasswordCredential with the details
    * needed to authenticate against Azure Active Directory with a username
    * and password.
    *
    * @param tenantId - The Azure Active Directory tenant (directory).
    * @param clientId - The client (application) ID of an App Registration in the tenant.
    * @param username - The user account's e-mail address (user name).
    * @param password - The user account's account password
    * @param options - Options for configuring the client which makes the authentication request.
    */
  def this(tenantId: String, clientId: String, username: String, password: String) = this()
  def this(
    tenantId: String,
    clientId: String,
    username: String,
    password: String,
    options: UsernamePasswordCredentialOptions
  ) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var msalFlow: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}
