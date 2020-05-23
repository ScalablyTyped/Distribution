package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateSubscriptionOptions> */
trait CreateSubscriptionOptions extends js.Object {
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.undefined
  var EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.undefined
  var EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.undefined
  var LockDuration: js.UndefOr[String] = js.undefined
  var RequiresSession: js.UndefOr[Boolean] = js.undefined
}

object CreateSubscriptionOptions {
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String = null,
    EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.undefined,
    EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.undefined,
    LockDuration: String = null,
    RequiresSession: js.UndefOr[Boolean] = js.undefined
  ): CreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (DefaultMessageTimeToLive != null) __obj.updateDynamic("DefaultMessageTimeToLive")(DefaultMessageTimeToLive.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableDeadLetteringOnFilterEvaluationExceptions)) __obj.updateDynamic("EnableDeadLetteringOnFilterEvaluationExceptions")(EnableDeadLetteringOnFilterEvaluationExceptions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableDeadLetteringOnMessageExpiration)) __obj.updateDynamic("EnableDeadLetteringOnMessageExpiration")(EnableDeadLetteringOnMessageExpiration.get.asInstanceOf[js.Any])
    if (LockDuration != null) __obj.updateDynamic("LockDuration")(LockDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(RequiresSession)) __obj.updateDynamic("RequiresSession")(RequiresSession.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriptionOptions]
  }
}

