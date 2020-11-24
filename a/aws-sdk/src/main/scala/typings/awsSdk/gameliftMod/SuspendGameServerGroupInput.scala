package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspendGameServerGroupInput extends js.Object {
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  
  /**
    * The activity to suspend for this game server group.
    */
  var SuspendActions: GameServerGroupActions = js.native
}
object SuspendGameServerGroupInput {
  
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, SuspendActions: GameServerGroupActions): SuspendGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], SuspendActions = SuspendActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendGameServerGroupInput]
  }
  
  @scala.inline
  implicit class SuspendGameServerGroupInputOps[Self <: SuspendGameServerGroupInput] (val x: Self) extends AnyVal {
    
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
    def setSuspendActionsVarargs(value: GameServerGroupAction*): Self = this.set("SuspendActions", js.Array(value :_*))
    
    @scala.inline
    def setSuspendActions(value: GameServerGroupActions): Self = this.set("SuspendActions", value.asInstanceOf[js.Any])
  }
}
