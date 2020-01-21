package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The name of the rule.
    */
  var Name: RuleName = js.native
}

object EnableRuleRequest {
  @scala.inline
  def apply(Name: RuleName, EventBusName: EventBusName = null): EnableRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableRuleRequest]
  }
}

