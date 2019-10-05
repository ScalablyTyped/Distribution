package typings.chromeDashApps.chrome.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.permissions.getAll")
@js.native
object getAll extends js.Object {
  /**
    * Gets the app's current set of permissions.
    * @param callback Parameter *permissions*: The app's active permissions.
    */
  def apply(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit = js.native
}

