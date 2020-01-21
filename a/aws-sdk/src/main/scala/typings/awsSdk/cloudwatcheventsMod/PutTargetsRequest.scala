package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTargetsRequest extends js.Object {
  /**
    * The name of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * The name of the rule.
    */
  var Rule: RuleName = js.native
  /**
    * The targets to update or add to the rule.
    */
  var Targets: TargetList = js.native
}

object PutTargetsRequest {
  @scala.inline
  def apply(Rule: RuleName, Targets: TargetList, EventBusName: EventBusName = null): PutTargetsRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTargetsRequest]
  }
}

