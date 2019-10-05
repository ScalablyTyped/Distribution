package typings.chromeDashApps.chrome.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.permissions.remove")
@js.native
object remove extends js.Object {
  /**
    * Removes access to the specified permissions. If there are any problems removing the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *removed*: True if the permissions were removed.
    */
  def apply(permissions: Permissions): Unit = js.native
  def apply(permissions: Permissions, callback: js.Function1[/* removed */ Boolean, Unit]): Unit = js.native
}

