package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.connect")
@js.native
object connect extends js.Object {
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    */
  def apply(): Port = js.native
  def apply(connectInfo: ConnectInfo): Port = js.native
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    * @param extensionId Optional; ID of the extension.
    * The ID of the extension or app to connect to.
    * If omitted, a connection will be attempted with your own app.
    * Required if sending messages from a web page for web messaging.
    */
  def apply(extensionId: String): Port = js.native
  def apply(extensionId: String, connectInfo: ConnectInfo): Port = js.native
}

