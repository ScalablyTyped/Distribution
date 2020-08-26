package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateMatchmakingRuleSetOutput extends js.Object {
  /**
    * A response indicating whether the rule set is valid.
    */
  var Valid: js.UndefOr[BooleanModel] = js.native
}

object ValidateMatchmakingRuleSetOutput {
  @scala.inline
  def apply(): ValidateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMatchmakingRuleSetOutput]
  }
  @scala.inline
  implicit class ValidateMatchmakingRuleSetOutputOps[Self <: ValidateMatchmakingRuleSetOutput] (val x: Self) extends AnyVal {
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
    def setValid(value: BooleanModel): Self = this.set("Valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("Valid", js.undefined)
  }
  
}

