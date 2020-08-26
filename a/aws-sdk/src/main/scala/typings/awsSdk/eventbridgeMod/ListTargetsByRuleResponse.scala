package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsByRuleResponse extends js.Object {
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  /**
    * The targets assigned to the rule.
    */
  var Targets: js.UndefOr[TargetList] = js.native
}

object ListTargetsByRuleResponse {
  @scala.inline
  def apply(): ListTargetsByRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsByRuleResponse]
  }
  @scala.inline
  implicit class ListTargetsByRuleResponseOps[Self <: ListTargetsByRuleResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: TargetList): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
  
}

