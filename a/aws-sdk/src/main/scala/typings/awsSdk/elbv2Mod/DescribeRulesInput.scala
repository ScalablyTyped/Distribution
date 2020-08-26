package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRulesInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[typings.awsSdk.elbv2Mod.ListenerArn] = js.native
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsSdk.elbv2Mod.Marker] = js.native
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.elbv2Mod.PageSize] = js.native
  /**
    * The Amazon Resource Names (ARN) of the rules.
    */
  var RuleArns: js.UndefOr[typings.awsSdk.elbv2Mod.RuleArns] = js.native
}

object DescribeRulesInput {
  @scala.inline
  def apply(): DescribeRulesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRulesInput]
  }
  @scala.inline
  implicit class DescribeRulesInputOps[Self <: DescribeRulesInput] (val x: Self) extends AnyVal {
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
    def setListenerArn(value: ListenerArn): Self = this.set("ListenerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListenerArn: Self = this.set("ListenerArn", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    @scala.inline
    def setRuleArnsVarargs(value: RuleArn*): Self = this.set("RuleArns", js.Array(value :_*))
    @scala.inline
    def setRuleArns(value: RuleArns): Self = this.set("RuleArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleArns: Self = this.set("RuleArns", js.undefined)
  }
  
}

