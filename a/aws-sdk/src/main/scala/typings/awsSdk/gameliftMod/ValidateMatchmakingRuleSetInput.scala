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
}

