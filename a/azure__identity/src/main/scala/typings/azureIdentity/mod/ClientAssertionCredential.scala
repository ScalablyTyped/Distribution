package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "ClientAssertionCredential")
@js.native
open class ClientAssertionCredential protected ()
  extends StObject
     with TokenCredential {
  /**
    * Creates an instance of the ClientAssertionCredential with the details
    * needed to authenticate against Azure Active Directory with a client
    * assertion provided by the developer through the `getAssertion` function parameter.
    *
    * @param tenantId - The Azure Active Directory tenant (directory) ID.
    * @param clientId - The client (application) ID of an App Registration in the tenant.
    * @param getAssertion - A function that retrieves the assertion for the credential to use.
    * @param options - Options for configuring the client which makes the authentication request.
    */
  def this(tenantId: String, clientId: String, getAssertion: js.Function0[js.Promise[String]]) = this()
  def this(
    tenantId: String,
    clientId: String,
    getAssertion: js.Function0[js.Promise[String]],
    options: ClientAssertionCredentialOptions
  ) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var clientId: Any = js.native
  
  /* private */ var msalFlow: Any = js.native
  
  /* private */ var options: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}
