package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMatchmakingInput extends js.Object {
  /**
    * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same Region as this request. You can use either the configuration name or ARN value.
    */
  var ConfigurationName: MatchmakingConfigurationName = js.native
  /**
    * Information on each player to be matched. This information must include a player ID, and may contain player attributes and latency data to be used in the matchmaking process. After a successful match, Player objects contain the name of the team the player is assigned to.
    */
  var Players: PlayerList = js.native
  /**
    * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object StartMatchmakingInput {
  @scala.inline
  def apply(ConfigurationName: MatchmakingConfigurationName, Players: PlayerList): StartMatchmakingInput = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any], Players = Players.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMatchmakingInput]
  }
  @scala.inline
  implicit class StartMatchmakingInputOps[Self <: StartMatchmakingInput] (val x: Self) extends AnyVal {
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
    def setConfigurationName(value: MatchmakingConfigurationName): Self = this.set("ConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayersVarargs(value: Player*): Self = this.set("Players", js.Array(value :_*))
    @scala.inline
    def setPlayers(value: PlayerList): Self = this.set("Players", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicketId(value: MatchmakingIdStringModel): Self = this.set("TicketId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicketId: Self = this.set("TicketId", js.undefined)
  }
  
}

