package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.GetTokenOptions
import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "DeviceCodeCredential")
@js.native
/**
  * Creates an instance of DeviceCodeCredential with the details needed
  * to initiate the device code authorization flow with Azure Active Directory.
  *
  * A message will be logged, giving users a code that they can use to authenticate once they go to https://microsoft.com/devicelogin
  *
  * Developers can configure how this message is shown by passing a custom `userPromptCallback`:
  *
  * ```js
  * const credential = new DeviceCodeCredential({
  *   tenantId: env.AZURE_TENANT_ID,
  *   clientId: env.AZURE_CLIENT_ID,
  *   userPromptCallback: (info) => {
  *     console.log("CUSTOMIZED PROMPT CALLBACK", info.message);
  *   }
  * });
  * ```
  *
  * @param options - Options for configuring the client which makes the authentication requests.
  */
open class DeviceCodeCredential ()
  extends StObject
     with TokenCredential {
  def this(options: DeviceCodeCredentialOptions) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /**
    * Authenticates with Azure Active Directory and returns an access token if successful.
    * If authentication fails, a {@link CredentialUnavailableError} will be thrown with the details of the failure.
    *
    * If the token can't be retrieved silently, this method will require user interaction to retrieve the token.
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
