package typings.chromeApps.chrome.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.permissions.request")
@js.native
object request extends js.Object {
  /**
    * Requests access to the specified permissions.
    * These permissions must be defined in the optional_permissions field of the manifest.
    * If there are any problems requesting the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *granted*: True if the user granted the specified permissions.
    */
  def apply(permissions: Permissions): Unit = js.native
  def apply(permissions: Permissions, callback: js.Function1[/* granted */ Boolean, Unit]): Unit = js.native
}

