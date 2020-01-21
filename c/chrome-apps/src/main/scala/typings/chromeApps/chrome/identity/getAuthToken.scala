package typings.chromeApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity.getAuthToken")
@js.native
object getAuthToken extends js.Object {
  /**
    * Gets an OAuth2 access token using the client ID and
    * scopes specified in the oauth2 section of manifest.json.
    *
    * The Identity API caches access tokens in memory,
    * so it's ok to call getAuthToken non-interactively any time a token is required.
    * The token cache automatically handles expiration.
    *
    * For a good user experience it is important interactive token requests are initiated by
    * UI in your app explaining what the authorization is for. Failing to do this will cause
    * your users to get authorization requests, or Chrome sign in screens if they are not
    * signed in, with with no context. In particular, do not use getAuthToken interactively
    * when your app is first launched.
    *
    * @param details Token options.
    * @param [callback] Called with an OAuth2 access token as specified by the manifest,
    *                   or undefined if there was an error.
    */
  def apply(details: TokenDetails): Unit = js.native
  def apply(details: TokenDetails, callback: js.Function1[/* token */ String, Unit]): Unit = js.native
}

