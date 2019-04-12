package typings
package chromeLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime")
@js.native
object ^ extends js.Object {
  var id: java.lang.String = js.native
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
  def connect(extensionId: java.lang.String): Port = js.native
  def connect(extensionId: java.lang.String, connectInfo: ConnectInfo): Port = js.native
  def connectNative(application: java.lang.String): Port = js.native
  def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[chromeLib.Window], scala.Unit]): scala.Unit = js.native
  def getManifest(): Manifest = js.native
  def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ filesystemLib.DirectoryEntry, scala.Unit]): scala.Unit = js.native
  def getPlatformInfo(callback: js.Function1[/* platformInfo */ PlatformInfo, scala.Unit]): scala.Unit = js.native
  def getURL(path: java.lang.String): java.lang.String = js.native
  def openOptionsPage(): scala.Unit = js.native
  def openOptionsPage(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def requestUpdateCheck(
    callback: js.Function2[
      /* status */ RequestUpdateCheckStatus, 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def restart(): scala.Unit = js.native
  def sendMessage(extensionId: java.lang.String, message: js.Any): scala.Unit = js.native
  def sendMessage(extensionId: java.lang.String, message: js.Any, options: MessageOptions): scala.Unit = js.native
  def sendMessage(
    extensionId: java.lang.String,
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(
    extensionId: java.lang.String,
    message: js.Any,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(message: js.Any): scala.Unit = js.native
  def sendMessage(message: js.Any, options: MessageOptions): scala.Unit = js.native
  def sendMessage(
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
  def sendNativeMessage(application: java.lang.String, message: js.Object): scala.Unit = js.native
  def sendNativeMessage(
    application: java.lang.String,
    message: js.Object,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setUninstallURL(url: java.lang.String): scala.Unit = js.native
  def setUninstallURL(url: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

