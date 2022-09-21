package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.GetTokenOptions
import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "InteractiveBrowserCredential")
@js.native
/**
  * Creates an instance of InteractiveBrowserCredential with the details needed.
  *
  * This credential uses the [Authorization Code Flow](https://docs.microsoft.com/azure/active-directory/develop/v2-oauth2-auth-code-flow).
  * On Node.js, it will open a browser window while it listens for a redirect response from the authentication service.
  * On browsers, it authenticates via popups. The `loginStyle` optional parameter can be set to `redirect` to authenticate by redirecting the user to an Azure secure login page, which then will redirect the user back to the web application where the authentication started.
  *
  * For Node.js, if a `clientId` is provided, the Azure Active Directory application will need to be configured to have a "Mobile and desktop applications" redirect endpoint.
  * Follow our guide on [setting up Redirect URIs for Desktop apps that calls to web APIs](https://docs.microsoft.com/azure/active-directory/develop/scenario-desktop-app-registration#redirect-uris).
  *
  * @param options - Options for configuring the client which makes the authentication requests.
  */
open class InteractiveBrowserCredential ()
  extends StObject
     with TokenCredential {
  def this(options: InteractiveBrowserCredentialInBrowserOptions) = this()
  def this(options: InteractiveBrowserCredentialNodeOptions) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /**
    * Authenticates with Azure Active Directory and returns an access token if successful.
    * If authentication fails, a {@link CredentialUnavailableError} will be thrown with the details of the failure.
    *
    * If the token can't be retrieved silently, this method will require user interaction to retrieve the token.
    *
    * On Node.js, this credential has [Proof Key for Code Exchange (PKCE)](https://datatracker.ietf.org/doc/html/rfc7636) enabled by default.
    * PKCE is a security feature that mitigates authentication code interception attacks.
    *
    * @param scopes - The list of scopes for which the token will have access.
    * @param options - The options used to configure any requests this
    *                  TokenCredential implementation might make.
    */
  def authenticate(scopes: String): js.Promise[js.UndefOr[AuthenticationRecord]] = js.native
  def authenticate(scopes: String, options: GetTokenOptions): js.Promise[js.UndefOr[AuthenticationRecord]] = js.native
  def authenticate(scopes: js.Array[String]): js.Promise[js.UndefOr[AuthenticationRecord]] = js.native
  def authenticate(scopes: js.Array[String], options: GetTokenOptions): js.Promise[js.UndefOr[AuthenticationRecord]] = js.native
  
  /* private */ var disableAutomaticAuthentication: Any = js.native
  
  /* private */ var msalFlow: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}
