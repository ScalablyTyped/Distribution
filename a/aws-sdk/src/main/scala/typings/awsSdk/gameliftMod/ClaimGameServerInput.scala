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
  def apply(GameServerGroupName: GameServerGroupNameOrArn): ClaimGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimGameServerInput]
  }
  @scala.inline
  implicit class ClaimGameServerInputOps[Self <: ClaimGameServerInput] (val x: Self) extends AnyVal {
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
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = this.set("GameServerGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameServerData(value: GameServerData): Self = this.set("GameServerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameServerData: Self = this.set("GameServerData", js.undefined)
    @scala.inline
    def setGameServerId(value: GameServerId): Self = this.set("GameServerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameServerId: Self = this.set("GameServerId", js.undefined)
  }
  
}

