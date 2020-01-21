package typings.chromeApps.chrome.runtime

import typings.chromeApps.AnonNOUPDATE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.no_update
import typings.chromeApps.chromeAppsStrings.throttled
import typings.chromeApps.chromeAppsStrings.update_available
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.requestUpdateCheck")
@js.native
object requestUpdateCheck extends js.Object {
  /**
    * Requests an update check for this app.
    * @since Chrome 25.
    * @param callback
    * Parameter status: Result of the update check. See enum RequestUpdateCheckStatus.
    * Optional parameter details: If an update is available, this contains more information about the available update.
    */
  def apply(
    callback: js.Function2[
      /* status */ ToStringLiteral[AnonNOUPDATE, String, Exclude[String, throttled | no_update | update_available]], 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
}

