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
    val __obj = js.Dynamic.literal(CorrelationId = CorrelationId.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], ReplyTo = ReplyTo.asInstanceOf[js.Any], ReplyToSessionId = ReplyToSessionId.asInstanceOf[js.Any], ScheduledEnqueueTimeUtc = ScheduledEnqueueTimeUtc.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any], TimeToLive = TimeToLive.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBrokerProperties]
  }
}

