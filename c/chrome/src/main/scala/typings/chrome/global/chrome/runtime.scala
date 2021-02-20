package typings.chrome.global.chrome

import typings.chrome.Window
import typings.chrome.chrome.runtime.ConnectInfo
import typings.chrome.chrome.runtime.ExtensionConnectEvent
import typings.chrome.chrome.runtime.ExtensionMessageEvent
import typings.chrome.chrome.runtime.LastError
import typings.chrome.chrome.runtime.Manifest
import typings.chrome.chrome.runtime.MessageOptions
import typings.chrome.chrome.runtime.PlatformInfo
import typings.chrome.chrome.runtime.Port
import typings.chrome.chrome.runtime.RequestUpdateCheckStatus
import typings.chrome.chrome.runtime.RuntimeEvent
import typings.chrome.chrome.runtime.RuntimeInstalledEvent
import typings.chrome.chrome.runtime.RuntimeRestartRequiredEvent
import typings.chrome.chrome.runtime.RuntimeUpdateAvailableEvent
import typings.chrome.chrome.runtime.UpdateCheckDetails
import typings.filesystem.DirectoryEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Runtime
////////////////////
/**
  * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
  * @since Chrome 22
  */
object runtime {
  
  @JSGlobal("chrome.runtime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.runtime.connect")
  @js.native
  def connect(): Port = js.native
  @JSGlobal("chrome.runtime.connect")
  @js.native
  def connect(connectInfo: ConnectInfo): Port = js.native
  @JSGlobal("chrome.runtime.connect")
  @js.native
  def connect(extensionId: String): Port = js.native
  @JSGlobal("chrome.runtime.connect")
  @js.native
  def connect(extensionId: String, connectInfo: ConnectInfo): Port = js.native
  
  @JSGlobal("chrome.runtime.connectNative")
  @js.native
  def connectNative(application: String): Port = js.native
  
  @JSGlobal("chrome.runtime.getBackgroundPage")
  @js.native
  def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[Window], Unit]): Unit = js.native
  
  @JSGlobal("chrome.runtime.getManifest")
  @js.native
  def getManifest(): Manifest = js.native
  
  @JSGlobal("chrome.runtime.getPackageDirectoryEntry")
  @js.native
  def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = js.native
  
  @JSGlobal("chrome.runtime.getPlatformInfo")
  @js.native
  def getPlatformInfo(callback: js.Function1[/* platformInfo */ PlatformInfo, Unit]): Unit = js.native
  
  @JSGlobal("chrome.runtime.getURL")
  @js.native
  def getURL(path: String): String = js.native
  
  @JSGlobal("chrome.runtime.id")
  @js.native
  def id: String = js.native
  @scala.inline
  def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.lastError")
  @js.native
  def lastError: js.UndefOr[LastError] = js.native
  @scala.inline
  def lastError_=(x: js.UndefOr[LastError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onBrowserUpdateAvailable")
  @js.native
  def onBrowserUpdateAvailable: RuntimeEvent = js.native
  @scala.inline
  def onBrowserUpdateAvailable_=(x: RuntimeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBrowserUpdateAvailable")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onConnect")
  @js.native
  def onConnect: ExtensionConnectEvent = js.native
  
  @JSGlobal("chrome.runtime.onConnectExternal")
  @js.native
  def onConnectExternal: ExtensionConnectEvent = js.native
  @scala.inline
  def onConnectExternal_=(x: ExtensionConnectEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConnectExternal")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onConnect_=(x: ExtensionConnectEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onInstalled")
  @js.native
  def onInstalled: RuntimeInstalledEvent = js.native
  @scala.inline
  def onInstalled_=(x: RuntimeInstalledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInstalled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onMessage")
  @js.native
  def onMessage: ExtensionMessageEvent = js.native
  
  @JSGlobal("chrome.runtime.onMessageExternal")
  @js.native
  def onMessageExternal: ExtensionMessageEvent = js.native
  @scala.inline
  def onMessageExternal_=(x: ExtensionMessageEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessageExternal")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onMessage_=(x: ExtensionMessageEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onRestartRequired")
  @js.native
  def onRestartRequired: RuntimeRestartRequiredEvent = js.native
  @scala.inline
  def onRestartRequired_=(x: RuntimeRestartRequiredEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRestartRequired")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onStartup")
  @js.native
  def onStartup: RuntimeEvent = js.native
  @scala.inline
  def onStartup_=(x: RuntimeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartup")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onSuspend")
  @js.native
  def onSuspend: RuntimeEvent = js.native
  
  @JSGlobal("chrome.runtime.onSuspendCanceled")
  @js.native
  def onSuspendCanceled: RuntimeEvent = js.native
  @scala.inline
  def onSuspendCanceled_=(x: RuntimeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCanceled")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onSuspend_=(x: RuntimeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onUpdateAvailable")
  @js.native
  def onUpdateAvailable: RuntimeUpdateAvailableEvent = js.native
  @scala.inline
  def onUpdateAvailable_=(x: RuntimeUpdateAvailableEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUpdateAvailable")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.openOptionsPage")
  @js.native
  def openOptionsPage(): Unit = js.native
  @JSGlobal("chrome.runtime.openOptionsPage")
  @js.native
  def openOptionsPage(callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.runtime.reload")
  @js.native
  def reload(): Unit = js.native
  
  @JSGlobal("chrome.runtime.requestUpdateCheck")
  @js.native
  def requestUpdateCheck(
    callback: js.Function2[
      /* status */ RequestUpdateCheckStatus, 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
  
  @JSGlobal("chrome.runtime.restart")
  @js.native
  def restart(): Unit = js.native
  
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(extensionId: String, message: js.Any): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(extensionId: String, message: js.Any, options: MessageOptions): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(
    extensionId: String,
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(extensionId: String, message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any, options: MessageOptions): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  @JSGlobal("chrome.runtime.sendNativeMessage")
  @js.native
  def sendNativeMessage(application: String, message: js.Object): Unit = js.native
  @JSGlobal("chrome.runtime.sendNativeMessage")
  @js.native
  def sendNativeMessage(
    application: String,
    message: js.Object,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.runtime.setUninstallURL")
  @js.native
  def setUninstallURL(url: String): Unit = js.native
  @JSGlobal("chrome.runtime.setUninstallURL")
  @js.native
  def setUninstallURL(url: String, callback: js.Function0[Unit]): Unit = js.native
}
