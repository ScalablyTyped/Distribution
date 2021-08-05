package typings.chrome.global.chrome

import typings.chrome.chrome.management.ExtensionInfo
import typings.chrome.chrome.management.ManagementDisabledEvent
import typings.chrome.chrome.management.ManagementEnabledEvent
import typings.chrome.chrome.management.ManagementInstalledEvent
import typings.chrome.chrome.management.ManagementUninstalledEvent
import typings.chrome.chrome.management.UninstallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Management
////////////////////
/**
  * The chrome.management API provides ways to manage the list of extensions/apps that are installed and running. It is particularly useful for extensions that override the built-in New Tab page.
  * Permissions:  "management"
  * @since Chrome 8.
  */
object management {
  
  @JSGlobal("chrome.management")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAppShortcut(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppShortcut")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createAppShortcut(id: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAppShortcut")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generateAppForLink(url: String, title: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAppForLink")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generateAppForLink(url: String, title: String, callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAppForLink")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def get(id: String, callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[Unit]
  inline def getAll(callback: js.Function1[/* result */ js.Array[ExtensionInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getPermissionWarningsById(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionWarningsById")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getPermissionWarningsById(id: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionWarningsById")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getPermissionWarningsByManifest(manifestStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionWarningsByManifest")(manifestStr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionwarnings */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionWarningsByManifest")(manifestStr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSelf(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelf")().asInstanceOf[Unit]
  inline def getSelf(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelf")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def launchApp(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("launchApp")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def launchApp(id: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("launchApp")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.management.onDisabled")
  @js.native
  def onDisabled: ManagementDisabledEvent = js.native
  inline def onDisabled_=(x: ManagementDisabledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.management.onEnabled")
  @js.native
  def onEnabled: ManagementEnabledEvent = js.native
  inline def onEnabled_=(x: ManagementEnabledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.management.onInstalled")
  @js.native
  def onInstalled: ManagementInstalledEvent = js.native
  inline def onInstalled_=(x: ManagementInstalledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInstalled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.management.onUninstalled")
  @js.native
  def onUninstalled: ManagementUninstalledEvent = js.native
  inline def onUninstalled_=(x: ManagementUninstalledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUninstalled")(x.asInstanceOf[js.Any])
  
  inline def setEnabled(id: String, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(id.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setEnabled(id: String, enabled: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(id.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setLaunchType(id: String, launchType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLaunchType")(id.asInstanceOf[js.Any], launchType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setLaunchType(id: String, launchType: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLaunchType")(id.asInstanceOf[js.Any], launchType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def uninstall(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def uninstall(id: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def uninstall(id: String, options: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def uninstall(id: String, options: UninstallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def uninstall(id: String, options: UninstallOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def uninstallSelf(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")().asInstanceOf[Unit]
  inline def uninstallSelf(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def uninstallSelf(options: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def uninstallSelf(options: UninstallOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def uninstallSelf(options: UninstallOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
