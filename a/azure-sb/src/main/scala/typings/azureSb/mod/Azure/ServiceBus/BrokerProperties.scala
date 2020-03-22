package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IBrokerProperties> */
trait BrokerProperties extends js.Object {
  var CorrelationId: js.UndefOr[String] = js.undefined
  var Label: js.UndefOr[String] = js.undefined
  var MessageId: js.UndefOr[String] = js.undefined
  var PartitionKey: js.UndefOr[String] = js.undefined
  var ReplyTo: js.UndefOr[String] = js.undefined
  var ReplyToSessionId: js.UndefOr[String] = js.undefined
  var ScheduledEnqueueTimeUtc: js.UndefOr[String] = js.undefined
  var SessionId: js.UndefOr[String] = js.undefined
  var TimeToLive: js.UndefOr[String] = js.undefined
  var To: js.UndefOr[String] = js.undefined
}

object BrokerProperties {
  @scala.inline
  def apply(
    CorrelationId: String = null,
    Label: String = null,
    MessageId: String = null,
    PartitionKey: String = null,
    ReplyTo: String = null,
    ReplyToSessionId: String = null,
    ScheduledEnqueueTimeUtc: String = null,
    SessionId: String = null,
    TimeToLive: String = null,
    To: String = null
  ): BrokerProperties = {
    val __obj = js.Dynamic.literal()
    if (CorrelationId != null) __obj.updateDynamic("CorrelationId")(CorrelationId.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    if (PartitionKey != null) __obj.updateDynamic("PartitionKey")(PartitionKey.asInstanceOf[js.Any])
    if (ReplyTo != null) __obj.updateDynamic("ReplyTo")(ReplyTo.asInstanceOf[js.Any])
    if (ReplyToSessionId != null) __obj.updateDynamic("ReplyToSessionId")(ReplyToSessionId.asInstanceOf[js.Any])
    if (ScheduledEnqueueTimeUtc != null) __obj.updateDynamic("ScheduledEnqueueTimeUtc")(ScheduledEnqueueTimeUtc.asInstanceOf[js.Any])
    if (SessionId != null) __obj.updateDynamic("SessionId")(SessionId.asInstanceOf[js.Any])
    if (TimeToLive != null) __obj.updateDynamic("TimeToLive")(TimeToLive.asInstanceOf[js.Any])
    if (To != null) __obj.updateDynamic("To")(To.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerProperties]
  }
}

