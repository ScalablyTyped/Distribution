package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameServerGroupInput extends js.Object {
  /**
    * The fallback balancing method to use for the game server group when Spot instances in a Region become unavailable or are not viable for game hosting. Once triggered, this method remains active until Spot instances can once again be used. Method options include:   SPOT_ONLY -- If Spot instances are unavailable, the game server group provides no hosting capacity. No new instances are started, and the existing nonviable Spot instances are terminated (once current gameplay ends) and not replaced.   SPOT_PREFERRED -- If Spot instances are unavailable, the game server group continues to provide hosting capacity by using On-Demand instances. Existing nonviable Spot instances are terminated (once current gameplay ends) and replaced with new On-Demand instances.   
    */
  var BalancingStrategy: js.UndefOr[typings.awsSdk.gameliftMod.BalancingStrategy] = js.native
  /**
    * The unique identifier of the game server group to update. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running may by terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running. An exception to this is Spot Instances, which may be terminated by AWS regardless of protection status. This property is set to NO_PROTECTION by default.
    */
  var GameServerProtectionPolicy: js.UndefOr[typings.awsSdk.gameliftMod.GameServerProtectionPolicy] = js.native
  /**
    * An updated list of EC2 instance types to use when creating instances in the group. The instance definition must specify instance types that are supported by GameLift FleetIQ, and must include at least two instance types. This updated list replaces the entire current list of instance definitions for the game server group. For more information on instance types, see EC2 Instance Types in the Amazon EC2 User Guide..
    */
  var InstanceDefinitions: js.UndefOr[typings.awsSdk.gameliftMod.InstanceDefinitions] = js.native
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups. The submitted role is validated to ensure that it contains the necessary permissions for game server groups.
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.native
}

object UpdateGameServerGroupInput {
  @scala.inline
  def apply(
    GameServerGroupName: GameServerGroupNameOrArn,
    BalancingStrategy: BalancingStrategy = null,
    GameServerProtectionPolicy: GameServerProtectionPolicy = null,
    InstanceDefinitions: InstanceDefinitions = null,
    RoleArn: IamRoleArn = null
  ): UpdateGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    if (BalancingStrategy != null) __obj.updateDynamic("BalancingStrategy")(BalancingStrategy.asInstanceOf[js.Any])
    if (GameServerProtectionPolicy != null) __obj.updateDynamic("GameServerProtectionPolicy")(GameServerProtectionPolicy.asInstanceOf[js.Any])
    if (InstanceDefinitions != null) __obj.updateDynamic("InstanceDefinitions")(InstanceDefinitions.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameServerGroupInput]
  }
}

