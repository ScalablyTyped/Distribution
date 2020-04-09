package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterGameServerInput extends js.Object {
  /**
    * An identifier for the game server group where the game server to be de-registered is running. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  /**
    * The identifier for the game server to be de-registered.
    */
  var GameServerId: typings.awsSdk.gameliftMod.GameServerId = js.native
}

object DeregisterGameServerInput {
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, GameServerId: GameServerId): DeregisterGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterGameServerInput]
  }
}

