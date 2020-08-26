package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventBusName] = js.native
  /**
    * If this is a managed rule, created by an AWS service on your behalf, you must specify Force as True to delete the rule. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The name of the rule.
    */
  var Name: RuleName = js.native
}

object DeleteRuleRequest {
  @scala.inline
  def apply(Name: RuleName): DeleteRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleRequest]
  }
  @scala.inline
  implicit class DeleteRuleRequestOps[Self <: DeleteRuleRequest] (val x: Self) extends AnyVal {
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
    def setName(value: RuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
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

