package typings.chrome.global.chrome

import typings.chrome.chrome.management.ExtensionInfo
import typings.chrome.chrome.management.ManagementDisabledEvent
import typings.chrome.chrome.management.ManagementEnabledEvent
import typings.chrome.chrome.management.ManagementInstalledEvent
import typings.chrome.chrome.management.ManagementUninstalledEvent
import typings.chrome.chrome.management.UninstallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.management.createAppShortcut")
  @js.native
  def createAppShortcut(id: String): Unit = js.native
  @JSGlobal("chrome.management.createAppShortcut")
  @js.native
  def createAppShortcut(id: String, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.generateAppForLink")
  @js.native
  def generateAppForLink(url: String, title: String): Unit = js.native
  @JSGlobal("chrome.management.generateAppForLink")
  @js.native
  def generateAppForLink(url: String, title: String, callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.get")
  @js.native
  def get(id: String): Unit = js.native
  @JSGlobal("chrome.management.get")
  @js.native
  def get(id: String, callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.getAll")
  @js.native
  def getAll(): Unit = js.native
  @JSGlobal("chrome.management.getAll")
  @js.native
  def getAll(callback: js.Function1[/* result */ js.Array[ExtensionInfo], Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.getPermissionWarningsById")
  @js.native
  def getPermissionWarningsById(id: String): Unit = js.native
  @JSGlobal("chrome.management.getPermissionWarningsById")
  @js.native
  def getPermissionWarningsById(id: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.getPermissionWarningsByManifest")
  @js.native
  def getPermissionWarningsByManifest(manifestStr: String): Unit = js.native
  @JSGlobal("chrome.management.getPermissionWarningsByManifest")
  @js.native
  def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionwarnings */ js.Array[String], Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.getSelf")
  @js.native
  def getSelf(): Unit = js.native
  @JSGlobal("chrome.management.getSelf")
  @js.native
  def getSelf(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.launchApp")
  @js.native
  def launchApp(id: String): Unit = js.native
  @JSGlobal("chrome.management.launchApp")
  @js.native
  def launchApp(id: String, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.onDisabled")
  @js.native
  def onDisabled: ManagementDisabledEvent = js.native
  @scala.inline
  def onDisabled_=(x: ManagementDisabledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.management.onEnabled")
  @js.native
  def onEnabled: ManagementEnabledEvent = js.native
  @scala.inline
  def onEnabled_=(x: ManagementEnabledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.management.onInstalled")
  @js.native
  def onInstalled: ManagementInstalledEvent = js.native
  @scala.inline
  def onInstalled_=(x: ManagementInstalledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInstalled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.management.onUninstalled")
  @js.native
  def onUninstalled: ManagementUninstalledEvent = js.native
  @scala.inline
  def onUninstalled_=(x: ManagementUninstalledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUninstalled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.management.setEnabled")
  @js.native
  def setEnabled(id: String, enabled: Boolean): Unit = js.native
  @JSGlobal("chrome.management.setEnabled")
  @js.native
  def setEnabled(id: String, enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.setLaunchType")
  @js.native
  def setLaunchType(id: String, launchType: String): Unit = js.native
  @JSGlobal("chrome.management.setLaunchType")
  @js.native
  def setLaunchType(id: String, launchType: String, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.uninstall")
  @js.native
  def uninstall(id: String): Unit = js.native
  @JSGlobal("chrome.management.uninstall")
  @js.native
  def uninstall(id: String, callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.management.uninstall")
  @js.native
  def uninstall(id: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.management.uninstall")
  @js.native
  def uninstall(id: String, options: UninstallOptions): Unit = js.native
  @JSGlobal("chrome.management.uninstall")
  @js.native
  def uninstall(id: String, options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.management.uninstallSelf")
  @js.native
  def uninstallSelf(): Unit = js.native
  @JSGlobal("chrome.management.uninstallSelf")
  @js.native
  def uninstallSelf(callback: js.Function0[Unit]): Unit = js.native
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
