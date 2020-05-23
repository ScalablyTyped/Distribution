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
  def apply(
    applicationName: ApplicationName,
    deploymentGroupName: DeploymentGroupName,
    serviceRoleArn: Role,
    alarmConfiguration: AlarmConfiguration = null,
    autoRollbackConfiguration: AutoRollbackConfiguration = null,
    autoScalingGroups: AutoScalingGroupNameList = null,
    blueGreenDeploymentConfiguration: BlueGreenDeploymentConfiguration = null,
    deploymentConfigName: DeploymentConfigName = null,
    deploymentStyle: DeploymentStyle = null,
    ec2TagFilters: EC2TagFilterList = null,
    ec2TagSet: EC2TagSet = null,
    ecsServices: ECSServiceList = null,
    loadBalancerInfo: LoadBalancerInfo = null,
    onPremisesInstanceTagFilters: TagFilterList = null,
    onPremisesTagSet: OnPremisesTagSet = null,
    tags: TagList = null,
    triggerConfigurations: TriggerConfigList = null
  ): CreateDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any])
    if (alarmConfiguration != null) __obj.updateDynamic("alarmConfiguration")(alarmConfiguration.asInstanceOf[js.Any])
    if (autoRollbackConfiguration != null) __obj.updateDynamic("autoRollbackConfiguration")(autoRollbackConfiguration.asInstanceOf[js.Any])
    if (autoScalingGroups != null) __obj.updateDynamic("autoScalingGroups")(autoScalingGroups.asInstanceOf[js.Any])
    if (blueGreenDeploymentConfiguration != null) __obj.updateDynamic("blueGreenDeploymentConfiguration")(blueGreenDeploymentConfiguration.asInstanceOf[js.Any])
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName.asInstanceOf[js.Any])
    if (deploymentStyle != null) __obj.updateDynamic("deploymentStyle")(deploymentStyle.asInstanceOf[js.Any])
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters.asInstanceOf[js.Any])
    if (ec2TagSet != null) __obj.updateDynamic("ec2TagSet")(ec2TagSet.asInstanceOf[js.Any])
    if (ecsServices != null) __obj.updateDynamic("ecsServices")(ecsServices.asInstanceOf[js.Any])
    if (loadBalancerInfo != null) __obj.updateDynamic("loadBalancerInfo")(loadBalancerInfo.asInstanceOf[js.Any])
    if (onPremisesInstanceTagFilters != null) __obj.updateDynamic("onPremisesInstanceTagFilters")(onPremisesInstanceTagFilters.asInstanceOf[js.Any])
    if (onPremisesTagSet != null) __obj.updateDynamic("onPremisesTagSet")(onPremisesTagSet.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (triggerConfigurations != null) __obj.updateDynamic("triggerConfigurations")(triggerConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentGroupInput]
  }
}

