package typings.chrome.anon

import typings.chrome.chrome.management.ExtensionInfo
import typings.chrome.chrome.management.ManagementDisabledEvent
import typings.chrome.chrome.management.ManagementEnabledEvent
import typings.chrome.chrome.management.ManagementInstalledEvent
import typings.chrome.chrome.management.ManagementUninstalledEvent
import typings.chrome.chrome.management.UninstallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmanagement extends StObject {
  
  def createAppShortcut(id: String): js.Promise[Unit] = js.native
  def createAppShortcut(id: String, callback: js.Function0[Unit]): Unit = js.native
  
  def generateAppForLink(url: String, title: String): js.Promise[ExtensionInfo] = js.native
  def generateAppForLink(url: String, title: String, callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  def get(id: String): js.Promise[ExtensionInfo] = js.native
  def get(id: String, callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  def getAll(): js.Promise[js.Array[ExtensionInfo]] = js.native
  def getAll(callback: js.Function1[/* result */ js.Array[ExtensionInfo], Unit]): Unit = js.native
  
  def getPermissionWarningsById(id: String): js.Promise[js.Array[String]] = js.native
  def getPermissionWarningsById(id: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = js.native
  
  def getPermissionWarningsByManifest(manifestStr: String): js.Promise[js.Array[String]] = js.native
  def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionwarnings */ js.Array[String], Unit]): Unit = js.native
  
  def getSelf(): js.Promise[ExtensionInfo] = js.native
  def getSelf(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = js.native
  
  def launchApp(id: String): js.Promise[Unit] = js.native
  def launchApp(id: String, callback: js.Function0[Unit]): Unit = js.native
  
  var onDisabled: ManagementDisabledEvent = js.native
  
  var onEnabled: ManagementEnabledEvent = js.native
  
  var onInstalled: ManagementInstalledEvent = js.native
  
  var onUninstalled: ManagementUninstalledEvent = js.native
  
  def setEnabled(id: String, enabled: Boolean): js.Promise[Unit] = js.native
  def setEnabled(id: String, enabled: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  def setLaunchType(id: String, launchType: String): js.Promise[Unit] = js.native
  def setLaunchType(id: String, launchType: String, callback: js.Function0[Unit]): Unit = js.native
  
  def uninstall(id: String): js.Promise[Unit] = js.native
  def uninstall(id: String, callback: js.Function0[Unit]): Unit = js.native
  def uninstall(id: String, options: UninstallOptions): js.Promise[Unit] = js.native
  def uninstall(id: String, options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def uninstallSelf(): js.Promise[Unit] = js.native
  def uninstallSelf(callback: js.Function0[Unit]): Unit = js.native
  def uninstallSelf(options: UninstallOptions): js.Promise[Unit] = js.native
  def uninstallSelf(options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
}
