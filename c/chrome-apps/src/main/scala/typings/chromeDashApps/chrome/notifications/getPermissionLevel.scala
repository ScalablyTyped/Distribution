package typings.chromeDashApps.chrome.notifications

import typings.chromeDashApps.Anon_DENIED
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.denied
import typings.chromeDashApps.chromeDashAppsStrings.granted
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
      /* level */ ToStringLiteral[Anon_DENIED, String, Exclude[String, granted | denied]], 
      Unit
    ]
  ): Unit = js.native
}

