package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRuleNamesByTargetResponse extends js.Object {
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  /**
    * The names of the rules that can invoke the given target.
    */
  var RuleNames: js.UndefOr[RuleNameList] = js.native
}

object ListRuleNamesByTargetResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RuleNames: RuleNameList = null): ListRuleNamesByTargetResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RuleNames != null) __obj.updateDynamic("RuleNames")(RuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRuleNamesByTargetResponse]
  }
}

