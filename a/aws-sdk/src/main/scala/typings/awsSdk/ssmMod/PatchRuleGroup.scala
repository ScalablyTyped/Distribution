package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchRuleGroup extends js.Object {
  /**
    * The rules that make up the rule group.
    */
  var PatchRules: PatchRuleList = js.native
}

object PatchRuleGroup {
  @scala.inline
  def apply(PatchRules: PatchRuleList): PatchRuleGroup = {
    val __obj = js.Dynamic.literal(PatchRules = PatchRules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchRuleGroup]
  }
}

