package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameServerGroupInput extends StObject {
  
  /**
    * Configuration settings to define a scaling policy for the Auto Scaling group that is optimized for game hosting. The scaling policy uses the metric "PercentUtilizedGameServers" to maintain a buffer of idle game servers that can immediately accommodate new games and players. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
    */
  var AutoScalingPolicy: js.UndefOr[GameServerGroupAutoScalingPolicy] = js.undefined
  
  /**
    * Indicates how GameLift FleetIQ balances the use of Spot Instances and On-Demand Instances in the game server group. Method options include the following:    SPOT_ONLY - Only Spot Instances are used in the game server group. If Spot Instances are unavailable or not viable for game hosting, the game server group provides no hosting capacity until Spot Instances can again be used. Until then, no new instances are started, and the existing nonviable Spot Instances are terminated (after current gameplay ends) and are not replaced.    SPOT_PREFERRED - (default value) Spot Instances are used whenever available in the game server group. If Spot Instances are unavailable, the game server group continues to provide hosting capacity by falling back to On-Demand Instances. Existing nonviable Spot Instances are terminated (after current gameplay ends) and are replaced with new On-Demand Instances.    ON_DEMAND_ONLY - Only On-Demand Instances are used in the game server group. No Spot Instances are used, even when available, while this balancing strategy is in force.  
    */
  var BalancingStrategy: js.UndefOr[typings.awsSdk.gameliftMod.BalancingStrategy] = js.undefined
  
  /**
    * An identifier for the new game server group. This value is used to generate unique ARN identifiers for the EC2 Auto Scaling group and the GameLift FleetIQ game server group. The name must be unique per Region per AWS account.
    */
  var GameServerGroupName: typings.awsSdk.gameliftMod.GameServerGroupName
  
  /**
    * A flag that indicates whether instances in the game server group are protected from early termination. Unprotected instances that have active game servers running might be terminated during a scale-down event, causing players to be dropped from the game. Protected instances cannot be terminated while there are active game servers running except in the event of a forced game server group deletion (see ). An exception to this is with Spot Instances, which can be terminated by AWS regardless of protection status. This property is set to NO_PROTECTION by default.
    */
  var GameServerProtectionPolicy: js.UndefOr[typings.awsSdk.gameliftMod.GameServerProtectionPolicy] = js.undefined
  
  /**
    * The EC2 instance types and sizes to use in the Auto Scaling group. The instance definitions must specify at least two different instance types that are supported by GameLift FleetIQ. For more information on instance types, see EC2 Instance Types in the Amazon EC2 User Guide. You can optionally specify capacity weighting for each instance type. If no weight value is specified for an instance type, it is set to the default value "1". For more information about capacity weighting, see  Instance Weighting for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceDefinitions: typings.awsSdk.gameliftMod.InstanceDefinitions
  
  /**
    * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group. You can specify the template using either the template name or ID. For help with creating a launch template, see Creating a Launch Template for an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
    */
  var LaunchTemplate: LaunchTemplateSpecification
  
  /**
    * The maximum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift FleetIQ and EC2 do not scale up the group above this maximum. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
    */
  var MaxSize: PositiveInteger
  
  /**
    * The minimum number of instances allowed in the EC2 Auto Scaling group. During automatic scaling events, GameLift FleetIQ and EC2 do not scale down the group below this minimum. In production, this value should be set to at least 1. After the Auto Scaling group is created, update this value directly in the Auto Scaling group using the AWS console or APIs.
    */
  var MinSize: WholeNumber
  
  /**
    * The Amazon Resource Name (ARN) for an IAM role that allows Amazon GameLift to access your EC2 Auto Scaling groups.
    */
  var RoleArn: IamRoleArn
  
  /**
    * A list of labels to assign to the new game server group resource. Tags are developer-defined key-value pairs. Tagging AWS resources is useful for resource management, access management, and cost allocation. For more information, see  Tagging AWS Resources in the AWS General Reference. Once the resource is created, you can use TagResource, UntagResource, and ListTagsForResource to add, remove, and view tags, respectively. The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A list of virtual private cloud (VPC) subnets to use with instances in the game server group. By default, all GameLift FleetIQ-supported Availability Zones are used. You can use this parameter to specify VPCs that you've set up. This property cannot be updated after the game server group is created, and the corresponding Auto Scaling group will always use the property value that is set with this request, even if the Auto Scaling group is updated directly
    */
  var VpcSubnets: js.UndefOr[typings.awsSdk.gameliftMod.VpcSubnets] = js.undefined
}
object CreateGameServerGroupInput {
  
  inline def apply(
    GameServerGroupName: GameServerGroupName,
    InstanceDefinitions: InstanceDefinitions,
    LaunchTemplate: LaunchTemplateSpecification,
    MaxSize: PositiveInteger,
    MinSize: WholeNumber,
    RoleArn: IamRoleArn
  ): CreateGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], InstanceDefinitions = InstanceDefinitions.asInstanceOf[js.Any], LaunchTemplate = LaunchTemplate.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameServerGroupInput]
  }
  
  extension [Self <: CreateGameServerGroupInput](x: Self) {
    
    inline def setAutoScalingPolicy(value: GameServerGroupAutoScalingPolicy): Self = StObject.set(x, "AutoScalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingPolicyUndefined: Self = StObject.set(x, "AutoScalingPolicy", js.undefined)
    
    inline def setBalancingStrategy(value: BalancingStrategy): Self = StObject.set(x, "BalancingStrategy", value.asInstanceOf[js.Any])
    
    inline def setBalancingStrategyUndefined: Self = StObject.set(x, "BalancingStrategy", js.undefined)
    
    inline def setGameServerGroupName(value: GameServerGroupName): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setGameServerProtectionPolicy(value: GameServerProtectionPolicy): Self = StObject.set(x, "GameServerProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setGameServerProtectionPolicyUndefined: Self = StObject.set(x, "GameServerProtectionPolicy", js.undefined)
    
    inline def setInstanceDefinitions(value: InstanceDefinitions): Self = StObject.set(x, "InstanceDefinitions", value.asInstanceOf[js.Any])
    
    inline def setInstanceDefinitionsVarargs(value: InstanceDefinition*): Self = StObject.set(x, "InstanceDefinitions", js.Array(value :_*))
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: PositiveInteger): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: WholeNumber): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setVpcSubnets(value: VpcSubnets): Self = StObject.set(x, "VpcSubnets", value.asInstanceOf[js.Any])
    
    inline def setVpcSubnetsUndefined: Self = StObject.set(x, "VpcSubnets", js.undefined)
    
    inline def setVpcSubnetsVarargs(value: VpcSubnet*): Self = StObject.set(x, "VpcSubnets", js.Array(value :_*))
  }
}
