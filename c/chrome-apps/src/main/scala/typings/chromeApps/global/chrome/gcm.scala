package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.gcm.GcmError
import typings.chromeApps.chrome.gcm.IncomingMessage
import typings.chromeApps.chrome.gcm.OutgoingMessage
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.gcm
////////////////////////////
// Google Cloud Messaging //
////////////////////////////
/**
  * Use chrome.gcm to enable apps to send and receive
  * messages through the Google Cloud Messaging Service.
  * @deprecated
  * As of April 10, 2018, Google has deprecated GCM.
  * The GCM server and client APIs are deprecated and will be removed as soon as April 11, 2019.
  * Migrate GCM apps to Firebase Cloud Messaging (FCM),
  * which inherits the reliable and scalable GCM infrastructure,
  * plus many new features. See the migration guide to learn more.
  * @see[Migration guide]{@link https://developers.google.com/cloud-messaging/android/android-migrate-fcm}
  * @see[GCM Imlementation guide]{@link https://developers.google.com/cloud-messaging/chrome/client}
  * @since Chrome 35.
  * @requires Permissions: 'gcm'
  */
@JSGlobal("chrome.gcm")
@js.native
object gcm extends js.Object {
  
  /**
    * The maximum size (in bytes) of all key/value pairs in a message.
    * @default 4096
    */
  val MAX_MESSAGE_SIZE: integer = js.native
  
  /** Fired when a message is received through GCM. */
  val onMessage: typings.chromeApps.chrome.events.Event[js.Function1[/* message */ IncomingMessage, Unit]] = js.native
  
  /** Fired when a GCM server had to delete messages sent by an app server to the application. See Messages deleted event section of Cloud Messaging documentation for details on handling this event. */
  val onMessagesDeleted: typings.chromeApps.chrome.events.Event[js.Function0[Unit]] = js.native
  
  /** Fired when it was not possible to send a message to the GCM server. */
  val onSendError: typings.chromeApps.chrome.events.Event[js.Function1[/* error */ GcmError, Unit]] = js.native
  
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
