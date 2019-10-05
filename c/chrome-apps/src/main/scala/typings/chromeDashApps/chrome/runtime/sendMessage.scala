package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.sendMessage")
@js.native
object sendMessage extends js.Object {
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response. If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension. Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 32.
    * @param extensionId The ID of the app to send the message to. If omitted, the message will be sent to your own app. Required if sending messages from a web page for web messaging.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def apply(extensionId: String, message: js.Any): Unit = js.native
  def apply(
    extensionId: String,
    message: js.Any,
    options: Null,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def apply(extensionId: String, message: js.Any, options: MessageOptions): Unit = js.native
  def apply(
    extensionId: String,
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response.
    * If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension.
    * Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 26.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def apply(message: js.Any): Unit = js.native
  def apply(message: js.Any, options: Null, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def apply(message: js.Any, options: MessageOptions): Unit = js.native
  def apply(
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def apply(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
}

