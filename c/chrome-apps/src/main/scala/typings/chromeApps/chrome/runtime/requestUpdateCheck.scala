package typings.chromeApps.chrome.runtime

import typings.chromeApps.AnonNOUPDATE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.NO_UPDATE
import typings.chromeApps.chromeAppsStrings.THROTTLED
import typings.chromeApps.chromeAppsStrings.UPDATE_AVAILABLE
import typings.chromeApps.chromeAppsStrings.no_update_
import typings.chromeApps.chromeAppsStrings.throttled_
import typings.chromeApps.chromeAppsStrings.update_available_
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
      /* status */ ToStringLiteral[
        AnonNOUPDATE, 
        THROTTLED | NO_UPDATE | UPDATE_AVAILABLE, 
        Exclude[
          THROTTLED | NO_UPDATE | UPDATE_AVAILABLE, 
          throttled_ | no_update_ | update_available_
        ]
      ], 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
}

