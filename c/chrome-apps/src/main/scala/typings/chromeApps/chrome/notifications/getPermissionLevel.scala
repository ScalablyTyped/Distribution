package typings.chromeApps.chrome.notifications

import typings.chromeApps.AnonDENIED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.denied
import typings.chromeApps.chromeAppsStrings.granted
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.getPermissionLevel")
@js.native
object getPermissionLevel extends js.Object {
  /**
    * Retrieves whether the user has enabled notifications from this app .
    * @since Chrome 32.
    * @param callback Returns the current permission level.
    * @see enum PermissionLevel
    */
  def apply(
    callback: js.Function1[
      /* level */ ToStringLiteral[AnonDENIED, String, Exclude[String, granted | denied]], 
      Unit
    ]
  ): Unit = js.native
}

