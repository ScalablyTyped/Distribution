package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentGroupInput extends StObject {
  
  /**
    * Information to add about Amazon CloudWatch alarms when the deployment group is created.
    */
  var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.native
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  
  /**
    * Configuration information for an automatic rollback that is added when a deployment group is created.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  
  /**
    * A list of associated Amazon EC2 Auto Scaling groups.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.native
  
  /**
    * Information about blue/green deployment options for a deployment group.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  
  /**
    * If specified, the deployment configuration name can be either one of the predefined configurations provided with AWS CodeDeploy or a custom deployment configuration that you create by calling the create deployment configuration operation.  CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't specified for the deployment or deployment group. For more information about the predefined deployment configurations in AWS CodeDeploy, see Working with Deployment Configurations in CodeDeploy in the AWS CodeDeploy User Guide.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  
  /**
    * The name of a new deployment group for the specified application.
    */
  var deploymentGroupName: DeploymentGroupName = js.native
  
  /**
    * Information about the type of deployment, in-place or blue/green, that you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  
  /**
    * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified tags. Cannot be used in the same call as ec2TagSet.
    */
  var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.native
  
  /**
    * Information about groups of tags applied to EC2 instances. The deployment group includes only EC2 instances identified by all the tag groups. Cannot be used in the same call as ec2TagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.native
  
  /**
    *  The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format &lt;clustername&gt;:&lt;servicename&gt;. 
    */
  var ecsServices: js.UndefOr[ECSServiceList] = js.native
  
  /**
    * Information about the load balancer used in a deployment.
    */
  var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.native
  
  /**
    * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of the specified tags. Cannot be used in the same call as OnPremisesTagSet.
    */
  var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.native
  
  /**
    * Information about groups of tags applied to on-premises instances. The deployment group includes only on-premises instances identified by all of the tag groups. Cannot be used in the same call as onPremisesInstanceTagFilters.
    */
  var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.native
  
  /**
    * A service role Amazon Resource Name (ARN) that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS services.
    */
  var serviceRoleArn: Role = js.native
  
  /**
    *  The metadata that you apply to CodeDeploy deployment groups to help you organize and categorize them. Each tag consists of a key and an optional value, both of which you define. 
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * Information about triggers to create when the deployment group is created. For examples, see Create a Trigger for an AWS CodeDeploy Event in the AWS CodeDeploy User Guide.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.native
}
object CreateDeploymentGroupInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName, serviceRoleArn: Role): CreateDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentGroupInput]
  }
  
  @scala.inline
  implicit class CreateDeploymentGroupInputMutableBuilder[Self <: CreateDeploymentGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "alarmConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmConfigurationUndefined: Self = StObject.set(x, "alarmConfiguration", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = StObject.set(x, "autoRollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRollbackConfigurationUndefined: Self = StObject.set(x, "autoRollbackConfiguration", js.undefined)
    
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupNameList): Self = StObject.set(x, "autoScalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupsUndefined: Self = StObject.set(x, "autoScalingGroups", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupsVarargs(value: AutoScalingGroupName*): Self = StObject.set(x, "autoScalingGroups", js.Array(value :_*))
    
    @scala.inline
    def setBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = StObject.set(x, "blueGreenDeploymentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueGreenDeploymentConfigurationUndefined: Self = StObject.set(x, "blueGreenDeploymentConfiguration", js.undefined)
    
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
    
    @scala.inline
    def setDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStyle(value: DeploymentStyle): Self = StObject.set(x, "deploymentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStyleUndefined: Self = StObject.set(x, "deploymentStyle", js.undefined)
    
    @scala.inline
    def setEc2TagFilters(value: EC2TagFilterList): Self = StObject.set(x, "ec2TagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2TagFiltersUndefined: Self = StObject.set(x, "ec2TagFilters", js.undefined)
    
    @scala.inline
    def setEc2TagFiltersVarargs(value: EC2TagFilter*): Self = StObject.set(x, "ec2TagFilters", js.Array(value :_*))
    
    @scala.inline
    def setEc2TagSet(value: EC2TagSet): Self = StObject.set(x, "ec2TagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2TagSetUndefined: Self = StObject.set(x, "ec2TagSet", js.undefined)
    
    @scala.inline
    def setEcsServices(value: ECSServiceList): Self = StObject.set(x, "ecsServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsServicesUndefined: Self = StObject.set(x, "ecsServices", js.undefined)
    
    @scala.inline
    def setEcsServicesVarargs(value: ECSService*): Self = StObject.set(x, "ecsServices", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerInfo(value: LoadBalancerInfo): Self = StObject.set(x, "loadBalancerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerInfoUndefined: Self = StObject.set(x, "loadBalancerInfo", js.undefined)
    
    @scala.inline
    def setOnPremisesInstanceTagFilters(value: TagFilterList): Self = StObject.set(x, "onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesInstanceTagFiltersUndefined: Self = StObject.set(x, "onPremisesInstanceTagFilters", js.undefined)
    
    @scala.inline
    def setOnPremisesInstanceTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "onPremisesInstanceTagFilters", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesTagSet(value: OnPremisesTagSet): Self = StObject.set(x, "onPremisesTagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesTagSetUndefined: Self = StObject.set(x, "onPremisesTagSet", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: Role): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTriggerConfigurations(value: TriggerConfigList): Self = StObject.set(x, "triggerConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerConfigurationsUndefined: Self = StObject.set(x, "triggerConfigurations", js.undefined)
    
    @scala.inline
    def setTriggerConfigurationsVarargs(value: TriggerConfig*): Self = StObject.set(x, "triggerConfigurations", js.Array(value :_*))
  }
}
