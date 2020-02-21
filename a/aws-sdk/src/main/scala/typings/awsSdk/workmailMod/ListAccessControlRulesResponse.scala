package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessControlRulesResponse extends js.Object {
  /**
    * The access control rules.
    */
  var Rules: js.UndefOr[AccessControlRulesList] = js.native
}

object ListAccessControlRulesResponse {
  @scala.inline
  def apply(Rules: AccessControlRulesList = null): ListAccessControlRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessControlRulesResponse]
  }
}

