package typings.chromeApps.chrome.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.management.getPermissionWarningsByManifest")
@js.native
object getPermissionWarningsByManifest extends js.Object {
  /**
    * Returns a list of permission warnings for the given extension manifest string.
    * @param manifestStr Extension manifest JSON string. See example
    * @param [callback] Permissions warnings as string array
    * @example
    * chrome.management.getPermissionWarningsByManifest(JSON.stringify(chrome.runtime.getManifest()), (warnings) => { *Do something here* });
    */
  def apply(manifestStr: String): Unit = js.native
  def apply(manifestStr: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = js.native
}

