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
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive, EnableDeadLetteringOnFilterEvaluationExceptions = EnableDeadLetteringOnFilterEvaluationExceptions, EnableDeadLetteringOnMessageExpiration = EnableDeadLetteringOnMessageExpiration, LockDuration = LockDuration, RequiresSession = RequiresSession)
  
    __obj.asInstanceOf[ICreateSubscriptionOptions]
  }
}

