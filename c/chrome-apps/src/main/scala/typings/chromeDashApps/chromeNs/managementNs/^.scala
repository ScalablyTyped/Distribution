package typings.chromeDashApps.chromeNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.management")
@js.native
object ^ extends js.Object {
  /**
    * Returns a list of permission warnings for the given extension manifest string.
    * @param manifestStr Extension manifest JSON string. See example
    * @param [callback] Permissions warnings as string array
    * @example
    * chrome.management.getPermissionWarningsByManifest(JSON.stringify(chrome.runtime.getManifest()), (warnings) => { *Do something here* });
    */
  def getPermissionWarningsByManifest(manifestStr: String): Unit = js.native
  def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = js.native
  /**
    * Returns information about the calling extension, app, or theme. Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 39.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * function( ExtensionInfo result) {...};
    */
  def getSelf(): Unit = js.native
  def getSelf(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  /**
    * Uninstalls the calling extension.
    * Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 26.
    * @param [options] Optional unstall options
    * @param [callback]
    */
  def uninstallSelf(): Unit = js.native
  def uninstallSelf(options: UninstallOptions): Unit = js.native
  def uninstallSelf(options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
}

