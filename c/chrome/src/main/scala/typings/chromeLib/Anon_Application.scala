package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Application extends js.Object {
  var id: java.lang.String = js.native
  var lastError: js.UndefOr[chromeLib.chromeNs.runtimeNs.LastError] = js.native
  var onBrowserUpdateAvailable: chromeLib.chromeNs.runtimeNs.RuntimeEvent = js.native
  var onConnect: chromeLib.chromeNs.runtimeNs.ExtensionConnectEvent = js.native
  var onConnectExternal: chromeLib.chromeNs.runtimeNs.ExtensionConnectEvent = js.native
  var onInstalled: chromeLib.chromeNs.runtimeNs.RuntimeInstalledEvent = js.native
  var onMessage: chromeLib.chromeNs.runtimeNs.ExtensionMessageEvent = js.native
  var onMessageExternal: chromeLib.chromeNs.runtimeNs.ExtensionMessageEvent = js.native
  var onRestartRequired: chromeLib.chromeNs.runtimeNs.RuntimeRestartRequiredEvent = js.native
  var onStartup: chromeLib.chromeNs.runtimeNs.RuntimeEvent = js.native
  var onSuspend: chromeLib.chromeNs.runtimeNs.RuntimeEvent = js.native
  var onSuspendCanceled: chromeLib.chromeNs.runtimeNs.RuntimeEvent = js.native
  var onUpdateAvailable: chromeLib.chromeNs.runtimeNs.RuntimeUpdateAvailableEvent = js.native
  def connect(): chromeLib.chromeNs.runtimeNs.Port = js.native
  def connect(connectInfo: chromeLib.chromeNs.runtimeNs.ConnectInfo): chromeLib.chromeNs.runtimeNs.Port = js.native
  def connect(extensionId: java.lang.String): chromeLib.chromeNs.runtimeNs.Port = js.native
  def connect(extensionId: java.lang.String, connectInfo: chromeLib.chromeNs.runtimeNs.ConnectInfo): chromeLib.chromeNs.runtimeNs.Port = js.native
  def connectNative(application: java.lang.String): chromeLib.chromeNs.runtimeNs.Port = js.native
  def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[this.type], scala.Unit]): scala.Unit = js.native
  def getManifest(): chromeLib.chromeNs.runtimeNs.Manifest = js.native
  def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ filesystemLib.DirectoryEntry, scala.Unit]): scala.Unit = js.native
  def getPlatformInfo(callback: js.Function1[/* platformInfo */ chromeLib.chromeNs.runtimeNs.PlatformInfo, scala.Unit]): scala.Unit = js.native
  def getURL(path: java.lang.String): java.lang.String = js.native
  def openOptionsPage(): scala.Unit = js.native
  def openOptionsPage(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def requestUpdateCheck(
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* details */ js.UndefOr[chromeLib.chromeNs.runtimeNs.UpdateCheckDetails], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def restart(): scala.Unit = js.native
  def sendMessage(extensionId: java.lang.String, message: js.Any): scala.Unit = js.native
  def sendMessage(
    extensionId: java.lang.String,
    message: js.Any,
    options: chromeLib.chromeNs.runtimeNs.MessageOptions
  ): scala.Unit = js.native
  def sendMessage(
    extensionId: java.lang.String,
    message: js.Any,
    options: chromeLib.chromeNs.runtimeNs.MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(
    extensionId: java.lang.String,
    message: js.Any,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(message: js.Any): scala.Unit = js.native
  def sendMessage(message: js.Any, options: chromeLib.chromeNs.runtimeNs.MessageOptions): scala.Unit = js.native
  def sendMessage(
    message: js.Any,
    options: chromeLib.chromeNs.runtimeNs.MessageOptions,
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

