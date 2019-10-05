package typings.chromeDashApps.chrome.identity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.identity.getRedirectURL")
@js.native
object getRedirectURL extends js.Object {
  /**
    * Generates a redirect URL to be used in launchWebAuthFlow.
    * The generated URLs match the pattern https://<app-id>.chromiumapp.org/ *.
    * @since Chrome 33.
    * @param path The path appended to the end of the generated URL.
    */
  def apply(): String = js.native
  def apply(path: String): String = js.native
}

