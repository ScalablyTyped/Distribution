package typings.cordovaPluginMsAdal.Microsoft.ADAL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationContext extends js.Object {
  
  /**
    * Acquires token using interactive flow if needed. It checks the cache to return existing result
    * if not expired. It tries to use refresh token if available. If it fails to get token with
    * refresh token, it will remove this refresh token from cache and start authentication.
    *
    * @param   {String}  resourceUrl Resource identifier
    * @param   {String}  clientId    Client (application) identifier
    * @param   {String}  redirectUrl Redirect url for this application
    * @param   {String}  userId      User identifier (optional)
    * @param   {String}  extraQueryParameters
    *                                Extra query parameters (optional)
    *                                Parameters should be escaped before passing to this method (e.g. using 'encodeURI()')
    *
    * @returns {Promise} Promise either fulfilled with AuthenticationResult object or rejected with error
    */
  def acquireTokenAsync(resourceUrl: String, clientId: String, redirectUrl: String): PromiseAuthenticationResult = js.native
  def acquireTokenAsync(
    resourceUrl: String,
    clientId: String,
    redirectUrl: String,
    userId: js.UndefOr[scala.Nothing],
    extraQueryParameters: String
  ): PromiseAuthenticationResult = js.native
  def acquireTokenAsync(resourceUrl: String, clientId: String, redirectUrl: String, userId: String): PromiseAuthenticationResult = js.native
  def acquireTokenAsync(
    resourceUrl: String,
    clientId: String,
    redirectUrl: String,
    userId: String,
    extraQueryParameters: String
  ): PromiseAuthenticationResult = js.native
  
  /**
    * Acquires token WITHOUT using interactive flow. It checks the cache to return existing result
    * if not expired. It tries to use refresh token if available. If it fails to get token without
    * displaying UI it will fail. This method guarantees that no UI will be shown to user.
    *
    * @param   {String}  resourceUrl Resource identifier
    * @param   {String}  clientId    Client (application) identifier
    * @param   {String}  userId      User identifier (optional)
    *
    * @returns {Promise} Promise either fulfilled with AuthenticationResult object or rejected with error
    */
  def acquireTokenSilentAsync(resourceUrl: String, clientId: String, userId: String): PromiseAuthenticationResult = js.native
  
  var authority: String = js.native
  
  var tokenCache: TokenCache = js.native
  
  var validateAuthority: Boolean = js.native
}
