package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPutMessageRequest extends js.Object {
  /**
    * The name of the channel where the messages are sent.
    */
  var channelName: ChannelName = js.native
  /**
    * The list of messages to be sent. Each message has format: '{ "messageId": "string", "payload": "string"}'. Note that the field names of message payloads (data) that you send to AWS IoT Analytics:   Must contain only alphanumeric characters and undescores (_); no other special characters are allowed.   Must begin with an alphabetic character or single underscore (_).   Cannot contain hyphens (-).   In regular expression terms: "^[A-Za-z_]([A-Za-z0-9]*|[A-Za-z0-9][A-Za-z0-9_]*)$".    Cannot be greater than 255 characters.   Are case-insensitive. (Fields named "foo" and "FOO" in the same payload are considered duplicates.)   For example, {"temp_01": 29} or {"_temp_01": 29} are valid, but {"temp-01": 29}, {"01_temp": 29} or {"__temp_01": 29} are invalid in message payloads. 
    */
  var messages: Messages = js.native
}

object BatchPutMessageRequest {
  @scala.inline
  def apply(channelName: ChannelName, messages: Messages): BatchPutMessageRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutMessageRequest]
  }
  @scala.inline
  implicit class BatchPutMessageRequestOps[Self <: BatchPutMessageRequest] (val x: Self) extends AnyVal {
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
    def setChannelName(value: ChannelName): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: Messages): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
  
}

