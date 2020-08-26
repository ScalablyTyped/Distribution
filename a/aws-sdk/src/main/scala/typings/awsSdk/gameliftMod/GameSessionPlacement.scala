package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionPlacement extends js.Object {
  /**
    * DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typings.awsSdk.gameliftMod.DnsName] = js.native
  /**
    * Time stamp indicating when this request was completed, canceled, or timed out.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  /**
    * Identifier for the game session created by this placement request. This value is set once the new game session is placed (placement status is FULFILLED). This identifier is unique across all Regions. You can use this value as a GameSessionId value as needed.
    */
  var GameSessionArn: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.native
  /**
    * A unique identifier for the game session. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
    */
  var GameSessionQueueName: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionQueueName] = js.native
  /**
    * Name of the Region where the game session created by this placement request is running. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var GameSessionRegion: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * IP address of the instance that is running the game session. When connecting to a Amazon GameLift game server, a client needs to reference an IP address (or DNS name) and port number. This value is set once the new game session is placed (placement status is FULFILLED). 
    */
  var IpAddress: js.UndefOr[typings.awsSdk.gameliftMod.IpAddress] = js.native
  /**
    * Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It identifies the matchmaking configuration used to create the match, and contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data.
    */
  var MatchmakerData: js.UndefOr[typings.awsSdk.gameliftMod.MatchmakerData] = js.native
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A collection of information on player sessions created in response to the game session placement request. These player sessions are created only once a new game session is successfully placed (placement status is FULFILLED). This information includes the player ID (as provided in the placement request) and the corresponding player session ID. Retrieve full player sessions by calling DescribePlayerSessions with the player session ID.
    */
  var PlacedPlayerSessions: js.UndefOr[PlacedPlayerSessionList] = js.native
  /**
    * A unique identifier for a game session placement.
    */
  var PlacementId: js.UndefOr[IdStringModel] = js.native
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS Regions.
    */
  var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.native
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number. This value is set once the new game session is placed (placement status is FULFILLED).
    */
  var Port: js.UndefOr[PortNumber] = js.native
  /**
    * Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * Current status of the game session placement request.    PENDING -- The placement request is currently in the queue waiting to be processed.    FULFILLED -- A new game session and player sessions (if requested) have been successfully created. Values for GameSessionArn and GameSessionRegion are available.     CANCELLED -- The placement request was canceled with a call to StopGameSessionPlacement.    TIMED_OUT -- A new game session was not successfully created before the time limit expired. You can resubmit the placement request as needed.    FAILED -- GameLift is not able to complete the process of placing the game session. Common reasons are the game session terminated before the placement process was completed, or an unexpected internal error.  
    */
  var Status: js.UndefOr[GameSessionPlacementState] = js.native
}

object GameSessionPlacement {
  @scala.inline
  def apply(): GameSessionPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionPlacement]
  }
  @scala.inline
  implicit class GameSessionPlacementOps[Self <: GameSessionPlacement] (val x: Self) extends AnyVal {
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
    def setDnsName(value: DnsName): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setGamePropertiesVarargs(value: GameProperty*): Self = this.set("GameProperties", js.Array(value :_*))
    @scala.inline
    def setGameProperties(value: GamePropertyList): Self = this.set("GameProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameProperties: Self = this.set("GameProperties", js.undefined)
    @scala.inline
    def setGameSessionArn(value: NonZeroAndMaxString): Self = this.set("GameSessionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionArn: Self = this.set("GameSessionArn", js.undefined)
    @scala.inline
    def setGameSessionData(value: GameSessionData): Self = this.set("GameSessionData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionData: Self = this.set("GameSessionData", js.undefined)
    @scala.inline
    def setGameSessionId(value: NonZeroAndMaxString): Self = this.set("GameSessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionId: Self = this.set("GameSessionId", js.undefined)
    @scala.inline
    def setGameSessionName(value: NonZeroAndMaxString): Self = this.set("GameSessionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionName: Self = this.set("GameSessionName", js.undefined)
    @scala.inline
    def setGameSessionQueueName(value: GameSessionQueueName): Self = this.set("GameSessionQueueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionQueueName: Self = this.set("GameSessionQueueName", js.undefined)
    @scala.inline
    def setGameSessionRegion(value: NonZeroAndMaxString): Self = this.set("GameSessionRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionRegion: Self = this.set("GameSessionRegion", js.undefined)
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    @scala.inline
    def setMatchmakerData(value: MatchmakerData): Self = this.set("MatchmakerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchmakerData: Self = this.set("MatchmakerData", js.undefined)
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = this.set("MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumPlayerSessionCount: Self = this.set("MaximumPlayerSessionCount", js.undefined)
    @scala.inline
    def setPlacedPlayerSessionsVarargs(value: PlacedPlayerSession*): Self = this.set("PlacedPlayerSessions", js.Array(value :_*))
    @scala.inline
    def setPlacedPlayerSessions(value: PlacedPlayerSessionList): Self = this.set("PlacedPlayerSessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacedPlayerSessions: Self = this.set("PlacedPlayerSessions", js.undefined)
    @scala.inline
    def setPlacementId(value: IdStringModel): Self = this.set("PlacementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementId: Self = this.set("PlacementId", js.undefined)
    @scala.inline
    def setPlayerLatenciesVarargs(value: PlayerLatency*): Self = this.set("PlayerLatencies", js.Array(value :_*))
    @scala.inline
    def setPlayerLatencies(value: PlayerLatencyList): Self = this.set("PlayerLatencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerLatencies: Self = this.set("PlayerLatencies", js.undefined)
    @scala.inline
    def setPort(value: PortNumber): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setStatus(value: GameSessionPlacementState): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

