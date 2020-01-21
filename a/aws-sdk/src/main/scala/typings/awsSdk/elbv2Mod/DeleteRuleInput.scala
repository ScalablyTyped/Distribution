package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRuleInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: typings.awsSdk.elbv2Mod.RuleArn = js.native
}

object DeleteRuleInput {
  @scala.inline
  def apply(RuleArn: RuleArn): DeleteRuleInput = {
    val __obj = js.Dynamic.literal(RuleArn = RuleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRuleInput]
  }
}

