package typings.chromeApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity.launchWebAuthFlow")
@js.native
object launchWebAuthFlow extends js.Object {
  /**
    * Starts an auth flow at the specified URL.
    * This method enables auth flows with non-Google identity providers by launching
    * a web view and navigating it to the first URL in the provider's auth flow.
    * When the provider redirects to a URL matching the pattern https://<app-id>.chromiumapp.org/ *,
    * the window will close, and the final redirect URL will be passed to the callback function.
    * For a good user experience it is important interactive auth flows are initiated by UI in
    * your app explaining what the authorization is for. Failing to do this will cause your
    * users to get authorization requests with no context.
    * In particular, do not launch an interactive auth flow when your app is first launched.
    * @param details WebAuth flow options.
    * @param callback Called with the URL redirected back to your application.
    * The callback parameter should be a function that looks like this:
    * function(string responseUrl) {...};
    */
  def apply(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = js.native
}

