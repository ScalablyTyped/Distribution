package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameSession extends js.Object {
  
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that limits the number of game sessions a player can create.
    */
  var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Number of players currently in the game session.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  
  /**
    * DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typings.awsSdk.gameliftMod.DnsName] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet that this game session is running on. 
    */
  var FleetArn: js.UndefOr[typings.awsSdk.gameliftMod.FleetArn] = js.native
  
  /**
    * A unique identifier for a fleet that the game session is running on.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). You can search for active game sessions based on this custom data with SearchGameSessions.
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionData] = js.native
  
  /**
    * A unique identifier for the game session. A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * IP address of the instance that is running the game session. When connecting to a Amazon GameLift game server, a client needs to reference an IP address (or DNS name) and port number.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.gameliftMod.IpAddress] = js.native
  
  /**
    * Information about the matchmaking process that was used to create the game session. It is in JSON syntax, formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are added during a successful backfill (see StartMatchBackfill). 
    */
  var MatchmakerData: js.UndefOr[typings.awsSdk.gameliftMod.MatchmakerData] = js.native
  
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Indicates whether or not the game session is accepting new players.
    */
  var PlayerSessionCreationPolicy: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSessionCreationPolicy] = js.native
  
  /**
    * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PortNumber] = js.native
  
  /**
    * Current status of the game session. A game session must have an ACTIVE status to have player sessions.
    */
  var Status: js.UndefOr[GameSessionStatus] = js.native
  
  /**
    * Provides additional information about game session status. INTERRUPTED indicates that the game session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
    */
  var StatusReason: js.UndefOr[GameSessionStatusReason] = js.native
  
  /**
    * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[Timestamp] = js.native
}
object GameSession {
  
  @scala.inline
  def apply(): GameSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSession]
  }
  
  @scala.inline
  implicit class GameSessionOps[Self <: GameSession] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setCreatorId(value: NonZeroAndMaxString): Self = this.set("CreatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorId: Self = this.set("CreatorId", js.undefined)
    
    @scala.inline
    def setCurrentPlayerSessionCount(value: WholeNumber): Self = this.set("CurrentPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPlayerSessionCount: Self = this.set("CurrentPlayerSessionCount", js.undefined)
    
    @scala.inline
    def setDnsName(value: DnsName): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetArn: Self = this.set("FleetArn", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
    @scala.inline
    def setGamePropertiesVarargs(value: GameProperty*): Self = this.set("GameProperties", js.Array(value :_*))
    
    @scala.inline
    def setGameProperties(value: GamePropertyList): Self = this.set("GameProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameProperties: Self = this.set("GameProperties", js.undefined)
    
    @scala.inline
    def setGameSessionData(value: GameSessionData): Self = this.set("GameSessionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionData: Self = this.set("GameSessionData", js.undefined)
    
    @scala.inline
    def setGameSessionId(value: NonZeroAndMaxString): Self = this.set("GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionId: Self = this.set("GameSessionId", js.undefined)
    
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
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPlayerSessionCreationPolicy(value: PlayerSessionCreationPolicy): Self = this.set("PlayerSessionCreationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerSessionCreationPolicy: Self = this.set("PlayerSessionCreationPolicy", js.undefined)
    
    @scala.inline
    def setPort(value: PortNumber): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setStatus(value: GameSessionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: GameSessionStatusReason): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
    
    @scala.inline
    def setTerminationTime(value: Timestamp): Self = this.set("TerminationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationTime: Self = this.set("TerminationTime", js.undefined)
  }
}
