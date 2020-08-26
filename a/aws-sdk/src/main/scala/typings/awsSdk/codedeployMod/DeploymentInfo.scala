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
  def apply(): DeploymentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentInfo]
  }
  @scala.inline
  implicit class DeploymentInfoOps[Self <: DeploymentInfo] (val x: Self) extends AnyVal {
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
    def setAdditionalDeploymentStatusInfo(value: AdditionalDeploymentStatusInfo): Self = this.set("additionalDeploymentStatusInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalDeploymentStatusInfo: Self = this.set("additionalDeploymentStatusInfo", js.undefined)
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    @scala.inline
    def setAutoRollbackConfiguration(value: AutoRollbackConfiguration): Self = this.set("autoRollbackConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRollbackConfiguration: Self = this.set("autoRollbackConfiguration", js.undefined)
    @scala.inline
    def setBlueGreenDeploymentConfiguration(value: BlueGreenDeploymentConfiguration): Self = this.set("blueGreenDeploymentConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueGreenDeploymentConfiguration: Self = this.set("blueGreenDeploymentConfiguration", js.undefined)
    @scala.inline
    def setCompleteTime(value: Timestamp): Self = this.set("completeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleteTime: Self = this.set("completeTime", js.undefined)
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    @scala.inline
    def setCreateTime(value: Timestamp): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setCreator(value: DeploymentCreator): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = this.set("deploymentConfigName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentConfigName: Self = this.set("deploymentConfigName", js.undefined)
    @scala.inline
    def setDeploymentGroupName(value: DeploymentGroupName): Self = this.set("deploymentGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentGroupName: Self = this.set("deploymentGroupName", js.undefined)
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    @scala.inline
    def setDeploymentOverview(value: DeploymentOverview): Self = this.set("deploymentOverview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentOverview: Self = this.set("deploymentOverview", js.undefined)
    @scala.inline
    def setDeploymentStatusMessagesVarargs(value: ErrorMessage*): Self = this.set("deploymentStatusMessages", js.Array(value :_*))
    @scala.inline
    def setDeploymentStatusMessages(value: DeploymentStatusMessageList): Self = this.set("deploymentStatusMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentStatusMessages: Self = this.set("deploymentStatusMessages", js.undefined)
    @scala.inline
    def setDeploymentStyle(value: DeploymentStyle): Self = this.set("deploymentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentStyle: Self = this.set("deploymentStyle", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setErrorInformation(value: ErrorInformation): Self = this.set("errorInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorInformation: Self = this.set("errorInformation", js.undefined)
    @scala.inline
    def setExternalId(value: ExternalId): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    @scala.inline
    def setFileExistsBehavior(value: FileExistsBehavior): Self = this.set("fileExistsBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileExistsBehavior: Self = this.set("fileExistsBehavior", js.undefined)
    @scala.inline
    def setIgnoreApplicationStopFailures(value: Boolean): Self = this.set("ignoreApplicationStopFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreApplicationStopFailures: Self = this.set("ignoreApplicationStopFailures", js.undefined)
    @scala.inline
    def setInstanceTerminationWaitTimeStarted(value: Boolean): Self = this.set("instanceTerminationWaitTimeStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTerminationWaitTimeStarted: Self = this.set("instanceTerminationWaitTimeStarted", js.undefined)
    @scala.inline
    def setLoadBalancerInfo(value: LoadBalancerInfo): Self = this.set("loadBalancerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerInfo: Self = this.set("loadBalancerInfo", js.undefined)
    @scala.inline
    def setPreviousRevision(value: RevisionLocation): Self = this.set("previousRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousRevision: Self = this.set("previousRevision", js.undefined)
    @scala.inline
    def setRevision(value: RevisionLocation): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    @scala.inline
    def setRollbackInfo(value: RollbackInfo): Self = this.set("rollbackInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollbackInfo: Self = this.set("rollbackInfo", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTargetInstances(value: TargetInstances): Self = this.set("targetInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetInstances: Self = this.set("targetInstances", js.undefined)
    @scala.inline
    def setUpdateOutdatedInstancesOnly(value: Boolean): Self = this.set("updateOutdatedInstancesOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateOutdatedInstancesOnly: Self = this.set("updateOutdatedInstancesOnly", js.undefined)
  }
  
}

