package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimGameServerInput extends js.Object {
  /**
    * A set of custom game server properties, formatted as a single string value, to be passed to the claimed game server. 
    */
  var GameServerData: js.UndefOr[typings.awsSdk.gameliftMod.GameServerData] = js.native
  /**
    * An identifier for the game server group. When claiming a specific game server, this is the game server group whether the game server is located. When requesting that GameLift FleetIQ locate an available game server, this is the game server group to search on. You can use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  /**
    * A custom string that uniquely identifies the game server to claim. If this parameter is left empty, GameLift FleetIQ searches for an available game server in the specified game server group.
    */
  var GameServerId: js.UndefOr[typings.awsSdk.gameliftMod.GameServerId] = js.native
}

object ClaimGameServerInput {
  @scala.inline
  def apply(
    GameServerGroupName: GameServerGroupNameOrArn,
    GameServerData: GameServerData = null,
    GameServerId: GameServerId = null
  ): ClaimGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    if (GameServerData != null) __obj.updateDynamic("GameServerData")(GameServerData.asInstanceOf[js.Any])
    if (GameServerId != null) __obj.updateDynamic("GameServerId")(GameServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimGameServerInput]
  }
}

