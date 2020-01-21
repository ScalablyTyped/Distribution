package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsByRuleResponse extends js.Object {
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.native
  /**
    * The targets assigned to the rule.
    */
  var Targets: js.UndefOr[TargetList] = js.native
}

object ListTargetsByRuleResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Targets: TargetList = null): ListTargetsByRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsByRuleResponse]
  }
}

