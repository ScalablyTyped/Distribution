package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentInput extends StObject {
  
  /**
    *  The unique ID of a deployment associated with the IAM user or AWS account. 
    */
  var deploymentId: DeploymentId
}
object GetDeploymentInput {
  
  @scala.inline
  def apply(deploymentId: DeploymentId): GetDeploymentInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentInput]
  }
  
  @scala.inline
  implicit class GetDeploymentInputMutableBuilder[Self <: GetDeploymentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
