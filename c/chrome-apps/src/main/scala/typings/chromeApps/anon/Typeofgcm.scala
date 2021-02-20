package typings.chromeApps.anon

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.gcm.GcmError
import typings.chromeApps.chrome.gcm.IncomingMessage
import typings.chromeApps.chrome.gcm.OutgoingMessage
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofgcm extends StObject {
  
  /**
    * The maximum size (in bytes) of all key/value pairs in a message.
    * @default 4096
    */
  val MAX_MESSAGE_SIZE: integer = js.native
  
  /** Fired when a message is received through GCM. */
  val onMessage: Event[js.Function1[/* message */ IncomingMessage, Unit]] = js.native
  
  /** Fired when a GCM server had to delete messages sent by an app server to the application. See Messages deleted event section of Cloud Messaging documentation for details on handling this event. */
  val onMessagesDeleted: Event[js.Function0[Unit]] = js.native
  
  /** Fired when it was not possible to send a message to the GCM server. */
  val onSendError: Event[js.Function1[/* error */ GcmError, Unit]] = js.native
  
  /**
    * Registers the application with GCM. The registration ID will be returned by the callback. If register is called again with the same list of senderIds, the same registration ID will be returned.
    * @param senderIds A list of server IDs that are allowed to send messages to the application. It should contain at least one and no more than 100 sender IDs.
    * @param callback Function called when registration completes. It should check runtime.lastError for error when registrationId is empty.
    * The callback parameter should be a function that looks like this:
    * function(string registrationId) {...};
    * Parameter registrationId: A registration ID assigned to the application by the GCM.
    */
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit = js.native
  
  /**
    * Sends a message according to its contents.
    * @param message A message to send to the other party via GCM.
    * @param callback A function called after the message is successfully queued for sending. runtime.lastError should be checked, to ensure a message was sent without problems.
    * The callback parameter should be a function that looks like this:
    * function(string messageId) {...};
    * Parameter messageId: The ID of the message that the callback was issued for.
    */
  def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit = js.native
  
  /**
    * Unregisters the application from GCM.
    * @param callback A function called after the unregistration completes. Unregistration was successful if runtime.lastError is not set.
    * The callback parameter should be a function that looks like this:
    * function() {...};
    */
  def unregister(callback: js.Function0[Unit]): Unit = js.native
}
object Typeofgcm {
  
  @scala.inline
  def apply(
    MAX_MESSAGE_SIZE: integer,
    onMessage: Event[js.Function1[/* message */ IncomingMessage, Unit]],
    onMessagesDeleted: Event[js.Function0[Unit]],
    onSendError: Event[js.Function1[/* error */ GcmError, Unit]],
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
    def setMAX_MESSAGE_SIZE(value: integer): Self = StObject.set(x, "MAX_MESSAGE_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessage(value: Event[js.Function1[/* message */ IncomingMessage, Unit]]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessagesDeleted(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onMessagesDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSendError(value: Event[js.Function1[/* error */ GcmError, Unit]]): Self = StObject.set(x, "onSendError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: (js.Array[String], js.Function1[/* registrationId */ String, Unit]) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSend(value: (OutgoingMessage, js.Function1[/* messageId */ String, Unit]) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnregister(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
  }
}
