package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetDeploymentsResponse extends StObject {
  
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.undefined
}
object ResetDeploymentsResponse {
  
  @scala.inline
  def apply(): ResetDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDeploymentsResponse]
  }
  
  @scala.inline
  implicit class ResetDeploymentsResponseMutableBuilder[Self <: ResetDeploymentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentArn(value: string): Self = StObject.set(x, "DeploymentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentArnUndefined: Self = StObject.set(x, "DeploymentArn", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
  }
}
