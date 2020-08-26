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
  @scala.inline
  implicit class ResumeGameServerGroupInputOps[Self <: ResumeGameServerGroupInput] (val x: Self) extends AnyVal {
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
    def setResumeActionsVarargs(value: GameServerGroupAction*): Self = this.set("ResumeActions", js.Array(value :_*))
    @scala.inline
    def setResumeActions(value: GameServerGroupActions): Self = this.set("ResumeActions", value.asInstanceOf[js.Any])
  }
  
}

