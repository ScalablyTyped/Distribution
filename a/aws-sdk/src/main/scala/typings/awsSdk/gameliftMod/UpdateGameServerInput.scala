package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameServerInput extends js.Object {
  /**
    * A game server tag that can be used to request sorted lists of game servers using ListGameServers. Custom sort keys are developer-defined based on how you want to organize the retrieved game server information.
    */
  var CustomSortKey: js.UndefOr[GameServerSortKey] = js.native
  /**
    * A set of custom game server properties, formatted as a single string value. This data is passed to a game client or service when it requests information on a game servers using DescribeGameServer or ClaimGameServer. 
    */
  var GameServerData: js.UndefOr[typings.awsSdk.gameliftMod.GameServerData] = js.native
  /**
    * An identifier for the game server group where the game server is running. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  /**
    * The identifier for the game server to be updated.
    */
  var GameServerId: typings.awsSdk.gameliftMod.GameServerId = js.native
  /**
    * Indicates health status of the game server. An update that explicitly includes this parameter updates the game server's LastHealthCheckTime time stamp. 
    */
  var HealthCheck: js.UndefOr[GameServerHealthCheck] = js.native
  /**
    * Indicates whether the game server is available or is currently hosting gameplay.
    */
  var UtilizationStatus: js.UndefOr[GameServerUtilizationStatus] = js.native
}

object UpdateGameServerInput {
  @scala.inline
  def apply(
    GameServerGroupName: GameServerGroupNameOrArn,
    GameServerId: GameServerId,
    CustomSortKey: GameServerSortKey = null,
    GameServerData: GameServerData = null,
    HealthCheck: GameServerHealthCheck = null,
    UtilizationStatus: GameServerUtilizationStatus = null
  ): UpdateGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any])
    if (CustomSortKey != null) __obj.updateDynamic("CustomSortKey")(CustomSortKey.asInstanceOf[js.Any])
    if (GameServerData != null) __obj.updateDynamic("GameServerData")(GameServerData.asInstanceOf[js.Any])
    if (HealthCheck != null) __obj.updateDynamic("HealthCheck")(HealthCheck.asInstanceOf[js.Any])
    if (UtilizationStatus != null) __obj.updateDynamic("UtilizationStatus")(UtilizationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameServerInput]
  }
}

