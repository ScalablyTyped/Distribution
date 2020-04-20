package typings.azureSb.subscriptionresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionProperties extends js.Object {
  var AutoDeleteOnIdle: Boolean
  var DeadLetteringOnFilterEvaluationExceptions: String
  var DeadLetteringOnMessageExpiration: String
  var DefaultMessageTimeToLive: String
  var EnableBatchedOperations: Boolean
  var LockDuration: String
  var MaxDeliveryCount: Double
  var MessageCount: Double
  var RequiresSession: Boolean
}

object SubscriptionProperties {
  @scala.inline
  def apply(
    AutoDeleteOnIdle: Boolean,
    DeadLetteringOnFilterEvaluationExceptions: String,
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    EnableBatchedOperations: Boolean,
    LockDuration: String,
    MaxDeliveryCount: Double,
    MessageCount: Double,
    RequiresSession: Boolean
  ): SubscriptionProperties = {
    val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], DeadLetteringOnFilterEvaluationExceptions = DeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionProperties]
  }
}

