package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "EnvironmentCredential")
@js.native
/**
  * Creates an instance of the EnvironmentCredential class and decides what credential to use depending on the available environment variables.
  *
  * Required environment variables:
  * - `AZURE_TENANT_ID`: The Azure Active Directory tenant (directory) ID.
  * - `AZURE_CLIENT_ID`: The client (application) ID of an App Registration in the tenant.
  *
  * If setting the AZURE_TENANT_ID, then you can also set the additionally allowed tenants
  * - `AZURE_ADDITIONALLY_ALLOWED_TENANTS`: For multi-tenant applications, specifies additional tenants for which the credential may acquire tokens with a single semicolon delimited string. Use * to allow all tenants.
  *
  * Environment variables used for client credential authentication:
  * - `AZURE_CLIENT_SECRET`: A client secret that was generated for the App Registration.
  * - `AZURE_CLIENT_CERTIFICATE_PATH`: The path to a PEM certificate to use during the authentication, instead of the client secret.
  * - `AZURE_CLIENT_CERTIFICATE_PASSWORD`: (optional) password for the certificate file.
  *
  * Alternatively, users can provide environment variables for username and password authentication:
  * - `AZURE_USERNAME`: Username to authenticate with.
  * - `AZURE_PASSWORD`: Password to authenticate with.
  *
  * If the environment variables required to perform the authentication are missing, a {@link CredentialUnavailableError} will be thrown.
  * If the authentication fails, or if there's an unknown error, an {@link AuthenticationError} will be thrown.
  *
  * @param options - Options for configuring the client which makes the authentication request.
  */
open class EnvironmentCredential ()
  extends StObject
     with TokenCredential {
  def this(options: EnvironmentCredentialOptions) = this()
  
  /* private */ var _credential: Any = js.native
}
