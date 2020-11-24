package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGameServerGroupInput extends js.Object {
  
  /**
    * The type of delete to perform. Options include the following:    SAFE_DELETE – Terminates the game server group and EC2 Auto Scaling group only when it has no game servers that are in UTILIZED status.    FORCE_DELETE – Terminates the game server group, including all active game servers regardless of their utilization status, and the EC2 Auto Scaling group.     RETAIN – Does a safe delete of the game server group but retains the EC2 Auto Scaling group as is.  
    */
  var DeleteOption: js.UndefOr[GameServerGroupDeleteOption] = js.native
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
}
object DeleteGameServerGroupInput {
  
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn): DeleteGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGameServerGroupInput]
  }
  
  @scala.inline
  implicit class DeleteGameServerGroupInputOps[Self <: DeleteGameServerGroupInput] (val x: Self) extends AnyVal {
    
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
    def setDeleteOption(value: GameServerGroupDeleteOption): Self = this.set("DeleteOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteOption: Self = this.set("DeleteOption", js.undefined)
  }
}
