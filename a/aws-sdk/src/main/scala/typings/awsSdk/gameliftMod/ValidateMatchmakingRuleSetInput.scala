package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateMatchmakingRuleSetInput extends js.Object {
  /**
    * A collection of matchmaking rules to validate, formatted as a JSON string.
    */
  var RuleSetBody: typings.awsSdk.gameliftMod.RuleSetBody = js.native
}

object ValidateMatchmakingRuleSetInput {
  @scala.inline
  def apply(RuleSetBody: RuleSetBody): ValidateMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(RuleSetBody = RuleSetBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateMatchmakingRuleSetInput]
  }
  @scala.inline
  implicit class ValidateMatchmakingRuleSetInputOps[Self <: ValidateMatchmakingRuleSetInput] (val x: Self) extends AnyVal {
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
    def setRuleSetBody(value: RuleSetBody): Self = this.set("RuleSetBody", value.asInstanceOf[js.Any])
  }
  
}

