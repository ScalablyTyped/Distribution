package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeploymentGroupInput extends js.Object {
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
  implicit class UpdateDeploymentGroupInputOps[Self <: UpdateDeploymentGroupInput] (val x: Self) extends AnyVal {
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
    def setCurrentDeploymentGroupName(value: DeploymentGroupName): Self = this.set("currentDeploymentGroupName", value.asInstanceOf[js.Any])
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
    def setNewDeploymentGroupName(value: DeploymentGroupName): Self = this.set("newDeploymentGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewDeploymentGroupName: Self = this.set("newDeploymentGroupName", js.undefined)
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
    def setTriggerConfigurationsVarargs(value: TriggerConfig*): Self = this.set("triggerConfigurations", js.Array(value :_*))
    @scala.inline
    def setTriggerConfigurations(value: TriggerConfigList): Self = this.set("triggerConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerConfigurations: Self = this.set("triggerConfigurations", js.undefined)
  }
  
}

