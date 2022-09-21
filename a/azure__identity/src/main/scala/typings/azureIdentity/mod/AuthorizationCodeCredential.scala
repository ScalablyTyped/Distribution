package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import typings.azureIdentity.azureIdentityStrings.common
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "AuthorizationCodeCredential")
@js.native
open class AuthorizationCodeCredential protected ()
  extends StObject
     with TokenCredential {
  /**
    * Creates an instance of AuthorizationCodeCredential with the details needed
    * to request an access token using an authentication that was obtained
    * from Azure Active Directory.
    *
    * It is currently necessary for the user of this credential to initiate
    * the authorization code flow to obtain an authorization code to be used
    * with this credential.  A full example of this flow is provided here:
    *
    * https://github.com/Azure/azure-sdk-for-js/blob/main/sdk/identity/identity/samples/v2/manual/authorizationCodeSample.ts
    *
    * @param tenantId - The Azure Active Directory tenant (directory) ID or name.
    *                 'common' may be used when dealing with multi-tenant scenarios.
    * @param clientId - The client (application) ID of an App Registration in the tenant.
    * @param authorizationCode - An authorization code that was received from following the
    authorization code flow.  This authorization code must not
    have already been used to obtain an access token.
    * @param redirectUri - The redirect URI that was used to request the authorization code.
    Must be the same URI that is configured for the App Registration.
    * @param options - Options for configuring the client which makes the access token request.
    */
  def this(tenantId: String, clientId: String, authorizationCode: String, redirectUri: String) = this()
  def this(tenantId: common, clientId: String, authorizationCode: String, redirectUri: String) = this()
  def this(
    tenantId: String,
    clientId: String,
    authorizationCode: String,
    redirectUri: String,
    options: AuthorizationCodeCredentialOptions
  ) = this()
  /**
    * Creates an instance of AuthorizationCodeCredential with the details needed
    * to request an access token using an authentication that was obtained
    * from Azure Active Directory.
    *
    * It is currently necessary for the user of this credential to initiate
    * the authorization code flow to obtain an authorization code to be used
    * with this credential.  A full example of this flow is provided here:
    *
    * https://github.com/Azure/azure-sdk-for-js/blob/main/sdk/identity/identity/samples/v2/manual/authorizationCodeSample.ts
    *
    * @param tenantId - The Azure Active Directory tenant (directory) ID or name.
    *                 'common' may be used when dealing with multi-tenant scenarios.
    * @param clientId - The client (application) ID of an App Registration in the tenant.
    * @param clientSecret - A client secret that was generated for the App Registration
    * @param authorizationCode - An authorization code that was received from following the
    authorization code flow.  This authorization code must not
    have already been used to obtain an access token.
    * @param redirectUri - The redirect URI that was used to request the authorization code.
    Must be the same URI that is configured for the App Registration.
    * @param options - Options for configuring the client which makes the access token request.
    */
  def this(
    tenantId: String,
    clientId: String,
    clientSecret: String,
    authorizationCode: String,
    redirectUri: String
  ) = this()
  def this(
    tenantId: common,
    clientId: String,
    authorizationCode: String,
    redirectUri: String,
    options: AuthorizationCodeCredentialOptions
  ) = this()
  def this(
    tenantId: common,
    clientId: String,
    clientSecret: String,
    authorizationCode: String,
    redirectUri: String
  ) = this()
  def this(
    tenantId: String,
    clientId: String,
    clientSecret: String,
    authorizationCode: String,
    redirectUri: String,
    options: AuthorizationCodeCredentialOptions
  ) = this()
  def this(
    tenantId: common,
    clientId: String,
    clientSecret: String,
    authorizationCode: String,
    redirectUri: String,
    options: AuthorizationCodeCredentialOptions
  ) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var authorizationCode: Any = js.native
  
  /* private */ var disableAutomaticAuthentication: Any = js.native
  
  /* private */ var msalFlow: Any = js.native
  
  /* private */ var redirectUri: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}
