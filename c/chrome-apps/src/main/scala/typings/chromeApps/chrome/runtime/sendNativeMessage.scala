package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.sendNativeMessage")
@js.native
object sendNativeMessage extends js.Object {
  /**
    * Send a single message to a native application.
    * @since Chrome 28.
    * @param application The of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    * @param responseCallback Optional.
    * Parameter response: The response message sent by the native messaging host. If an error occurs while connecting to the native messaging host, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def apply(application: String, message: js.Object): Unit = js.native
  def apply(
    application: String,
    message: js.Object,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
}

