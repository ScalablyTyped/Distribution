package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncDeploymentJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the synchronization request.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  /**
    * Information about the deployment application configurations.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.native
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
  /**
    * The failure code if the job fails:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  /**
    * The failure reason if the job fails.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.native
  /**
    * The status of the synchronization job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
}

object SyncDeploymentJobResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    createdAt: CreatedAt = null,
    deploymentApplicationConfigs: DeploymentApplicationConfigs = null,
    deploymentConfig: DeploymentConfig = null,
    failureCode: DeploymentJobErrorCode = null,
    failureReason: GenericString = null,
    fleet: Arn = null,
    status: DeploymentStatus = null
  ): SyncDeploymentJobResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (deploymentApplicationConfigs != null) __obj.updateDynamic("deploymentApplicationConfigs")(deploymentApplicationConfigs.asInstanceOf[js.Any])
    if (deploymentConfig != null) __obj.updateDynamic("deploymentConfig")(deploymentConfig.asInstanceOf[js.Any])
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (fleet != null) __obj.updateDynamic("fleet")(fleet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncDeploymentJobResponse]
  }
}

