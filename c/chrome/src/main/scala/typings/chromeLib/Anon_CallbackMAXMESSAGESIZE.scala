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

object Anon_CallbackMAXMESSAGESIZE {
  @scala.inline
  def apply(
    MAX_MESSAGE_SIZE: scala.Double,
    onMessage: chromeLib.chromeNs.gcmNs.MessageReceptionEvent,
    onMessagesDeleted: chromeLib.chromeNs.gcmNs.MessageDeletionEvent,
    onSendError: chromeLib.chromeNs.gcmNs.GcmErrorEvent,
    register: js.Function2[
      js.Array[java.lang.String], 
      js.Function1[/* registrationId */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    send: js.Function2[
      chromeLib.chromeNs.gcmNs.OutgoingMessage, 
      js.Function1[/* messageId */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    unregister: js.Function1[js.Function0[scala.Unit], scala.Unit]
  ): Anon_CallbackMAXMESSAGESIZE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MAX_MESSAGE_SIZE")(MAX_MESSAGE_SIZE)
    __obj.updateDynamic("onMessage")(onMessage)
    __obj.updateDynamic("onMessagesDeleted")(onMessagesDeleted)
    __obj.updateDynamic("onSendError")(onSendError)
    __obj.updateDynamic("register")(register)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("unregister")(unregister)
    __obj.asInstanceOf[Anon_CallbackMAXMESSAGESIZE]
  }
}

