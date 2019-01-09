package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackMAXMESSAGESIZE extends js.Object {
  var MAX_MESSAGE_SIZE: scala.Double
  var onMessage: chromeLib.chromeNs.gcmNs.MessageReceptionEvent
  var onMessagesDeleted: chromeLib.chromeNs.gcmNs.MessageDeletionEvent
  var onSendError: chromeLib.chromeNs.gcmNs.GcmErrorEvent
  def register(
    senderIds: js.Array[java.lang.String],
    callback: js.Function1[/* registrationId */ java.lang.String, scala.Unit]
  ): scala.Unit
  def send(
    message: chromeLib.chromeNs.gcmNs.OutgoingMessage,
    callback: js.Function1[/* messageId */ java.lang.String, scala.Unit]
  ): scala.Unit
  def unregister(callback: js.Function0[scala.Unit]): scala.Unit
}

