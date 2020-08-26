package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentGroupInput extends js.Object {
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
  implicit class CreateDeploymentGroupInputOps[Self <: CreateDeploymentGroupInput] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentGroupName(value: DeploymentGroupName): Self = this.set("deploymentGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceRoleArn(value: Role): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlarmConfiguration(value: AlarmConfiguration): Self = this.set("alarmConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmConfiguration: Self = this.set("alarmConfiguration", js.undefined)
    @scala.inline
    def setAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = this.set("autoRollbackConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRollbackConfiguration: Self = this.set("autoRollbackConfiguration", js.undefined)
    @scala.inline
    def setAutoScalingGroupsVarargs(value: AutoScalingGroupName*): Self = this.set("autoScalingGroups", js.Array(value :_*))
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupNameList): Self = this.set("autoScalingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroups: Self = this.set("autoScalingGroups", js.undefined)
    @scala.inline
    def setBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = this.set("blueGreenDeploymentConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueGreenDeploymentConfiguration: Self = this.set("blueGreenDeploymentConfiguration", js.undefined)
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = this.set("deploymentConfigName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfigName: Self = this.set("deploymentConfigName", js.undefined)
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
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTriggerConfigurationsVarargs(value: TriggerConfig*): Self = this.set("triggerConfigurations", js.Array(value :_*))
    @scala.inline
    def setTriggerConfigurations(value: TriggerConfigList): Self = this.set("triggerConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerConfigurations: Self = this.set("triggerConfigurations", js.undefined)
  }
  
}

