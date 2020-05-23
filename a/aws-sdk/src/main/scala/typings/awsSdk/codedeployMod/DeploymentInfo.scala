package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentInfo extends js.Object {
  /**
    * Provides information about the results of a deployment, such as whether instances in the original environment in a blue/green deployment were not terminated.
    */
  var additionalDeploymentStatusInfo: js.UndefOr[AdditionalDeploymentStatusInfo] = js.native
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * Information about the automatic rollback configuration associated with the deployment.
    */
  var autoRollbackConfiguration: js.UndefOr[AutoRollbackConfiguration] = js.native
  /**
    * Information about blue/green deployment options for this deployment.
    */
  var blueGreenDeploymentConfiguration: js.UndefOr[BlueGreenDeploymentConfiguration] = js.native
  /**
    * A timestamp that indicates when the deployment was complete.
    */
  var completeTime: js.UndefOr[Timestamp] = js.native
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * A timestamp that indicates when the deployment was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.native
  /**
    * The means by which the deployment was created:    user: A user created the deployment.    autoscaling: Amazon EC2 Auto Scaling created the deployment.    codeDeployRollback: A rollback process created the deployment.  
    */
  var creator: js.UndefOr[DeploymentCreator] = js.native
  /**
    *  The deployment configuration name. 
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.native
  /**
    *  The deployment group name. 
    */
  var deploymentGroupName: js.UndefOr[DeploymentGroupName] = js.native
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    * A summary of the deployment status of the instances in the deployment.
    */
  var deploymentOverview: js.UndefOr[DeploymentOverview] = js.native
  /**
    * Messages that contain information about the status of a deployment.
    */
  var deploymentStatusMessages: js.UndefOr[DeploymentStatusMessageList] = js.native
  /**
    * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer.
    */
  var deploymentStyle: js.UndefOr[DeploymentStyle] = js.native
  /**
    * A comment about the deployment.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Information about any error associated with this deployment.
    */
  var errorInformation: js.UndefOr[ErrorInformation] = js.native
  /**
    * The unique ID for an external resource (for example, a CloudFormation stack ID) that is linked to this deployment.
    */
  var externalId: js.UndefOr[ExternalId] = js.native
  /**
    * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't part of the previous successful deployment.    DISALLOW: The deployment fails. This is also the default behavior if no option is specified.    OVERWRITE: The version of the file from the application revision currently being deployed replaces the version already on the instance.    RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.  
    */
  var fileExistsBehavior: js.UndefOr[FileExistsBehavior] = js.native
  /**
    *  If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an instance fails, then the deployment continues to the next deployment lifecycle event. For example, if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.   If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.   During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run successfully, the deployment can fail.   If the cause of the failure is a script from the last successful deployment that will never run successfully, create a new deployment and use ignoreApplicationStopFailures to specify that the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored. 
    */
  var ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the wait period set for the termination of instances in the original environment has started. Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the termination wait period starts.
    */
  var instanceTerminationWaitTimeStarted: js.UndefOr[Boolean] = js.native
  /**
    * Information about the load balancer used in the deployment.
    */
  var loadBalancerInfo: js.UndefOr[LoadBalancerInfo] = js.native
  /**
    * Information about the application revision that was deployed to the deployment group before the most recent successful deployment.
    */
  var previousRevision: js.UndefOr[RevisionLocation] = js.native
  /**
    * Information about the location of stored application artifacts and the service from which to retrieve them.
    */
  var revision: js.UndefOr[RevisionLocation] = js.native
  /**
    * Information about a deployment rollback.
    */
  var rollbackInfo: js.UndefOr[RollbackInfo] = js.native
  /**
    * A timestamp that indicates when the deployment was deployed to the deployment group. In some cases, the reported value of the start time might be later than the complete time. This is due to differences in the clock settings of backend servers that participate in the deployment process.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  /**
    * The current state of the deployment as a whole.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
  /**
    * Information about the instances that belong to the replacement environment in a blue/green deployment.
    */
  var targetInstances: js.UndefOr[TargetInstances] = js.native
  /**
    * Indicates whether only instances that are not running the latest application revision are to be deployed to.
    */
  var updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.native
}

