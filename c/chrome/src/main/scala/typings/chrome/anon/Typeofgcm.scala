package typings.chrome.anon

import typings.chrome.chrome.gcm.GcmErrorEvent
import typings.chrome.chrome.gcm.MessageDeletionEvent
import typings.chrome.chrome.gcm.MessageReceptionEvent
import typings.chrome.chrome.gcm.OutgoingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgcm extends StObject {
  
  var MAX_MESSAGE_SIZE: Double = js.native
  
  var onMessage: MessageReceptionEvent = js.native
  
  var onMessagesDeleted: MessageDeletionEvent = js.native
  
  var onSendError: GcmErrorEvent = js.native
  
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit = js.native
  
  def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit = js.native
  
  def unregister(callback: js.Function0[Unit]): Unit = js.native
}
object Typeofgcm {
  
  @scala.inline
  def apply(
    MAX_MESSAGE_SIZE: Double,
    onMessage: MessageReceptionEvent,
    onMessagesDeleted: MessageDeletionEvent,
    onSendError: GcmErrorEvent,
    register: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Unit,
    send: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Unit,
    unregister: js.Function0[Unit] => Unit
  ): Typeofgcm = {
    val __obj = js.Dynamic.literal(MAX_MESSAGE_SIZE = MAX_MESSAGE_SIZE.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], onMessagesDeleted = onMessagesDeleted.asInstanceOf[js.Any], onSendError = onSendError.asInstanceOf[js.Any], register = js.Any.fromFunction2(register), send = js.Any.fromFunction2(send), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[Typeofgcm]
  }
  
  @scala.inline
  implicit class TypeofgcmMutableBuilder[Self <: Typeofgcm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMAX_MESSAGE_SIZE(value: Double): Self = StObject.set(x, "MAX_MESSAGE_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessage(value: MessageReceptionEvent): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessagesDeleted(value: MessageDeletionEvent): Self = StObject.set(x, "onMessagesDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSendError(value: GcmErrorEvent): Self = StObject.set(x, "onSendError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSend(value: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnregister(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
  }
}
