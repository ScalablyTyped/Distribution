package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveTargetsRequest extends js.Object {
  /**
    * The name of the event bus associated with the rule.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.eventbridgeMod.EventBusName] = js.native
  /**
    * If this is a managed rule, created by an AWS service on your behalf, you must specify Force as True to remove targets. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the targets to remove from the rule.
    */
  var Ids: TargetIdList = js.native
  /**
    * The name of the rule.
    */
  var Rule: RuleName = js.native
}

object RemoveTargetsRequest {
  @scala.inline
  def apply(
    Ids: TargetIdList,
    Rule: RuleName,
    EventBusName: EventBusName = null,
    Force: js.UndefOr[scala.Boolean] = js.undefined
  ): RemoveTargetsRequest = {
    val __obj = js.Dynamic.literal(Ids = Ids.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTargetsRequest]
  }
}

