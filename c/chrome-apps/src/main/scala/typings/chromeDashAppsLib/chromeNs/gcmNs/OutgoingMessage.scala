package typings
package chromeDashAppsLib.chromeNs.gcmNs

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
  var destinationId: java.lang.String
  /** The ID of the message. It must be unique for each message in scope of the applications. See the Cloud Messaging documentation for advice for picking and handling an ID. */
  var messageId: java.lang.String
  /** Time-to-live of the message in seconds. If it is not possible to send the message within that time, an onSendError event will be raised. A time-to-live of 0 indicates that the message should be sent immediately or fail if it's not possible. The maximum and a default value of time-to-live is 86400 seconds (1 day). */
  var timeToLive: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

