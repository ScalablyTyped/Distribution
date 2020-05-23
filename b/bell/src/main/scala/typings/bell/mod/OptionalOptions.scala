package typings.bell.mod

import typings.bell.anon.ExtendedProfile
import typings.bell.anon.Uri
import typings.hapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalOptions extends js.Object {
  /**
    * allows passing query parameters from a bell protected endpoint to the auth request.
    * It will merge the query params you pass along with the providerParams and any other predefined ones.
    * Be aware that this will override predefined query parameters!
    * Default to false.
    */
  var allowRuntimeProviderParams: js.UndefOr[StringLikeMap | Boolean] = js.undefined
  /**
    * a configuration object used to customize the provider settings.
    * The built-in 'twitter' provider accepts the `extendedProfile` & `getMethod` options.
    * option which allows disabling the extra profile request when the provider
    * returns the user information in the callback (defaults to true).
    * The built-in 'github' and 'phabricator' providers accept the uri
    * option which allows pointing to a private enterprise installation (e.g. 'https://vpn.example.com').
    * See Providers documentation for more information.
    */
  var config: js.UndefOr[ExtendedProfile | Uri] = js.undefined
  /**
    * the name of the cookie used to manage the temporary state.
    * Defaults to 'bell-provider' where 'provider' is the provider name (or 'custom' for custom providers).
    * For example, the Twitter cookie name defaults to 'bell-twitter'.
    */
  var cookie: js.UndefOr[String] = js.undefined
  /**
    * the domain scope.
    * Defaults to null (no domain).
    */
  var domain: js.UndefOr[String] = js.undefined
  // THESE ARE IN THE *REQUIRED* section but are actually not...
  /**
    * A boolean indicating whether or not you want the redirect_uri to be forced to https.
    * Useful if your hapi application runs as http, but is accessed through https.
    */
  var forceHttps: js.UndefOr[Boolean] = js.undefined
  /**
    * sets the cookie HTTP only flag.
    * Defaults to true.
    */
  var isHttpOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * sets the cookie secure flag.
    * Defaults to true.
    */
  var isSecure: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the base redirect_uri manually if it cannot be inferred properly from server settings.
    * Useful to override port, protocol, and host if proxied or forwarded.
    */
  var location: js.UndefOr[String | (js.Function1[/* req */ Request, String])] = js.undefined
  /**
    * an object of key-value pairs that specify additional
    * URL query parameters to send with the profile request to the provider.
    * The built-in facebook provider,
    * for example, could have fields specified to determine the fields returned from the user's graph,
    * which would then be available to you in the auth.credentials.profile.raw object.
    */
  var profileParams: js.UndefOr[StringLikeMap] = js.undefined
  /**
    * provider-specific query parameters for the authentication endpoint.
    * It may be passed either as an object to merge into the query string,
    * or a function which takes the client's request and returns an object.
    * Each provider supports its own set of parameters which customize the user's login experience.
    * For example:
    * * Facebook supports `display` ('page', 'popup', or 'touch'), `auth_type`, `auth_nonce`.
    * * Google supports `access_type`, `approval_prompt`, `prompt`, `login_hint`, `user_id`, `hd`.
    * * Twitter supports `force_login`, `screen_name`.
    * * Linkedin supports `fields`.
    */
  var providerParams: js.UndefOr[StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap])] = js.undefined
  /**
    * allows passing additional OAuth state from initial request.
    * This must be a function returning a string,
    * which will be appended to the bell internal state parameter for OAuth code flow.
    */
  var runtimeStateCallback: js.UndefOr[js.Function1[/* req */ Request, String]] = js.undefined
  /**
    * Each built-in vendor comes with the required scope for basic profile information.
    * Use scope to specify a different scope as required by your application.
    * It may be passed either as an object to merge into the query string,
    * or a function which takes the client's request and returns an object.
    * Consult the provider for their specific supported scopes.
    */
  var scope: js.UndefOr[js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]])] = js.undefined
  /**
    * skips obtaining a user profile from the provider.
    * Useful if you need specific scopes,
    * but not the user profile.
    * Defaults to false.
    */
  var skipProfile: js.UndefOr[Boolean] = js.undefined
  /**
    * cookie time-to-live in milliseconds.
    * Defaults to null (session time-life - cookies are deleted when the browser is closed).
    */
  var ttl: js.UndefOr[Double] = js.undefined
}

object OptionalOptions {
  @scala.inline
  def apply(
    allowRuntimeProviderParams: StringLikeMap | Boolean = null,
    config: ExtendedProfile | Uri = null,
    cookie: String = null,
    domain: String = null,
    forceHttps: js.UndefOr[Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[Boolean] = js.undefined,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    location: String | (js.Function1[/* req */ Request, String]) = null,
    profileParams: StringLikeMap = null,
    providerParams: StringLikeMap | (js.Function1[/* request */ Request, StringLikeMap]) = null,
    runtimeStateCallback: /* req */ Request => String = null,
    scope: js.Array[String] | (js.Function1[/* request */ Request, js.Array[String]]) = null,
    skipProfile: js.UndefOr[Boolean] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined
  ): OptionalOptions = {
    val __obj = js.Dynamic.literal()
    if (allowRuntimeProviderParams != null) __obj.updateDynamic("allowRuntimeProviderParams")(allowRuntimeProviderParams.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (profileParams != null) __obj.updateDynamic("profileParams")(profileParams.asInstanceOf[js.Any])
    if (providerParams != null) __obj.updateDynamic("providerParams")(providerParams.asInstanceOf[js.Any])
    if (runtimeStateCallback != null) __obj.updateDynamic("runtimeStateCallback")(js.Any.fromFunction1(runtimeStateCallback))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(skipProfile)) __obj.updateDynamic("skipProfile")(skipProfile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalOptions]
  }
}

