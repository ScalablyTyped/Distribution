package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMatchmakingConfigurationOutput extends js.Object {
  /**
    * The updated matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.native
}

object UpdateMatchmakingConfigurationOutput {
  @scala.inline
  def apply(Configuration: MatchmakingConfiguration = null): UpdateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMatchmakingConfigurationOutput]
  }
}

