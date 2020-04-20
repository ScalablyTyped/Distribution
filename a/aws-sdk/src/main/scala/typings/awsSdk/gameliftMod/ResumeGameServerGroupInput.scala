package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeGameServerGroupInput extends js.Object {
  /**
    * The unique identifier of the game server group to resume activity on. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  /**
    * The action to resume for this game server group.
    */
  var ResumeActions: GameServerGroupActions = js.native
}

object ResumeGameServerGroupInput {
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, ResumeActions: GameServerGroupActions): ResumeGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], ResumeActions = ResumeActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeGameServerGroupInput]
  }
}

