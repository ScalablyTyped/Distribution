package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var FleetArn: js.UndefOr[ArnStringModel] = js.native
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
  def apply(
    CreationTime: Timestamp = null,
    CreatorId: NonZeroAndMaxString = null,
    CurrentPlayerSessionCount: Int | scala.Double = null,
    DnsName: DnsName = null,
    FleetArn: ArnStringModel = null,
    FleetId: FleetId = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    GameSessionId: NonZeroAndMaxString = null,
    IpAddress: IpAddress = null,
    MatchmakerData: MatchmakerData = null,
    MaximumPlayerSessionCount: Int | scala.Double = null,
    Name: NonZeroAndMaxString = null,
    PlayerSessionCreationPolicy: PlayerSessionCreationPolicy = null,
    Port: Int | scala.Double = null,
    Status: GameSessionStatus = null,
    StatusReason: GameSessionStatusReason = null,
    TerminationTime: Timestamp = null
  ): GameSession = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId.asInstanceOf[js.Any])
    if (CurrentPlayerSessionCount != null) __obj.updateDynamic("CurrentPlayerSessionCount")(CurrentPlayerSessionCount.asInstanceOf[js.Any])
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName.asInstanceOf[js.Any])
    if (FleetArn != null) __obj.updateDynamic("FleetArn")(FleetArn.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties.asInstanceOf[js.Any])
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData.asInstanceOf[js.Any])
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (MatchmakerData != null) __obj.updateDynamic("MatchmakerData")(MatchmakerData.asInstanceOf[js.Any])
    if (MaximumPlayerSessionCount != null) __obj.updateDynamic("MaximumPlayerSessionCount")(MaximumPlayerSessionCount.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PlayerSessionCreationPolicy != null) __obj.updateDynamic("PlayerSessionCreationPolicy")(PlayerSessionCreationPolicy.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    if (TerminationTime != null) __obj.updateDynamic("TerminationTime")(TerminationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSession]
  }
}

