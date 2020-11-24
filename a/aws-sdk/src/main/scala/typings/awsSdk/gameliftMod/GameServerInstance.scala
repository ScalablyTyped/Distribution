package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerInstance extends js.Object {
  
  /**
    * A generated unique identifier for the game server group that includes the game server instance. 
    */
  var GameServerGroupArn: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupArn] = js.native
  
  /**
    * A developer-defined identifier for the game server group that includes the game server instance. The name is unique for each Region in each AWS account.
    */
  var GameServerGroupName: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupName] = js.native
  
  /**
    * The unique identifier for the instance where the game server is running. This ID is available in the instance metadata. EC2 instance IDs use a 17-character format, for example: i-1234567890abcdef0.
    */
  var InstanceId: js.UndefOr[GameServerInstanceId] = js.native
  
  /**
    *  Current status of the game server instance.     ACTIVE -- The instance is viable for hosting game servers.     DRAINING -- The instance is not viable for hosting game servers. Existing game servers are in the process of ending, and new game servers are not started on this instance unless no other resources are available. When the instance is put in DRAINING, a new instance is started up to replace it. Once the instance has no UTILIZED game servers, it will be terminated in favor of the new instance.    SPOT_TERMINATING -- The instance is in the process of shutting down due to a Spot instance interruption. No new game servers are started on this instance.  
    */
  var InstanceStatus: js.UndefOr[GameServerInstanceStatus] = js.native
}
object GameServerInstance {
  
  @scala.inline
  def apply(): GameServerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerInstance]
  }
  
  @scala.inline
  implicit class GameServerInstanceOps[Self <: GameServerInstance] (val x: Self) extends AnyVal {
    
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
    def setGameServerGroupArn(value: GameServerGroupArn): Self = this.set("GameServerGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerGroupArn: Self = this.set("GameServerGroupArn", js.undefined)
    
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupName): Self = this.set("GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerGroupName: Self = this.set("GameServerGroupName", js.undefined)
    
    @scala.inline
    def setInstanceId(value: GameServerInstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceStatus(value: GameServerInstanceStatus): Self = this.set("InstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceStatus: Self = this.set("InstanceStatus", js.undefined)
  }
}
