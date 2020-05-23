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
  def apply(
    ConfigurationArn: MatchmakingConfigurationArn = null,
    ConfigurationName: MatchmakingIdStringModel = null,
    EndTime: Timestamp = null,
    EstimatedWaitTime: js.UndefOr[WholeNumber] = js.undefined,
    GameSessionConnectionInfo: GameSessionConnectionInfo = null,
    Players: PlayerList = null,
    StartTime: Timestamp = null,
    Status: MatchmakingConfigurationStatus = null,
    StatusMessage: StringModel = null,
    StatusReason: StringModel = null,
    TicketId: MatchmakingIdStringModel = null
  ): MatchmakingTicket = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationArn != null) __obj.updateDynamic("ConfigurationArn")(ConfigurationArn.asInstanceOf[js.Any])
    if (ConfigurationName != null) __obj.updateDynamic("ConfigurationName")(ConfigurationName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (!js.isUndefined(EstimatedWaitTime)) __obj.updateDynamic("EstimatedWaitTime")(EstimatedWaitTime.get.asInstanceOf[js.Any])
    if (GameSessionConnectionInfo != null) __obj.updateDynamic("GameSessionConnectionInfo")(GameSessionConnectionInfo.asInstanceOf[js.Any])
    if (Players != null) __obj.updateDynamic("Players")(Players.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    if (TicketId != null) __obj.updateDynamic("TicketId")(TicketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchmakingTicket]
  }
}

