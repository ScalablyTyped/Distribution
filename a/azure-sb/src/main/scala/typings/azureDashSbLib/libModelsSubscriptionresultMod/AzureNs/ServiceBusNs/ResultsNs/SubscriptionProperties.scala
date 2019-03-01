package typings
package azureDashSbLib.libModelsSubscriptionresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionProperties extends js.Object {
  var AutoDeleteOnIdle: scala.Boolean
  var DeadLetteringOnFilterEvaluationExceptions: java.lang.String
  var DeadLetteringOnMessageExpiration: java.lang.String
  var DefaultMessageTimeToLive: java.lang.String
  var EnableBatchedOperations: scala.Boolean
  var LockDuration: java.lang.String
  var MaxDeliveryCount: scala.Double
  var MessageCount: scala.Double
  var RequiresSession: scala.Boolean
}

object SubscriptionProperties {
  @scala.inline
  def apply(
    AutoDeleteOnIdle: scala.Boolean,
    DeadLetteringOnFilterEvaluationExceptions: java.lang.String,
    DeadLetteringOnMessageExpiration: java.lang.String,
    DefaultMessageTimeToLive: java.lang.String,
    EnableBatchedOperations: scala.Boolean,
    LockDuration: java.lang.String,
    MaxDeliveryCount: scala.Double,
    MessageCount: scala.Double,
    RequiresSession: scala.Boolean
  ): SubscriptionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutoDeleteOnIdle")(AutoDeleteOnIdle)
    __obj.updateDynamic("DeadLetteringOnFilterEvaluationExceptions")(DeadLetteringOnFilterEvaluationExceptions)
    __obj.updateDynamic("DeadLetteringOnMessageExpiration")(DeadLetteringOnMessageExpiration)
    __obj.updateDynamic("DefaultMessageTimeToLive")(DefaultMessageTimeToLive)
    __obj.updateDynamic("EnableBatchedOperations")(EnableBatchedOperations)
    __obj.updateDynamic("LockDuration")(LockDuration)
    __obj.updateDynamic("MaxDeliveryCount")(MaxDeliveryCount)
    __obj.updateDynamic("MessageCount")(MessageCount)
    __obj.updateDynamic("RequiresSession")(RequiresSession)
    __obj.asInstanceOf[SubscriptionProperties]
  }
}

