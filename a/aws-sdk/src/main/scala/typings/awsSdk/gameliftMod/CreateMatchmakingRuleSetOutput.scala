package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMatchmakingRuleSetOutput extends js.Object {
  /**
    * The newly created matchmaking rule set.
    */
  var RuleSet: MatchmakingRuleSet = js.native
}

object CreateMatchmakingRuleSetOutput {
  @scala.inline
  def apply(RuleSet: MatchmakingRuleSet): CreateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal(RuleSet = RuleSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMatchmakingRuleSetOutput]
  }
  @scala.inline
  implicit class CreateMatchmakingRuleSetOutputOps[Self <: CreateMatchmakingRuleSetOutput] (val x: Self) extends AnyVal {
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
    def setRuleSet(value: MatchmakingRuleSet): Self = this.set("RuleSet", value.asInstanceOf[js.Any])
  }
  
}

