package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupInfo extends js.Object {
  
  /**
    * A list of alarms associated with the deployment group.
    */
  var alarmConfiguration: js.UndefOr[AlarmConfiguration] = js.native
  
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  
  /**
    * Information about the automatic rollback configuration associated with the deployment group.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  
  /**
    * A list of associated Auto Scaling groups.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  
  /**
    * Information about blue/green deployment options for a deployment group.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  
  /**
    * The deployment configuration name.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  
  /**
    * The deployment group ID.
    */
  var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.native
  
  /**
    * The deployment group name.
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  
  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  
  /**
    * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified tags.
    */
  var ec2TagFilters: js.UndefOr[EC2TagFilterList] = js.native
  
  /**
    * Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2 instances identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.native
  
  /**
    *  The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name pair using the format &lt;clustername&gt;:&lt;servicename&gt;. 
    */
  var ecsServices: js.UndefOr[ECSServiceList] = js.native
  
  /**
    * Information about the most recent attempted deployment to the deployment group.
    */
  var lastAttemptedDeployment: js.UndefOr[LastDeploymentInfo] = js.native
  
  /**
    * Information about the most recent successful deployment to the deployment group.
    */
  var lastSuccessfulDeployment: js.UndefOr[LastDeploymentInfo] = js.native
  
  /**
    * Information about the load balancer to use in a deployment.
    */
  var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.native
  
  /**
    * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of the specified tags.
    */
  var onPremisesInstanceTagFilters: js.UndefOr[TagFilterList] = js.native
  
  /**
    * Information about groups of tags applied to an on-premises instance. The deployment group includes only on-premises instances identified by all the tag groups. Cannot be used in the same call as onPremisesInstanceTagFilters.
    */
  var onPremisesTagSet: js.UndefOr[OnPremisesTagSet] = js.native
  
  /**
    * A service role Amazon Resource Name (ARN) that grants CodeDeploy permission to make calls to AWS services on your behalf. For more information, see Create a Service Role for AWS CodeDeploy in the AWS CodeDeploy User Guide.
    */
  var serviceRoleArn: js.UndefOr[Role] = js.native
  
  /**
    * Information about the deployment group's target revision, including type and location.
    */
  var targetRevision: js.UndefOr[RevisionLocation] = js.native
  
  /**
    * Information about triggers associated with the deployment group.
    */
  var triggerConfigurations: js.UndefOr[TriggerConfigList] = js.native
}
object DeploymentGroupInfo {
  
  @scala.inline
  def apply(): DeploymentGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupInfo]
  }
  
  @scala.inline
  implicit class DeploymentGroupInfoOps[Self <: DeploymentGroupInfo] (val x: Self) extends AnyVal {
    
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
    def setAlarmConfiguration(value: AlarmConfiguration): Self = this.set("alarmConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmConfiguration: Self = this.set("alarmConfiguration", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = this.set("autoRollbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRollbackConfiguration: Self = this.set("autoRollbackConfiguration", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = this.set("autoScalingGroups", js.Array(value :_*))
    
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupList): Self = this.set("autoScalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroups: Self = this.set("autoScalingGroups", js.undefined)
    
    @scala.inline
    def setBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = this.set("blueGreenDeploymentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlueGreenDeploymentConfiguration: Self = this.set("blueGreenDeploymentConfiguration", js.undefined)
    
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = this.set("deploymentConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentConfigName: Self = this.set("deploymentConfigName", js.undefined)
    
    @scala.inline
    def setDeploymentGroupId(value: DeploymentGroupId): Self = this.set("deploymentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentGroupId: Self = this.set("deploymentGroupId", js.undefined)
    
    @scala.inline
    def setDeploymentGroupName(value: DeploymentGroupName): Self = this.set("deploymentGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentGroupName: Self = this.set("deploymentGroupName", js.undefined)
    
    @scala.inline
    def setDeploymentStyle(value: DeploymentStyle): Self = this.set("deploymentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentStyle: Self = this.set("deploymentStyle", js.undefined)
    
    @scala.inline
    def setEc2TagFiltersVarargs(value: EC2TagFilter*): Self = this.set("ec2TagFilters", js.Array(value :_*))
    
    @scala.inline
    def setEc2TagFilters(value: EC2TagFilterList): Self = this.set("ec2TagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2TagFilters: Self = this.set("ec2TagFilters", js.undefined)
    
    @scala.inline
    def setEc2TagSet(value: EC2TagSet): Self = this.set("ec2TagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2TagSet: Self = this.set("ec2TagSet", js.undefined)
    
    @scala.inline
    def setEcsServicesVarargs(value: ECSService*): Self = this.set("ecsServices", js.Array(value :_*))
    
    @scala.inline
    def setEcsServices(value: ECSServiceList): Self = this.set("ecsServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcsServices: Self = this.set("ecsServices", js.undefined)
    
    @scala.inline
    def setLastAttemptedDeployment(value: LastDeploymentInfo): Self = this.set("lastAttemptedDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAttemptedDeployment: Self = this.set("lastAttemptedDeployment", js.undefined)
    
    @scala.inline
    def setLastSuccessfulDeployment(value: LastDeploymentInfo): Self = this.set("lastSuccessfulDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSuccessfulDeployment: Self = this.set("lastSuccessfulDeployment", js.undefined)
    
    @scala.inline
    def setLoadBalancerInfo(value: LoadBalancerInfo): Self = this.set("loadBalancerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerInfo: Self = this.set("loadBalancerInfo", js.undefined)
    
    @scala.inline
    def setOnPremisesInstanceTagFiltersVarargs(value: TagFilter*): Self = this.set("onPremisesInstanceTagFilters", js.Array(value :_*))
    
    @scala.inline
    def setOnPremisesInstanceTagFilters(value: TagFilterList): Self = this.set("onPremisesInstanceTagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesInstanceTagFilters: Self = this.set("onPremisesInstanceTagFilters", js.undefined)
    
    @scala.inline
    def setOnPremisesTagSet(value: OnPremisesTagSet): Self = this.set("onPremisesTagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPremisesTagSet: Self = this.set("onPremisesTagSet", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: Role): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("serviceRoleArn", js.undefined)
    
    @scala.inline
    def setTargetRevision(value: RevisionLocation): Self = this.set("targetRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRevision: Self = this.set("targetRevision", js.undefined)
    
    @scala.inline
    def setTriggerConfigurationsVarargs(value: TriggerConfig*): Self = this.set("triggerConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setTriggerConfigurations(value: TriggerConfigList): Self = this.set("triggerConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerConfigurations: Self = this.set("triggerConfigurations", js.undefined)
  }
}
