package typings.chromeApps.chrome.notifications

import typings.chromeApps.AnonDENIED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.DENIED
import typings.chromeApps.chromeAppsStrings.GRANTED
import typings.chromeApps.chromeAppsStrings.denied_
import typings.chromeApps.chromeAppsStrings.granted_
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
      /* level */ ToStringLiteral[AnonDENIED, GRANTED | DENIED, Exclude[GRANTED | DENIED, granted_ | denied_]], 
      Unit
    ]
  ): Unit = js.native
}

