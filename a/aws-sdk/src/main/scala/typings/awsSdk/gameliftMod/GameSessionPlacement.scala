package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameSessionPlacement extends StObject {
  
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
  implicit class GameSessionPlacementMutableBuilder[Self <: GameSessionPlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsName(value: DnsName): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setGameProperties(value: GamePropertyList): Self = StObject.set(x, "GameProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamePropertiesUndefined: Self = StObject.set(x, "GameProperties", js.undefined)
    
    @scala.inline
    def setGamePropertiesVarargs(value: GameProperty*): Self = StObject.set(x, "GameProperties", js.Array(value :_*))
    
    @scala.inline
    def setGameSessionArn(value: NonZeroAndMaxString): Self = StObject.set(x, "GameSessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionArnUndefined: Self = StObject.set(x, "GameSessionArn", js.undefined)
    
    @scala.inline
    def setGameSessionData(value: GameSessionData): Self = StObject.set(x, "GameSessionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionDataUndefined: Self = StObject.set(x, "GameSessionData", js.undefined)
    
    @scala.inline
    def setGameSessionId(value: NonZeroAndMaxString): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionIdUndefined: Self = StObject.set(x, "GameSessionId", js.undefined)
    
    @scala.inline
    def setGameSessionName(value: NonZeroAndMaxString): Self = StObject.set(x, "GameSessionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionNameUndefined: Self = StObject.set(x, "GameSessionName", js.undefined)
    
    @scala.inline
    def setGameSessionQueueName(value: GameSessionQueueName): Self = StObject.set(x, "GameSessionQueueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionQueueNameUndefined: Self = StObject.set(x, "GameSessionQueueName", js.undefined)
    
    @scala.inline
    def setGameSessionRegion(value: NonZeroAndMaxString): Self = StObject.set(x, "GameSessionRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionRegionUndefined: Self = StObject.set(x, "GameSessionRegion", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    @scala.inline
    def setMatchmakerData(value: MatchmakerData): Self = StObject.set(x, "MatchmakerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchmakerDataUndefined: Self = StObject.set(x, "MatchmakerData", js.undefined)
    
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPlayerSessionCountUndefined: Self = StObject.set(x, "MaximumPlayerSessionCount", js.undefined)
    
    @scala.inline
    def setPlacedPlayerSessions(value: PlacedPlayerSessionList): Self = StObject.set(x, "PlacedPlayerSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacedPlayerSessionsUndefined: Self = StObject.set(x, "PlacedPlayerSessions", js.undefined)
    
    @scala.inline
    def setPlacedPlayerSessionsVarargs(value: PlacedPlayerSession*): Self = StObject.set(x, "PlacedPlayerSessions", js.Array(value :_*))
    
    @scala.inline
    def setPlacementId(value: IdStringModel): Self = StObject.set(x, "PlacementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementIdUndefined: Self = StObject.set(x, "PlacementId", js.undefined)
    
    @scala.inline
    def setPlayerLatencies(value: PlayerLatencyList): Self = StObject.set(x, "PlayerLatencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerLatenciesUndefined: Self = StObject.set(x, "PlayerLatencies", js.undefined)
    
    @scala.inline
    def setPlayerLatenciesVarargs(value: PlayerLatency*): Self = StObject.set(x, "PlayerLatencies", js.Array(value :_*))
    
    @scala.inline
    def setPort(value: PortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: GameSessionPlacementState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
