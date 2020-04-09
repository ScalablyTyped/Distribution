package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameServer extends js.Object {
  /**
    * Indicates when an available game server has been reserved but has not yet started hosting a game. Once it is claimed, game server remains in CLAIMED status for a maximum of one minute. During this time, game clients must connect to the game server and start the game, which triggers the game server to update its utilization status. After one minute, the game server claim status reverts to null.
    */
  var ClaimStatus: js.UndefOr[GameServerClaimStatus] = js.native
  /**
    * The port and IP address that must be used to establish a client connection to the game server.
    */
  var ConnectionInfo: js.UndefOr[GameServerConnectionInfo] = js.native
  /**
    * A game server tag that can be used to request sorted lists of game servers when calling ListGameServers. Custom sort keys are developer-defined. This property can be updated using UpdateGameServer.
    */
  var CustomSortKey: js.UndefOr[GameServerSortKey] = js.native
  /**
    * A set of custom game server properties, formatted as a single string value. This data is passed to a game client or service in response to requests ListGameServers or ClaimGameServer. This property can be updated using UpdateGameServer.
    */
  var GameServerData: js.UndefOr[typings.awsSdk.gameliftMod.GameServerData] = js.native
  /**
    * The ARN identifier for the game server group where the game server is located.
    */
  var GameServerGroupArn: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupArn] = js.native
  /**
    * The name identifier for the game server group where the game server is located.
    */
  var GameServerGroupName: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupName] = js.native
  /**
    * A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are unique across all game server groups in an AWS account.
    */
  var GameServerId: js.UndefOr[typings.awsSdk.gameliftMod.GameServerId] = js.native
  /**
    * The unique identifier for the instance where the game server is located.
    */
  var InstanceId: js.UndefOr[GameServerInstanceId] = js.native
  /**
    * Time stamp indicating the last time the game server was claimed with a ClaimGameServer request. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057"). This value is used to calculate when the game server's claim status.
    */
  var LastClaimTime: js.UndefOr[Timestamp] = js.native
  /**
    * Time stamp indicating the last time the game server was updated with health status using an UpdateGameServer request. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057"). After game server registration, this property is only changed when a game server update specifies a health check value.
    */
  var LastHealthCheckTime: js.UndefOr[Timestamp] = js.native
  /**
    * Time stamp indicating when the game server resource was created with a RegisterGameServer request. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var RegistrationTime: js.UndefOr[Timestamp] = js.native
  /**
    * Indicates whether the game server is currently available for new games or is busy. Possible statuses include:   AVAILABLE - The game server is available to be claimed. A game server that has been claimed remains in this status until it reports game hosting activity.    IN_USE - The game server is currently hosting a game session with players.   
    */
  var UtilizationStatus: js.UndefOr[GameServerUtilizationStatus] = js.native
}

object GameServer {
  @scala.inline
  def apply(
    ClaimStatus: GameServerClaimStatus = null,
    ConnectionInfo: GameServerConnectionInfo = null,
    CustomSortKey: GameServerSortKey = null,
    GameServerData: GameServerData = null,
    GameServerGroupArn: GameServerGroupArn = null,
    GameServerGroupName: GameServerGroupName = null,
    GameServerId: GameServerId = null,
    InstanceId: GameServerInstanceId = null,
    LastClaimTime: Timestamp = null,
    LastHealthCheckTime: Timestamp = null,
    RegistrationTime: Timestamp = null,
    UtilizationStatus: GameServerUtilizationStatus = null
  ): GameServer = {
    val __obj = js.Dynamic.literal()
    if (ClaimStatus != null) __obj.updateDynamic("ClaimStatus")(ClaimStatus.asInstanceOf[js.Any])
    if (ConnectionInfo != null) __obj.updateDynamic("ConnectionInfo")(ConnectionInfo.asInstanceOf[js.Any])
    if (CustomSortKey != null) __obj.updateDynamic("CustomSortKey")(CustomSortKey.asInstanceOf[js.Any])
    if (GameServerData != null) __obj.updateDynamic("GameServerData")(GameServerData.asInstanceOf[js.Any])
    if (GameServerGroupArn != null) __obj.updateDynamic("GameServerGroupArn")(GameServerGroupArn.asInstanceOf[js.Any])
    if (GameServerGroupName != null) __obj.updateDynamic("GameServerGroupName")(GameServerGroupName.asInstanceOf[js.Any])
    if (GameServerId != null) __obj.updateDynamic("GameServerId")(GameServerId.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (LastClaimTime != null) __obj.updateDynamic("LastClaimTime")(LastClaimTime.asInstanceOf[js.Any])
    if (LastHealthCheckTime != null) __obj.updateDynamic("LastHealthCheckTime")(LastHealthCheckTime.asInstanceOf[js.Any])
    if (RegistrationTime != null) __obj.updateDynamic("RegistrationTime")(RegistrationTime.asInstanceOf[js.Any])
    if (UtilizationStatus != null) __obj.updateDynamic("UtilizationStatus")(UtilizationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameServer]
  }
}

