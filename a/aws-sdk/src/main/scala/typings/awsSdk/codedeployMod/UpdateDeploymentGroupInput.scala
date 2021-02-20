package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeploymentGroupInput extends StObject {
  
  /**
    * Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
    */
  var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.native
  
  /**
    * The application name that corresponds to the deployment group to update.
    */
  var applicationName: ApplicationName = js.native
  
  /**
    * Information for an automatic rollback configuration that is added or changed when a deployment group is updated.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  
  /**
    * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them. To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any Auto Scaling group names.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.native
  
  /**
    * Information about blue/green deployment options for a deployment group.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  
  /**
    * The current name of the deployment group.
    */
  var currentDeploymentGroupName: DeploymentGroupName = js.native
  
  /**
    * The replacement deployment configuration name to use, if you want to change it.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  
  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  
  /**
    * The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the existing tags, enter their names. To remove tags, do not enter any tag names.
    */
  var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.native
  
  /**
    * Information about groups of tags applied to on-premises instances. The deployment group includes only EC2 instances identified by all the tag groups.
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
    * The new name of the deployment group, if you want to change it.
    */
  var newDeploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  
  /**
    * The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep the existing tags, enter their names. To remove tags, do not enter any tag names.
    */
  var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.native
  
  /**
    * Information about an on-premises instance tag set. The deployment group includes only on-premises instances identified by all the tag groups.
    */
  var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.native
  
  /**
    * A replacement ARN for the service role, if you want to change it.
    */
  var serviceRoleArn: js.UndefOr[Role] = js.native
  
  /**
    * Information about triggers to change when the deployment group is updated. For examples, see Edit a Trigger in a CodeDeploy Deployment Group in the AWS CodeDeploy User Guide.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.native
}
object UpdateDeploymentGroupInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName, currentDeploymentGroupName: DeploymentGroupName): UpdateDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], currentDeploymentGroupName = currentDeploymentGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentGroupInput]
  }
  
  @scala.inline
  implicit class UpdateDeploymentGroupInputMutableBuilder[Self <: UpdateDeploymentGroupInput] (val x: Self) extends AnyVal {
    
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
    def setCurrentDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "currentDeploymentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
    
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
    def setNewDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "newDeploymentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDeploymentGroupNameUndefined: Self = StObject.set(x, "newDeploymentGroupName", js.undefined)
    
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
    def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
    
    @scala.inline
    def setTriggerConfigurations(value: TriggerConfigList): Self = StObject.set(x, "triggerConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerConfigurationsUndefined: Self = StObject.set(x, "triggerConfigurations", js.undefined)
    
    @scala.inline
    def setTriggerConfigurationsVarargs(value: TriggerConfig*): Self = StObject.set(x, "triggerConfigurations", js.Array(value :_*))
  }
}
