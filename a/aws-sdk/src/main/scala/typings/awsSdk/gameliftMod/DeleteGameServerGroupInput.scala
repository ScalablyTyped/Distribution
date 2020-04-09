package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGameServerGroupInput extends js.Object {
  /**
    * The type of delete to perform. Options include:   SAFE_DELETE – Terminates the game server group and EC2 Auto Scaling group only when it has no game servers that are in IN_USE status.   FORCE_DELETE – Terminates the game server group, including all active game servers regardless of their utilization status, and the EC2 Auto Scaling group.    RETAIN – Does a safe delete of the game server group but retains the EC2 Auto Scaling group as is.  
    */
  var DeleteOption: js.UndefOr[GameServerGroupDeleteOption] = js.native
  /**
    * The unique identifier of the game server group to delete. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
}

object DeleteGameServerGroupInput {
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, DeleteOption: GameServerGroupDeleteOption = null): DeleteGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    if (DeleteOption != null) __obj.updateDynamic("DeleteOption")(DeleteOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGameServerGroupInput]
  }
}

