package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentJob extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the deployment job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined
  
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
  
  /**
    * The deployment job failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
  
  /**
    * A short description of the reason why the deployment job failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the deployment job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.undefined
}
object DeploymentJob {
  
  @scala.inline
  def apply(): DeploymentJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentJob]
  }
  
  @scala.inline
  implicit class DeploymentJobMutableBuilder[Self <: DeploymentJob] (val x: Self) extends AnyVal {
    
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
