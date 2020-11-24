package typings.chrome.global.chrome

import typings.chrome.chrome.gcm.GcmErrorEvent
import typings.chrome.chrome.gcm.MessageDeletionEvent
import typings.chrome.chrome.gcm.MessageReceptionEvent
import typings.chrome.chrome.gcm.OutgoingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Google Cloud Messaging
////////////////////
/**
  * Use chrome.gcm to enable apps and extensions to send and receive messages through the Google Cloud Messaging Service.
  * Availability: Since Chrome 35.
  * Permissions:  "gcm"
  */
@JSGlobal("chrome.gcm")
@js.native
object gcm extends js.Object {
  
  var MAX_MESSAGE_SIZE: Double = js.native
  
  var onMessage: MessageReceptionEvent = js.native
  
  var onMessagesDeleted: MessageDeletionEvent = js.native
  
  var onSendError: GcmErrorEvent = js.native
  
  def register(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit = js.native
  
  def send(message: OutgoingMessage, callback: js.Function1[/* messageId */ String, Unit]): Unit = js.native
  
  def unregister(callback: js.Function0[Unit]): Unit = js.native
}
