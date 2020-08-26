package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchmakingTicket extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated with the GameLift matchmaking configuration resource that is used with this ticket.
    */
  var ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn] = js.native
  /**
    * Name of the MatchmakingConfiguration that is used with this ticket. Matchmaking configurations determine how players are grouped into a match and how a new game session is created for the match.
    */
  var ConfigurationName: js.UndefOr[MatchmakingIdStringModel] = js.native
  /**
    * Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough recent data, this property may be empty.
    */
  var EstimatedWaitTime: js.UndefOr[WholeNumber] = js.native
  /**
    * Identifier and connection information of the game session created for the match. This information is added to the ticket only after the matchmaking request has been successfully completed.
    */
  var GameSessionConnectionInfo: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionConnectionInfo] = js.native
  /**
    * A set of Player objects, each representing a player to find matches for. Players are identified by a unique player ID and may include latency data for use during matchmaking. If the ticket is in status COMPLETED, the Player objects include the team the players were assigned to in the resulting match.
    */
  var Players: js.UndefOr[PlayerList] = js.native
  /**
    * Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * Current status of the matchmaking request.    QUEUED -- The matchmaking request has been received and is currently waiting to be processed.    SEARCHING -- The matchmaking request is currently being processed.     REQUIRES_ACCEPTANCE -- A match has been proposed and the players must accept the match (see AcceptMatch). This status is used only with requests that use a matchmaking configuration with a player acceptance requirement.    PLACING -- The FlexMatch engine has matched players and is in the process of placing a new game session for the match.    COMPLETED -- Players have been matched and a game session is ready to host the players. A ticket in this state contains the necessary connection information for players.    FAILED -- The matchmaking request was not completed.    CANCELLED -- The matchmaking request was canceled. This may be the result of a call to StopMatchmaking or a proposed match that one or more players failed to accept.    TIMED_OUT -- The matchmaking request was not successful within the duration specified in the matchmaking configuration.     Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be resubmitted as new requests with new ticket IDs. 
    */
  var Status: js.UndefOr[MatchmakingConfigurationStatus] = js.native
  /**
    * Additional information about the current status.
    */
  var StatusMessage: js.UndefOr[StringModel] = js.native
  /**
    * Code to explain the current status. For example, a status reason may indicate when a ticket has returned to SEARCHING status after a proposed match fails to receive player acceptances.
    */
  var StatusReason: js.UndefOr[StringModel] = js.native
  /**
    * A unique identifier for a matchmaking ticket.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object MatchmakingTicket {
  @scala.inline
  def apply(): MatchmakingTicket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchmakingTicket]
  }
  @scala.inline
  implicit class MatchmakingTicketOps[Self <: MatchmakingTicket] (val x: Self) extends AnyVal {
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
    def setConfigurationArn(value: MatchmakingConfigurationArn): Self = this.set("ConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationArn: Self = this.set("ConfigurationArn", js.undefined)
    @scala.inline
    def setConfigurationName(value: MatchmakingIdStringModel): Self = this.set("ConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationName: Self = this.set("ConfigurationName", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setEstimatedWaitTime(value: WholeNumber): Self = this.set("EstimatedWaitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedWaitTime: Self = this.set("EstimatedWaitTime", js.undefined)
    @scala.inline
    def setGameSessionConnectionInfo(value: GameSessionConnectionInfo): Self = this.set("GameSessionConnectionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionConnectionInfo: Self = this.set("GameSessionConnectionInfo", js.undefined)
    @scala.inline
    def setPlayersVarargs(value: Player*): Self = this.set("Players", js.Array(value :_*))
    @scala.inline
    def setPlayers(value: PlayerList): Self = this.set("Players", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayers: Self = this.set("Players", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: MatchmakingConfigurationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusMessage(value: StringModel): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setStatusReason(value: StringModel): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
    @scala.inline
    def setTicketId(value: MatchmakingIdStringModel): Self = this.set("TicketId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicketId: Self = this.set("TicketId", js.undefined)
  }
  
}

