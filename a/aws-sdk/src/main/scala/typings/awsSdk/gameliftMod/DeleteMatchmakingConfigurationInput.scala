package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMatchmakingConfigurationInput extends js.Object {
  /**
    * A unique identifier for a matchmaking configuration. You can use either the configuration name or ARN value.
    */
  var Name: MatchmakingConfigurationName = js.native
}

object DeleteMatchmakingConfigurationInput {
  @scala.inline
  def apply(Name: MatchmakingConfigurationName): DeleteMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMatchmakingConfigurationInput]
  }
}

