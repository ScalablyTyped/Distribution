package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncDeploymentJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the synchronization request.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * Information about the deployment application configurations.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined
  
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
  
  /**
    * The failure code if the job fails:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
  
  /**
    * The failure reason if the job fails.
    */
  var failureReason: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the synchronization job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.undefined
}
object SyncDeploymentJobResponse {
  
  @scala.inline
  def apply(): SyncDeploymentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncDeploymentJobResponse]
  }
  
  @scala.inline
  implicit class SyncDeploymentJobResponseMutableBuilder[Self <: SyncDeploymentJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = StObject.set(x, "deploymentApplicationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentApplicationConfigsUndefined: Self = StObject.set(x, "deploymentApplicationConfigs", js.undefined)
    
    @scala.inline
    def setDeploymentApplicationConfigsVarargs(value: DeploymentApplicationConfig*): Self = StObject.set(x, "deploymentApplicationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
    
    @scala.inline
    def setFailureCode(value: DeploymentJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: GenericString): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
    
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
