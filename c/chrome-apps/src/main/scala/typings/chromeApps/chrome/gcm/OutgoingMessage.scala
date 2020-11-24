package typings.chromeApps.chrome.gcm

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var data: IGCMDataSend = js.native
  
  /** The ID of the server to send the message to as assigned by Google API Console. */
  var destinationId: String = js.native
  
  /** The ID of the message. It must be unique for each message in scope of the applications. See the Cloud Messaging documentation for advice for picking and handling an ID. */
  var messageId: String = js.native
  
  /** Time-to-live of the message in seconds. If it is not possible to send the message within that time, an onSendError event will be raised. A time-to-live of 0 indicates that the message should be sent immediately or fail if it's not possible. The maximum and a default value of time-to-live is 86400 seconds (1 day). */
  var timeToLive: js.UndefOr[integer] = js.native
}
object OutgoingMessage {
  
  @scala.inline
  def apply(data: IGCMDataSend, destinationId: String, messageId: String): OutgoingMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingMessage]
  }
  
  @scala.inline
  implicit class OutgoingMessageOps[Self <: OutgoingMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: IGCMDataSend): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationId(value: String): Self = this.set("destinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLive(value: integer): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLive: Self = this.set("timeToLive", js.undefined)
  }
}
