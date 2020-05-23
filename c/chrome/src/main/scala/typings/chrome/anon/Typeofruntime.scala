package typings.chrome.anon

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofruntime extends js.Object {
  var id: String = js.native
  var lastError: js.UndefOr[LastError] = js.native
  var onBrowserUpdateAvailable: RuntimeEvent = js.native
  var onConnect: ExtensionConnectEvent = js.native
  var onConnectExternal: ExtensionConnectEvent = js.native
  var onInstalled: RuntimeInstalledEvent = js.native
  var onMessage: ExtensionMessageEvent = js.native
  var onMessageExternal: ExtensionMessageEvent = js.native
  var onRestartRequired: RuntimeRestartRequiredEvent = js.native
  var onStartup: RuntimeEvent = js.native
  var onSuspend: RuntimeEvent = js.native
  var onSuspendCanceled: RuntimeEvent = js.native
  var onUpdateAvailable: RuntimeUpdateAvailableEvent = js.native
  def connect(): Port = js.native
  def connect(connectInfo: ConnectInfo): Port = js.native
  def connect(extensionId: String): Port = js.native
  def connect(extensionId: String, connectInfo: ConnectInfo): Port = js.native
  def connectNative(application: String): Port = js.native
  def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[this.type], Unit]): Unit = js.native
  def getManifest(): Manifest = js.native
  def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = js.native
  def getPlatformInfo(callback: js.Function1[/* platformInfo */ PlatformInfo, Unit]): Unit = js.native
  def getURL(path: String): String = js.native
  def openOptionsPage(): Unit = js.native
  def openOptionsPage(callback: js.Function0[Unit]): Unit = js.native
  def reload(): Unit = js.native
  def requestUpdateCheck(
    callback: js.Function2[
      /* status */ RequestUpdateCheckStatus, 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
  def restart(): Unit = js.native
  def sendMessage(extensionId: String, message: js.Any): Unit = js.native
  def sendMessage(extensionId: String, message: js.Any, options: MessageOptions): Unit = js.native
  def sendMessage(
    extensionId: String,
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(extensionId: String, message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessage(message: js.Any, options: MessageOptions): Unit = js.native
  def sendMessage(
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendNativeMessage(application: String, message: js.Object): Unit = js.native
  def sendNativeMessage(
    application: String,
    message: js.Object,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def setUninstallURL(url: String): Unit = js.native
  def setUninstallURL(url: String, callback: js.Function0[Unit]): Unit = js.native
}

