package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebACLUpdate extends js.Object {
  /**
    * Specifies whether to insert a Rule into or delete a Rule from a WebACL.
    */
  var Action: ChangeAction = js.native
  /**
    * The ActivatedRule object in an UpdateWebACL request specifies a Rule that you want to insert or delete, the priority of the Rule in the WebACL, and the action that you want AWS WAF to take when a web request matches the Rule (ALLOW, BLOCK, or COUNT).
    */
  var ActivatedRule: typings.awsSdk.wafregionalMod.ActivatedRule = js.native
}

object WebACLUpdate {
  @scala.inline
  def apply(Action: ChangeAction, ActivatedRule: ActivatedRule): WebACLUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ActivatedRule = ActivatedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACLUpdate]
  }
}

