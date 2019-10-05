package typings.chromeDashApps.chrome.notifications

import typings.chromeDashApps.chromeDashAppsStrings.denied
import typings.chromeDashApps.chromeDashAppsStrings.granted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * @property GRANTED - User has elected to show notifications from the app . This is the default at install time.
  * @property DENIED - User has elected not to show notifications from the app.
  */
@JSGlobal("chrome.notifications.PermissionLevel")
@js.native
object PermissionLevel extends js.Object {
  var DENIED: denied = js.native
  var GRANTED: granted = js.native
}

