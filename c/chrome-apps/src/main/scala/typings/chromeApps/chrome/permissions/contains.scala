package typings.chromeApps.chrome.permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.permissions.contains")
@js.native
object contains extends js.Object {
  /**
    * Checks if the app has the specified permissions.
    * @param callback Parameter *result*: True if the app has the specified permissions.
    */
  def apply(permissions: Permissions, callback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
}

