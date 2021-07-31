package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeploymentConfigInput extends StObject {
  
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account.
    */
  var deploymentConfigName: DeploymentConfigName
}
object DeleteDeploymentConfigInput {
  
  @scala.inline
  def apply(deploymentConfigName: DeploymentConfigName): DeleteDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentConfigInput]
  }
  
  @scala.inline
  implicit class DeleteDeploymentConfigInputMutableBuilder[Self <: DeleteDeploymentConfigInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
  }
}
