package typings
package cordovaDashPluginDashMsDashAdalLib.MicrosoftNs.ADALNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ADAL.AuthenticationContext")
@js.native
class AuthenticationContext protected () extends js.Object {
  /**
    * Constructs context to use with known authority to get the token. It reuses existing context
    * for this authority URL in native proxy or creates a new one if it doesn't exists.
    * Corresponding native context will be created at first time when it will be needed.
    *
    * @param   {String}  authority         Authority url to send code and token requests
    * @param   {Boolean} validateAuthority Validate authority before sending token request
    *                                      When context is being created syncronously using this constructor
    *                                      validateAuthority in native context will be disabled to prevent
    *                                      context initialization failure
    *
    * @returns {Object}  Newly created authentication context.
    */
  def this(authority: java.lang.String) = this()
  def this(authority: java.lang.String, validateAuthority: scala.Boolean) = this()
  var authority: java.lang.String = js.native
  var tokenCache: TokenCache = js.native
  var validateAuthority: scala.Boolean = js.native
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
  def acquireTokenAsync(resourceUrl: java.lang.String, clientId: java.lang.String, redirectUrl: java.lang.String): PromiseAuthenticationResult = js.native
  def acquireTokenAsync(
    resourceUrl: java.lang.String,
    clientId: java.lang.String,
    redirectUrl: java.lang.String,
    userId: java.lang.String
  ): PromiseAuthenticationResult = js.native
  def acquireTokenAsync(
    resourceUrl: java.lang.String,
    clientId: java.lang.String,
    redirectUrl: java.lang.String,
    userId: java.lang.String,
    extraQueryParameters: java.lang.String
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
  def acquireTokenSilentAsync(resourceUrl: java.lang.String, clientId: java.lang.String, userId: java.lang.String): PromiseAuthenticationResult = js.native
}

/* static members */
@JSGlobal("Microsoft.ADAL.AuthenticationContext")
@js.native
object AuthenticationContext extends js.Object {
  /**
    * Constructs context asynchronously to use with known authority to get the token.
    * It reuses existing context for this authority URL in native proxy or creates a new one if it doesn't exists.
    *
    * @param   {String}   authority         Authority url to send code and token requests
    * @param   {Boolean}  validateAuthority Validate authority before sending token request. True by default
    *
    * @returns {Promise}  Promise either fulfilled with newly created authentication context or rejected with error
    */
  def createAsync(authority: java.lang.String): cordovaDashPluginDashMsDashAdalLib.MicrosoftNs.ADALNs.PromiseAuthenticationContext = js.native
  def createAsync(authority: java.lang.String, validateAuthority: scala.Boolean): cordovaDashPluginDashMsDashAdalLib.MicrosoftNs.ADALNs.PromiseAuthenticationContext = js.native
}

