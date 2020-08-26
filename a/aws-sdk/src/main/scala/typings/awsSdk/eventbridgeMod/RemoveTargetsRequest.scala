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
  def apply(Ids: TargetIdList, Rule: RuleName): RemoveTargetsRequest = {
    val __obj = js.Dynamic.literal(Ids = Ids.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTargetsRequest]
  }
  @scala.inline
  implicit class RemoveTargetsRequestOps[Self <: RemoveTargetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdsVarargs(value: TargetId*): Self = this.set("Ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: TargetIdList): Self = this.set("Ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: RuleName): Self = this.set("Rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventBusName(value: EventBusName): Self = this.set("EventBusName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventBusName: Self = this.set("EventBusName", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("Force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("Force", js.undefined)
  }
  
}

