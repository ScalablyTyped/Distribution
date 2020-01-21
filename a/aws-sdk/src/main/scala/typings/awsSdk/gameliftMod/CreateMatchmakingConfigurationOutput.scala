package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMatchmakingConfigurationOutput extends js.Object {
  /**
    * Object that describes the newly created matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.native
}

object CreateMatchmakingConfigurationOutput {
  @scala.inline
  def apply(Configuration: MatchmakingConfiguration = null): CreateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMatchmakingConfigurationOutput]
  }
}

