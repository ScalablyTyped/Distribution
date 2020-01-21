package typings.chrome.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime")
@js.native
object ^ extends js.Object {
  var id: String = js.native
  var lastError: js.UndefOr[LastError_] = js.native
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
}

