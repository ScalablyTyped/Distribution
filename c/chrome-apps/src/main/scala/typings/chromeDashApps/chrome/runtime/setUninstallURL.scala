package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.setUninstallURL")
@js.native
object setUninstallURL extends js.Object {
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics, and implement surveys. Maximum 255 characters.
    * @since Chrome 41.
    * @param url Since Chrome 34.
    * URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme. Set an empty string to not open a new tab upon uninstallation.
    * @param callback Called when the uninstall URL is set. If the given URL is invalid, runtime.lastError will be set.
    */
  def apply(url: String): Unit = js.native
  def apply(url: String, callback: js.Function0[Unit]): Unit = js.native
}

