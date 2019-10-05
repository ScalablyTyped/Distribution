package typings.azureDashSb.libModelsSubscriptionresultMod.Azure.ServiceBus.Results

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
    val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle, DeadLetteringOnFilterEvaluationExceptions = DeadLetteringOnFilterEvaluationExceptions, DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration, DefaultMessageTimeToLive = DefaultMessageTimeToLive, EnableBatchedOperations = EnableBatchedOperations, LockDuration = LockDuration, MaxDeliveryCount = MaxDeliveryCount, MessageCount = MessageCount, RequiresSession = RequiresSession)
  
    __obj.asInstanceOf[SubscriptionProperties]
  }
}

