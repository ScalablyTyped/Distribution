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
  def apply(): GameServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServer]
  }
  @scala.inline
  implicit class GameServerOps[Self <: GameServer] (val x: Self) extends AnyVal {
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
    def setClaimStatus(value: GameServerClaimStatus): Self = this.set("ClaimStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaimStatus: Self = this.set("ClaimStatus", js.undefined)
    @scala.inline
    def setConnectionInfo(value: GameServerConnectionInfo): Self = this.set("ConnectionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionInfo: Self = this.set("ConnectionInfo", js.undefined)
    @scala.inline
    def setCustomSortKey(value: GameServerSortKey): Self = this.set("CustomSortKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSortKey: Self = this.set("CustomSortKey", js.undefined)
    @scala.inline
    def setGameServerData(value: GameServerData): Self = this.set("GameServerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameServerData: Self = this.set("GameServerData", js.undefined)
    @scala.inline
    def setGameServerGroupArn(value: GameServerGroupArn): Self = this.set("GameServerGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameServerGroupArn: Self = this.set("GameServerGroupArn", js.undefined)
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupName): Self = this.set("GameServerGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameServerGroupName: Self = this.set("GameServerGroupName", js.undefined)
    @scala.inline
    def setGameServerId(value: GameServerId): Self = this.set("GameServerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameServerId: Self = this.set("GameServerId", js.undefined)
    @scala.inline
    def setInstanceId(value: GameServerInstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setLastClaimTime(value: Timestamp): Self = this.set("LastClaimTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastClaimTime: Self = this.set("LastClaimTime", js.undefined)
    @scala.inline
    def setLastHealthCheckTime(value: Timestamp): Self = this.set("LastHealthCheckTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastHealthCheckTime: Self = this.set("LastHealthCheckTime", js.undefined)
    @scala.inline
    def setRegistrationTime(value: Timestamp): Self = this.set("RegistrationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationTime: Self = this.set("RegistrationTime", js.undefined)
    @scala.inline
    def setUtilizationStatus(value: GameServerUtilizationStatus): Self = this.set("UtilizationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilizationStatus: Self = this.set("UtilizationStatus", js.undefined)
  }
  
}

