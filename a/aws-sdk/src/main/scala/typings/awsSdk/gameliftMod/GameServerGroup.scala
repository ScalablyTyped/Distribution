package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameServerGroup extends js.Object {
  /**
    * A generated unique ID for the EC2 Auto Scaling group with is associated with this game server group.
    */
  var AutoScalingGroupArn: js.UndefOr[typings.awsSdk.gameliftMod.AutoScalingGroupArn] = js.native
  /**
    * The fallback balancing method to use for the game server group when Spot instances in a Region become unavailable or are not viable for game hosting. Once triggered, this method remains active until Spot instances can once again be used. Method options include:   SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new instances are started, and the existing nonviable Spot instances are terminated (once current gameplay ends) and not replaced.   SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting capacity by using On-Demand instances. Existing nonviable Spot instances are terminated (once current gameplay ends) and replaced with new On-Demand instances.   
    */
  var BalancingStrategy: js.UndefOr[typings.awsSdk.gameliftMod.BalancingStrategy] = js.native
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * A generated unique ID for the game server group.
    */
  var GameServerGroupArn: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupArn] = js.native
  /**
    * A developer-defined identifier for the game server group. The name is unique per Region per AWS account.
    */
  var GameServerGroupName: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupName] = js.native
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running may be terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running except in the event of a forced game server group deletion (see DeleteGameServerGroup). An exception to this is Spot Instances, which may be terminated by AWS regardless of protection status.
    */
  var GameServerProtectionPolicy: js.UndefOr[typings.awsSdk.gameliftMod.GameServerProtectionPolicy] = js.native
  /**
    * The set of EC2 instance types that GameLift FleetIQ can use when rebalancing and autoscaling instances in the group. 
    */
  var InstanceDefinitions: js.UndefOr[typings.awsSdk.gameliftMod.InstanceDefinitions] = js.native
  /**
    * A time stamp indicating when this game server group was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is validated to ensure that it contains the necessary permissions for game server groups.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.native
  /**
    * The current status of the game server group. Possible statuses include:    NEW - GameLift FleetIQ has validated the CreateGameServerGroup() request.    ACTIVATING - GameLift FleetIQ is setting up a game server group, which includes creating an autoscaling group in your AWS account.    ACTIVE - The game server group has been successfully created.    DELETE_SCHEDULED - A request to delete the game server group has been received.    DELETING - GameLift FleetIQ has received a valid DeleteGameServerGroup() request and is processing it. GameLift FleetIQ must first complete and release hosts before it deletes the autoscaling group and the game server group.    DELETED - The game server group has been successfully deleted.    ERROR - The asynchronous processes of activating or deleting a game server group has failed, resulting in an error state.  
    */
  var Status: js.UndefOr[GameServerGroupStatus] = js.native
  /**
    * Additional information about the current game server group status. This information may provide additional insight on groups that in ERROR status.
    */
  var StatusReason: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A list of activities that are currently suspended for this game server group. If this property is empty, all activities are occurring.
    */
  var SuspendedActions: js.UndefOr[GameServerGroupActions] = js.native
}

object GameServerGroup {
  @scala.inline
  def apply(
    AutoScalingGroupArn: AutoScalingGroupArn = null,
    BalancingStrategy: BalancingStrategy = null,
    CreationTime: Timestamp = null,
    GameServerGroupArn: GameServerGroupArn = null,
    GameServerGroupName: GameServerGroupName = null,
    GameServerProtectionPolicy: GameServerProtectionPolicy = null,
    InstanceDefinitions: InstanceDefinitions = null,
    LastUpdatedTime: Timestamp = null,
    RoleArn: IamRoleArn = null,
    Status: GameServerGroupStatus = null,
    StatusReason: NonZeroAndMaxString = null,
    SuspendedActions: GameServerGroupActions = null
  ): GameServerGroup = {
    val __obj = js.Dynamic.literal()
    if (AutoScalingGroupArn != null) __obj.updateDynamic("AutoScalingGroupArn")(AutoScalingGroupArn.asInstanceOf[js.Any])
    if (BalancingStrategy != null) __obj.updateDynamic("BalancingStrategy")(BalancingStrategy.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (GameServerGroupArn != null) __obj.updateDynamic("GameServerGroupArn")(GameServerGroupArn.asInstanceOf[js.Any])
    if (GameServerGroupName != null) __obj.updateDynamic("GameServerGroupName")(GameServerGroupName.asInstanceOf[js.Any])
    if (GameServerProtectionPolicy != null) __obj.updateDynamic("GameServerProtectionPolicy")(GameServerProtectionPolicy.asInstanceOf[js.Any])
    if (InstanceDefinitions != null) __obj.updateDynamic("InstanceDefinitions")(InstanceDefinitions.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    if (SuspendedActions != null) __obj.updateDynamic("SuspendedActions")(SuspendedActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameServerGroup]
  }
}

