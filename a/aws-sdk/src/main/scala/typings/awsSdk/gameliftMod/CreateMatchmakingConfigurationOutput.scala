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
  def apply(): CreateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMatchmakingConfigurationOutput]
  }
  @scala.inline
  implicit class CreateMatchmakingConfigurationOutputOps[Self <: CreateMatchmakingConfigurationOutput] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: MatchmakingConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
  }
  
}

