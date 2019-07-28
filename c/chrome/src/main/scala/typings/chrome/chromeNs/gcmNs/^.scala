package typings.chrome.chromeNs.gcmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.gcm")
@js.native
object ^ extends js.Object {
  var MAX_MESSAGE_SIZE: Double = js.native
  var onMessage: MessageReceptionEvent = js.native
  var onMessagesDeleted: MessageDeletionEvent = js.native
  var onSendError: GcmErrorEvent = js.native
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit = js.native
  def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit = js.native
  def unregister(callback: js.Function0[Unit]): Unit = js.native
}

