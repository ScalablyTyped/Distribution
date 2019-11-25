package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateSubscriptionOptions extends js.Object {
  var DefaultMessageTimeToLive: String
  var EnableDeadLetteringOnFilterEvaluationExceptions: Boolean
  var EnableDeadLetteringOnMessageExpiration: Boolean
  var LockDuration: String
  var RequiresSession: Boolean
}

object ICreateSubscriptionOptions {
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    EnableDeadLetteringOnFilterEvaluationExceptions: Boolean,
    EnableDeadLetteringOnMessageExpiration: Boolean,
    LockDuration: String,
    RequiresSession: Boolean
  ): ICreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], EnableDeadLetteringOnFilterEvaluationExceptions = EnableDeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], EnableDeadLetteringOnMessageExpiration = EnableDeadLetteringOnMessageExpiration.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICreateSubscriptionOptions]
  }
}

