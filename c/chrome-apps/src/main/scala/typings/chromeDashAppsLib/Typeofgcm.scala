package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofgcm extends js.Object {
  /**
    * The maximum size (in bytes) of all key/value pairs in a message.
    * @default 4096
    */
  val MAX_MESSAGE_SIZE: chromeDashAppsLib.chromeNs.integer
  /** Fired when a message is received through GCM. */
  val onMessage: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function1[/* message */ chromeDashAppsLib.chromeNs.gcmNs.IncomingMessage, scala.Unit]
  ]
  /** Fired when a GCM server had to delete messages sent by an app server to the application. See Messages deleted event section of Cloud Messaging documentation for details on handling this event. */
  val onMessagesDeleted: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  /** Fired when it was not possible to send a message to the GCM server. */
  val onSendError: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* error */ chromeDashAppsLib.chromeNs.gcmNs.GcmError, scala.Unit]]
  /**
    * Registers the application with GCM. The registration ID will be returned by the callback. If register is called again with the same list of senderIds, the same registration ID will be returned.
    * @param senderIds A list of server IDs that are allowed to send messages to the application. It should contain at least one and no more than 100 sender IDs.
    * @param callback Function called when registration completes. It should check runtime.lastError for error when registrationId is empty.
    * The callback parameter should be a function that looks like this:
    * function(string registrationId) {...};
    * Parameter registrationId: A registration ID assigned to the application by the GCM.
    */
  def register(
    senderIds: js.Array[java.lang.String],
    callback: js.Function1[/* registrationId */ java.lang.String, scala.Unit]
  ): scala.Unit
  /**
    * Sends a message according to its contents.
    * @param message A message to send to the other party via GCM.
    * @param callback A function called after the message is successfully queued for sending. runtime.lastError should be checked, to ensure a message was sent without problems.
    * The callback parameter should be a function that looks like this:
    * function(string messageId) {...};
    * Parameter messageId: The ID of the message that the callback was issued for.
    */
  def send(
    message: chromeDashAppsLib.chromeNs.gcmNs.OutgoingMessage,
    callback: js.Function1[/* messageId */ java.lang.String, scala.Unit]
  ): scala.Unit
  /**
    * Unregisters the application from GCM.
    * @param callback A function called after the unregistration completes. Unregistration was successful if runtime.lastError is not set.
    * The callback parameter should be a function that looks like this:
    * function() {...};
    */
  def unregister(callback: js.Function0[scala.Unit]): scala.Unit
}

object Typeofgcm {
  @scala.inline
  def apply(
    MAX_MESSAGE_SIZE: chromeDashAppsLib.chromeNs.integer,
    onMessage: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function1[/* message */ chromeDashAppsLib.chromeNs.gcmNs.IncomingMessage, scala.Unit]
    ],
    onMessagesDeleted: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]],
    onSendError: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* error */ chromeDashAppsLib.chromeNs.gcmNs.GcmError, scala.Unit]],
    register: (js.Array[java.lang.String], js.Function1[/* registrationId */ java.lang.String, scala.Unit]) => scala.Unit,
    send: (chromeDashAppsLib.chromeNs.gcmNs.OutgoingMessage, js.Function1[/* messageId */ java.lang.String, scala.Unit]) => scala.Unit,
    unregister: js.Function0[scala.Unit] => scala.Unit
  ): Typeofgcm = {
    val __obj = js.Dynamic.literal(MAX_MESSAGE_SIZE = MAX_MESSAGE_SIZE, onMessage = onMessage, onMessagesDeleted = onMessagesDeleted, onSendError = onSendError, register = js.Any.fromFunction2(register), send = js.Any.fromFunction2(send), unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[Typeofgcm]
  }
}

