package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.management.ExtensionInfo
import typings.chromeApps.chrome.management.UninstallOptions
import typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
import typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object management {
  
  object ExtensionDisabledReason {
    
    @JSGlobal("chrome.management.ExtensionDisabledReason")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.management.ExtensionDisabledReason.PERMISSIONS_INCREASE")
    @js.native
    def PERMISSIONS_INCREASE: permissions_increase_ = js.native
    @scala.inline
    def PERMISSIONS_INCREASE_=(x: permissions_increase_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERMISSIONS_INCREASE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionDisabledReason.UNKNOWN")
    @js.native
    def UNKNOWN: unknown__ = js.native
    @scala.inline
    def UNKNOWN_=(x: unknown__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
  }
  
  object ExtensionInstallType {
    
    @JSGlobal("chrome.management.ExtensionInstallType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.management.ExtensionInstallType.ADMIN")
    @js.native
    def ADMIN: admin_ = js.native
    @scala.inline
    def ADMIN_=(x: admin_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADMIN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionInstallType.DEVELOPMENT")
    @js.native
    def DEVELOPMENT: development_ = js.native
    @scala.inline
    def DEVELOPMENT_=(x: development_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVELOPMENT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionInstallType.NORMAL")
    @js.native
    def NORMAL: normal_ = js.native
    @scala.inline
    def NORMAL_=(x: normal_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionInstallType.OTHER")
    @js.native
    def OTHER: other_ = js.native
    @scala.inline
    def OTHER_=(x: other_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTHER")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionInstallType.SIDELOAD")
    @js.native
    def SIDELOAD: sideload_ = js.native
    @scala.inline
    def SIDELOAD_=(x: sideload_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDELOAD")(x.asInstanceOf[js.Any])
  }
  
  object ExtensionType {
    
    @JSGlobal("chrome.management.ExtensionType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.management.ExtensionType.EXTENSION")
    @js.native
    def EXTENSION: extension = js.native
    @scala.inline
    def EXTENSION_=(x: extension): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionType.HOSTED_APP")
    @js.native
    def HOSTED_APP: hosted_app = js.native
    @scala.inline
    def HOSTED_APP_=(x: hosted_app): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOSTED_APP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionType.LEGACY_PACKAGED_APP")
    @js.native
    def LEGACY_PACKAGED_APP: legacy_packaged_app = js.native
    @scala.inline
    def LEGACY_PACKAGED_APP_=(x: legacy_packaged_app): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGACY_PACKAGED_APP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionType.PACKAGED_APP")
    @js.native
    def PACKAGED_APP: packaged_app = js.native
    @scala.inline
    def PACKAGED_APP_=(x: packaged_app): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PACKAGED_APP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionType.THEME")
    @js.native
    def THEME: theme = js.native
    @scala.inline
    def THEME_=(x: theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THEME")(x.asInstanceOf[js.Any])
  }
  
  object LaunchType {
    
    @JSGlobal("chrome.management.LaunchType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.management.LaunchType.OPEN_AS_PINNED_TAB")
    @js.native
    def OPEN_AS_PINNED_TAB: typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB = js.native
    @scala.inline
    def OPEN_AS_PINNED_TAB_=(x: OPEN_AS_PINNED_TAB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_PINNED_TAB")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.LaunchType.OPEN_AS_REGULAR_TAB")
    @js.native
    def OPEN_AS_REGULAR_TAB: typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB = js.native
    @scala.inline
    def OPEN_AS_REGULAR_TAB_=(x: OPEN_AS_REGULAR_TAB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_REGULAR_TAB")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.LaunchType.OPEN_AS_WINDOW")
    @js.native
    def OPEN_AS_WINDOW: typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW = js.native
    @scala.inline
    def OPEN_AS_WINDOW_=(x: OPEN_AS_WINDOW): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_WINDOW")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.LaunchType.OPEN_FULL_SCREEN")
    @js.native
    def OPEN_FULL_SCREEN: typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN = js.native
    @scala.inline
    def OPEN_FULL_SCREEN_=(x: OPEN_FULL_SCREEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_FULL_SCREEN")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Returns a list of permission warnings for the given extension manifest string.
    * @param manifestStr Extension manifest JSON string. See example
    * @param [callback] Permissions warnings as string array
    * @example
    * chrome.management.getPermissionWarningsByManifest(JSON.stringify(chrome.runtime.getManifest()), (warnings) => { *Do something here* });
    */
  @JSGlobal("chrome.management.getPermissionWarningsByManifest")
  @js.native
  def getPermissionWarningsByManifest(manifestStr: String): Unit = js.native
  @JSGlobal("chrome.management.getPermissionWarningsByManifest")
  @js.native
  def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = js.native
  
  /**
    * Returns information about the calling extension, app, or theme. Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 39.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * function( ExtensionInfo result) {...};
    */
  @JSGlobal("chrome.management.getSelf")
  @js.native
  def getSelf(): Unit = js.native
  @JSGlobal("chrome.management.getSelf")
  @js.native
  def getSelf(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  /**
    * Uninstalls the calling extension.
    * Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 26.
    * @param [options] Optional unstall options
    * @param [callback]
    */
  @JSGlobal("chrome.management.uninstallSelf")
  @js.native
  def uninstallSelf(): Unit = js.native
  @JSGlobal("chrome.management.uninstallSelf")
  @js.native
  def uninstallSelf(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.management.uninstallSelf")
  @js.native
  def uninstallSelf(options: UninstallOptions): Unit = js.native
  @JSGlobal("chrome.management.uninstallSelf")
  @js.native
  def uninstallSelf(options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
}
