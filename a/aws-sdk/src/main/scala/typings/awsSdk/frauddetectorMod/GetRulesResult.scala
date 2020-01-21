package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRulesResult extends js.Object {
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The details of the requested rule.
    */
  var ruleDetails: js.UndefOr[RuleDetailList] = js.native
}

object GetRulesResult {
  @scala.inline
  def apply(nextToken: String = null, ruleDetails: RuleDetailList = null): GetRulesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (ruleDetails != null) __obj.updateDynamic("ruleDetails")(ruleDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRulesResult]
  }
}

