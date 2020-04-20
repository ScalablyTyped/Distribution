package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendGameServerGroupInput extends js.Object {
  /**
    * The unique identifier of the game server group to stop activity on. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  /**
    * The action to suspend for this game server group.
    */
  var SuspendActions: GameServerGroupActions = js.native
}

object SuspendGameServerGroupInput {
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, SuspendActions: GameServerGroupActions): SuspendGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], SuspendActions = SuspendActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendGameServerGroupInput]
  }
}

