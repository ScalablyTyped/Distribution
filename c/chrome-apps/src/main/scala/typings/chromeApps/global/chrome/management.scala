package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.management.ExtensionInfo
import typings.chromeApps.chrome.management.UninstallOptions
import typings.chromeApps.chromeAppsStrings.admin_
import typings.chromeApps.chromeAppsStrings.development_
import typings.chromeApps.chromeAppsStrings.extension
import typings.chromeApps.chromeAppsStrings.hosted_app
import typings.chromeApps.chromeAppsStrings.legacy_packaged_app
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.other_
import typings.chromeApps.chromeAppsStrings.packaged_app
import typings.chromeApps.chromeAppsStrings.permissions_increase_
import typings.chromeApps.chromeAppsStrings.sideload_
import typings.chromeApps.chromeAppsStrings.theme
import typings.chromeApps.chromeAppsStrings.unknown__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.management
////////////////
// Management //
////////////////
/**
  * The chrome.management API provides ways to
  * manage the list of apps
  * that are installed and running.
  */
@JSGlobal("chrome.management")
@js.native
object management extends js.Object {
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
  def uninstallSelf(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def uninstallSelf(options: UninstallOptions): Unit = js.native
  def uninstallSelf(options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
  @js.native
  object ExtensionDisabledReason extends js.Object {
    var PERMISSIONS_INCREASE: permissions_increase_ = js.native
    var UNKNOWN: unknown__ = js.native
  }
  
  @js.native
  object ExtensionInstallType extends js.Object {
    var ADMIN: admin_ = js.native
    var DEVELOPMENT: development_ = js.native
    var NORMAL: normal_ = js.native
    var OTHER: other_ = js.native
    var SIDELOAD: sideload_ = js.native
  }
  
  @js.native
  object ExtensionType extends js.Object {
    var EXTENSION: extension = js.native
    var HOSTED_APP: hosted_app = js.native
    var LEGACY_PACKAGED_APP: legacy_packaged_app = js.native
    var PACKAGED_APP: packaged_app = js.native
    var THEME: theme = js.native
  }
  
  @js.native
  object LaunchType extends js.Object {
    var OPEN_AS_PINNED_TAB: typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB = js.native
    var OPEN_AS_REGULAR_TAB: typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB = js.native
    var OPEN_AS_WINDOW: typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW = js.native
    var OPEN_FULL_SCREEN: typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN = js.native
  }
  
}

