package typings
package chromeDashAppsLib.chromeNs.identityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthFlowOptions extends js.Object {
  /**
    * Optional.
    * Whether to launch auth flow in interactive mode.
    * Since some auth flows may immediately redirect to a result URL, launchWebAuthFlow hides its web view until the first navigation either redirects to the final URL, or finishes loading a page meant to be displayed.
    * If the interactive flag is true, the window will be displayed when a page load completes. If the flag is false or omitted, launchWebAuthFlow will return with an error if the initial navigation does not complete the flow.
    */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The URL that initiates the auth flow.
    */
  var url: java.lang.String
}

object WebAuthFlowOptions {
  @scala.inline
  def apply(url: java.lang.String, interactive: js.UndefOr[scala.Boolean] = js.undefined): WebAuthFlowOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    __obj.asInstanceOf[WebAuthFlowOptions]
  }
}