object DeploymentInfo {
  @scala.inline
  def apply(
    additionalDeploymentStatusInfo: AdditionalDeploymentStatusInfo = null,
    applicationName: ApplicationName = null,
    autoRollbackConfiguration: AutoRollbackConfiguration = null,
    blueGreenDeploymentConfiguration: BlueGreenDeploymentConfiguration = null,
    completeTime: Timestamp = null,
    computePlatform: ComputePlatform = null,
    createTime: Timestamp = null,
    creator: DeploymentCreator = null,
    deploymentConfigName: DeploymentConfigName = null,
    deploymentGroupName: DeploymentGroupName = null,
    deploymentId: DeploymentId = null,
    deploymentOverview: DeploymentOverview = null,
    deploymentStatusMessages: DeploymentStatusMessageList = null,
    deploymentStyle: DeploymentStyle = null,
    description: Description = null,
    errorInformation: ErrorInformation = null,
    externalId: ExternalId = null,
    fileExistsBehavior: FileExistsBehavior = null,
    ignoreApplicationStopFailures: js.UndefOr[Boolean] = js.undefined,
    instanceTerminationWaitTimeStarted: js.UndefOr[Boolean] = js.undefined,
    loadBalancerInfo: LoadBalancerInfo = null,
    previousRevision: RevisionLocation = null,
    revision: RevisionLocation = null,
    rollbackInfo: RollbackInfo = null,
    startTime: Timestamp = null,
    status: DeploymentStatus = null,
    targetInstances: TargetInstances = null,
    updateOutdatedInstancesOnly: js.UndefOr[Boolean] = js.undefined
  ): DeploymentInfo = {
    val __obj = js.Dynamic.literal()
    if (additionalDeploymentStatusInfo != null) __obj.updateDynamic("additionalDeploymentStatusInfo")(additionalDeploymentStatusInfo.asInstanceOf[js.Any])
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (autoRollbackConfiguration != null) __obj.updateDynamic("autoRollbackConfiguration")(autoRollbackConfiguration.asInstanceOf[js.Any])
    if (blueGreenDeploymentConfiguration != null) __obj.updateDynamic("blueGreenDeploymentConfiguration")(blueGreenDeploymentConfiguration.asInstanceOf[js.Any])
    if (completeTime != null) __obj.updateDynamic("completeTime")(completeTime.asInstanceOf[js.Any])
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName.asInstanceOf[js.Any])
    if (deploymentGroupName != null) __obj.updateDynamic("deploymentGroupName")(deploymentGroupName.asInstanceOf[js.Any])
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (deploymentOverview != null) __obj.updateDynamic("deploymentOverview")(deploymentOverview.asInstanceOf[js.Any])
    if (deploymentStatusMessages != null) __obj.updateDynamic("deploymentStatusMessages")(deploymentStatusMessages.asInstanceOf[js.Any])
    if (deploymentStyle != null) __obj.updateDynamic("deploymentStyle")(deploymentStyle.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errorInformation != null) __obj.updateDynamic("errorInformation")(errorInformation.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (fileExistsBehavior != null) __obj.updateDynamic("fileExistsBehavior")(fileExistsBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreApplicationStopFailures)) __obj.updateDynamic("ignoreApplicationStopFailures")(ignoreApplicationStopFailures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(instanceTerminationWaitTimeStarted)) __obj.updateDynamic("instanceTerminationWaitTimeStarted")(instanceTerminationWaitTimeStarted.get.asInstanceOf[js.Any])
    if (loadBalancerInfo != null) __obj.updateDynamic("loadBalancerInfo")(loadBalancerInfo.asInstanceOf[js.Any])
    if (previousRevision != null) __obj.updateDynamic("previousRevision")(previousRevision.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (rollbackInfo != null) __obj.updateDynamic("rollbackInfo")(rollbackInfo.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetInstances != null) __obj.updateDynamic("targetInstances")(targetInstances.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOutdatedInstancesOnly)) __obj.updateDynamic("updateOutdatedInstancesOnly")(updateOutdatedInstancesOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentInfo]
  }
}

