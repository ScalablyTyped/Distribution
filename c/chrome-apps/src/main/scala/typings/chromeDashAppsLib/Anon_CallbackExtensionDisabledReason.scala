package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackExtensionDisabledReason extends js.Object {
  val ExtensionDisabledReason: Anon_PERMISSIONSINCREASE = js.native
  val ExtensionInstallType: Anon_ADMIN = js.native
  val ExtensionType: Anon_EXTENSION = js.native
  val LaunchType: Anon_OPENASPINNEDTAB = js.native
  /**
    * Returns a list of permission warnings for the given extension manifest string.
    * @param manifestStr Extension manifest JSON string. See example
    * @param [callback] Permissions warnings as string array
    * @example
    * chrome.management.getPermissionWarningsByManifest(JSON.stringify(chrome.runtime.getManifest()), (warnings) => { *Do something here* });
    */
  def getPermissionWarningsByManifest(manifestStr: java.lang.String): scala.Unit = js.native
  def getPermissionWarningsByManifest(
    manifestStr: java.lang.String,
    callback: js.Function1[/* permissionWarnings */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns information about the calling extension, app, or theme. Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 39.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * function( ExtensionInfo result) {...};
    */
  def getSelf(): scala.Unit = js.native
  def getSelf(
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.managementNs.ExtensionInfo, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Uninstalls the calling extension.
    * Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 26.
    * @param [options] Optional unstall options
    * @param [callback]
    */
  def uninstallSelf(): scala.Unit = js.native
  def uninstallSelf(options: chromeDashAppsLib.chromeNs.managementNs.UninstallOptions): scala.Unit = js.native
  def uninstallSelf(
    options: chromeDashAppsLib.chromeNs.managementNs.UninstallOptions,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

