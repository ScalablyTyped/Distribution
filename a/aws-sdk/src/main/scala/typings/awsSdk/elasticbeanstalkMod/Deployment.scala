package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * The ID of the deployment. This number increases by one each time that you deploy source code or change instance configuration settings.
    */
  var DeploymentId: js.UndefOr[NullableLong] = js.undefined
  
  /**
    * For in-progress deployments, the time that the deployment started. For completed deployments, the time that the deployment ended.
    */
  var DeploymentTime: js.UndefOr[DeploymentTimestamp] = js.undefined
  
  /**
    * The status of the deployment:    In Progress : The deployment is in progress.    Deployed : The deployment succeeded.    Failed : The deployment failed.  
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The version label of the application version in the deployment.
    */
  var VersionLabel: js.UndefOr[String] = js.undefined
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: NullableLong): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDeploymentTime(value: DeploymentTimestamp): Self = StObject.set(x, "DeploymentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTimeUndefined: Self = StObject.set(x, "DeploymentTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionLabel(value: String): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
