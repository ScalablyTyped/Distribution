package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMatchmakingRuleSetInput extends js.Object {
  /**
    * A unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the optional "name" field in the rule set body.) You can use either the rule set name or ARN value.
    */
  var Name: MatchmakingRuleSetName = js.native
}

object DeleteMatchmakingRuleSetInput {
  @scala.inline
  def apply(Name: MatchmakingRuleSetName): DeleteMatchmakingRuleSetInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMatchmakingRuleSetInput]
  }
}

