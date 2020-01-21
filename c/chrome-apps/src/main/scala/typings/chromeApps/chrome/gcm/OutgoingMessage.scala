package typings.chromeApps.chrome.gcm

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingMessage extends js.Object {
  /**
    * Message data to send to the server.
    *
    * Case-insensitive goog. and google,
    * as well as case-sensitive collapse_key
    * are disallowed as key prefixes.
    *
    * Sum of all key/value pairs should not exceed gcm.MAX_MESSAGE_SIZE.
    **/
  var data: IGCMDataSend
  /** The ID of the server to send the message to as assigned by Google API Console. */
  var destinationId: String
  /** The ID of the message. It must be unique for each message in scope of the applications. See the Cloud Messaging documentation for advice for picking and handling an ID. */
  var messageId: String
  /** Time-to-live of the message in seconds. If it is not possible to send the message within that time, an onSendError event will be raised. A time-to-live of 0 indicates that the message should be sent immediately or fail if it's not possible. The maximum and a default value of time-to-live is 86400 seconds (1 day). */
  var timeToLive: js.UndefOr[integer] = js.undefined
}

object OutgoingMessage {
  @scala.inline
  def apply(data: IGCMDataSend, destinationId: String, messageId: String, timeToLive: Int | Double = null): OutgoingMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingMessage]
  }
}

