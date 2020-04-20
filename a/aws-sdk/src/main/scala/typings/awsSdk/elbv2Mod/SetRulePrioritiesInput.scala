package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRulePrioritiesInput extends js.Object {
  /**
    * The rule priorities.
    */
  var RulePriorities: RulePriorityList = js.native
}

object SetRulePrioritiesInput {
  @scala.inline
  def apply(RulePriorities: RulePriorityList): SetRulePrioritiesInput = {
    val __obj = js.Dynamic.literal(RulePriorities = RulePriorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRulePrioritiesInput]
  }
}

