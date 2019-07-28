package typings.chromeDashApps.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
  */
@JSGlobal("chrome.webViewRequest.SendMessageToExtension")
@js.native
class SendMessageToExtension protected () extends OnRequestActions {
  def this(parameters: SendMessageParams) = this()
  val instanceType: String = js.native
  val typeGuard: typings.chromeDashApps.chromeDashAppsStrings.SendMessageToExtension = js.native
}

