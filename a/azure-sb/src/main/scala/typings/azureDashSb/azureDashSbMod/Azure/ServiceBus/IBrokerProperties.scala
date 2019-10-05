package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrokerProperties extends js.Object {
  var CorrelationId: String
  var Label: String
  var MessageId: String
  var PartitionKey: String
  var ReplyTo: String
  var ReplyToSessionId: String
  var ScheduledEnqueueTimeUtc: String
  var SessionId: String
  var TimeToLive: String
  var To: String
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
    val __obj = js.Dynamic.literal(CorrelationId = CorrelationId, Label = Label, MessageId = MessageId, PartitionKey = PartitionKey, ReplyTo = ReplyTo, ReplyToSessionId = ReplyToSessionId, ScheduledEnqueueTimeUtc = ScheduledEnqueueTimeUtc, SessionId = SessionId, TimeToLive = TimeToLive, To = To)
  
    __obj.asInstanceOf[IBrokerProperties]
  }
}

