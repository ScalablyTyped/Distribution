package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerGroup extends js.Object {
  
  /**
    * A generated unique ID for the EC2 Auto Scaling group that is associated with this game server group.
    */
  var AutoScalingGroupArn: js.UndefOr[typings.awsSdk.gameliftMod.AutoScalingGroupArn] = js.native
  
  /**
    * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server group. Method options include the following:    SPOT_ONLY - Only Spot Instances are used in the game server group. If Spot Instances are unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated (after current gameplay ends) and are not replaced.    SPOT_PREFERRED - (default value) Spot Instances are used whenever available in the game server group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and are replaced with new On-Demand Instances.    ON_DEMAND_ONLY - Only On-Demand Instances are used in the game server group. No Spot Instances are used, even when available, while this balancing strategy is in force.  
    */
  var BalancingStrategy: js.UndefOr[typings.awsSdk.gameliftMod.BalancingStrategy] = js.native
  
  /**
    * A timestamp that indicates when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A generated unique ID for the game server group.
    */
  var GameServerGroupArn: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupArn] = js.native
  
  /**
    * A developer-defined identifier for the game server group. The name is unique for each Region in each AWS account.
    */
  var GameServerGroupName: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupName] = js.native
  
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running might be terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running except in the event of a forced game server group deletion (see ). An exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status. 
    */
  var GameServerProtectionPolicy: js.UndefOr[typings.awsSdk.gameliftMod.GameServerProtectionPolicy] = js.native
  
  /**
    * The set of EC2 instance types that GameLift FleetIQ can use when balancing and automatically scaling instances in the corresponding Auto Scaling group. 
    */
  var InstanceDefinitions: js.UndefOr[typings.awsSdk.gameliftMod.InstanceDefinitions] = js.native
  
  /**
    * A timestamp that indicates when this game server group was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.native
  
  /**
    * The current status of the game server group. Possible statuses include:    NEW - GameLift FleetIQ has validated the CreateGameServerGroup() request.     ACTIVATING - GameLift FleetIQ is setting up a game server group, which includes creating an Auto Scaling group in your AWS account.     ACTIVE - The game server group has been successfully created.     DELETE_SCHEDULED - A request to delete the game server group has been received.     DELETING - GameLift FleetIQ has received a valid DeleteGameServerGroup() request and is processing it. GameLift FleetIQ must first complete and release hosts before it deletes the Auto Scaling group and the game server group.     DELETED - The game server group has been successfully deleted.     ERROR - The asynchronous processes of activating or deleting a game server group has failed, resulting in an error state.  
    */
  var Status: js.UndefOr[GameServerGroupStatus] = js.native
  
  /**
    * Additional information about the current game server group status. This information might provide additional insight on groups that are in ERROR status.
    */
  var StatusReason: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A list of activities that are currently suspended for this game server group. If this property is empty, all activities are occurring.
    */
  var SuspendedActions: js.UndefOr[GameServerGroupActions] = js.native
}
object GameServerGroup {
  
  @scala.inline
  def apply(): GameServerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerGroup]
  }
  
  @scala.inline
  implicit class GameServerGroupOps[Self <: GameServerGroup] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingGroupArn(value: AutoScalingGroupArn): Self = this.set("AutoScalingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroupArn: Self = this.set("AutoScalingGroupArn", js.undefined)
    
    @scala.inline
    def setBalancingStrategy(value: BalancingStrategy): Self = this.set("BalancingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalancingStrategy: Self = this.set("BalancingStrategy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setGameServerGroupArn(value: GameServerGroupArn): Self = this.set("GameServerGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerGroupArn: Self = this.set("GameServerGroupArn", js.undefined)
    
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupName): Self = this.set("GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerGroupName: Self = this.set("GameServerGroupName", js.undefined)
    
    @scala.inline
    def setGameServerProtectionPolicy(value: GameServerProtectionPolicy): Self = this.set("GameServerProtectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerProtectionPolicy: Self = this.set("GameServerProtectionPolicy", js.undefined)
    
    @scala.inline
    def setInstanceDefinitionsVarargs(value: InstanceDefinition*): Self = this.set("InstanceDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setInstanceDefinitions(value: InstanceDefinitions): Self = this.set("InstanceDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceDefinitions: Self = this.set("InstanceDefinitions", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setRoleArn(value: IamRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: GameServerGroupStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: NonZeroAndMaxString): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
    
    @scala.inline
    def setSuspendedActionsVarargs(value: GameServerGroupAction*): Self = this.set("SuspendedActions", js.Array(value :_*))
    
    @scala.inline
    def setSuspendedActions(value: GameServerGroupActions): Self = this.set("SuspendedActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspendedActions: Self = this.set("SuspendedActions", js.undefined)
  }
}
