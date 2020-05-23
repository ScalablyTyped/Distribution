package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyUsageLimitMessage extends js.Object {
  /**
    * The new limit amount. For more information about this parameter, see UsageLimit. 
    */
  var Amount: js.UndefOr[LongOptional] = js.native
  /**
    * The new action that Amazon Redshift takes when the limit is reached. For more information about this parameter, see UsageLimit. 
    */
  var BreachAction: js.UndefOr[UsageLimitBreachAction] = js.native
  /**
    * The identifier of the usage limit to modify.
    */
  var UsageLimitId: String = js.native
}

object ModifyUsageLimitMessage {
  @scala.inline
  def apply(
    UsageLimitId: String,
    Amount: js.UndefOr[LongOptional] = js.undefined,
    BreachAction: UsageLimitBreachAction = null
  ): ModifyUsageLimitMessage = {
    val __obj = js.Dynamic.literal(UsageLimitId = UsageLimitId.asInstanceOf[js.Any])
    if (!js.isUndefined(Amount)) __obj.updateDynamic("Amount")(Amount.get.asInstanceOf[js.Any])
    if (BreachAction != null) __obj.updateDynamic("BreachAction")(BreachAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyUsageLimitMessage]
  }
}

