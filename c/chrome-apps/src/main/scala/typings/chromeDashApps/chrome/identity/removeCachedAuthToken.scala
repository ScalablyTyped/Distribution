package typings.chromeDashApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity.removeCachedAuthToken")
@js.native
object removeCachedAuthToken extends js.Object {
  /**
    * Removes an OAuth2 access token from the Identity API's token cache.
    * If an access token is discovered to be invalid,
    * it should be passed to removeCachedAuthToken to remove it from the cache.
    * The app may then retrieve a fresh token with getAuthToken.
    * @param details Token information.
    * @param callback Called when the token has been removed from the cache.
    */
  def apply(details: TokenInformation): Unit = js.native
  def apply(details: TokenInformation, callback: js.Function0[Unit]): Unit = js.native
}

