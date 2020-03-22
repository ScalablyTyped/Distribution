package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined azure-sb.azure-sb.Azure.ServiceBus.IBrokerPropertiesResponse & std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IBrokerProperties> */
trait BrokerPropertiesResponse extends js.Object {
  var CorrelationId: js.UndefOr[String] = js.undefined
  val DeliveryCount: Double
  var Label: js.UndefOr[String] = js.undefined
  val LockToken: String
  val LockedUntil: DateString
  var MessageId: js.UndefOr[String] = js.undefined
  var PartitionKey: js.UndefOr[String] = js.undefined
  var ReplyTo: js.UndefOr[String] = js.undefined
  var ReplyToSessionId: js.UndefOr[String] = js.undefined
  var ScheduledEnqueueTimeUtc: js.UndefOr[String] = js.undefined
  val SequenceNumber: Double
  var SessionId: js.UndefOr[String] = js.undefined
  var TimeToLive: js.UndefOr[String] = js.undefined
  var To: js.UndefOr[String] = js.undefined
}

object BrokerPropertiesResponse {
  @scala.inline
  def apply(
    DeliveryCount: Double,
    LockToken: String,
    LockedUntil: DateString,
    SequenceNumber: Double,
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
  ): BrokerPropertiesResponse = {
    val __obj = js.Dynamic.literal(DeliveryCount = DeliveryCount.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], LockedUntil = LockedUntil.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[BrokerPropertiesResponse]
  }
}

