package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeToken] = js.native
  /**
    * The Rule returned in the CreateRule response.
    */
  var Rule: js.UndefOr[typings.awsSdk.wafregionalMod.Rule] = js.native
}

object CreateRuleResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, Rule: Rule = null): CreateRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    if (Rule != null) __obj.updateDynamic("Rule")(Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleResponse]
  }
}

