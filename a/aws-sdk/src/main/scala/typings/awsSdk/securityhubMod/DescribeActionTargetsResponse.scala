package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActionTargetsResponse extends js.Object {
  /**
    * A list of ActionTarget objects. Each object includes the ActionTargetArn, Description, and Name of a custom action target available in Security Hub.
    */
  var ActionTargets: ActionTargetList = js.native
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object DescribeActionTargetsResponse {
  @scala.inline
  def apply(ActionTargets: ActionTargetList): DescribeActionTargetsResponse = {
    val __obj = js.Dynamic.literal(ActionTargets = ActionTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActionTargetsResponse]
  }
  @scala.inline
  implicit class DescribeActionTargetsResponseOps[Self <: DescribeActionTargetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionTargetsVarargs(value: ActionTarget*): Self = this.set("ActionTargets", js.Array(value :_*))
    @scala.inline
    def setActionTargets(value: ActionTargetList): Self = this.set("ActionTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

