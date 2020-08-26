package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBrokerProperties extends js.Object {
  var CorrelationId: String = js.native
  var Label: String = js.native
  var MessageId: String = js.native
  var PartitionKey: String = js.native
  var ReplyTo: String = js.native
  var ReplyToSessionId: String = js.native
  var ScheduledEnqueueTimeUtc: String = js.native
  var SessionId: String = js.native
  var TimeToLive: String = js.native
  var To: String = js.native
}

object IBrokerProperties {
  @scala.inline
  def apply(
    CorrelationId: String,
    Label: String,
    MessageId: String,
    PartitionKey: String,
    ReplyTo: String,
    ReplyToSessionId: String,
    ScheduledEnqueueTimeUtc: String,
    SessionId: String,
    TimeToLive: String,
    To: String
  ): IBrokerProperties = {
    val __obj = js.Dynamic.literal(CorrelationId = CorrelationId.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], ReplyToSessionId = ReplyToSessionId.asInstanceOf[js.Any], ScheduledEnqueueTimeUtc = ScheduledEnqueueTimeUtc.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any], TimeToLive = TimeToLive.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrokerProperties]
  }
  @scala.inline
  implicit class IBrokerPropertiesOps[Self <: IBrokerProperties] (val x: Self) extends AnyVal {
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
    def setCorrelationId(value: String): Self = this.set("CorrelationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: String): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartitionKey(value: String): Self = this.set("PartitionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplyTo(value: String): Self = this.set("ReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplyToSessionId(value: String): Self = this.set("ReplyToSessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduledEnqueueTimeUtc(value: String): Self = this.set("ScheduledEnqueueTimeUtc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("SessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeToLive(value: String): Self = this.set("TimeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("To", value.asInstanceOf[js.Any])
  }
  
}

