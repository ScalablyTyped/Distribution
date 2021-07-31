package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentConfigInput extends StObject {
  
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account.
    */
  var deploymentConfigName: DeploymentConfigName
}
object GetDeploymentConfigInput {
  
  @scala.inline
  def apply(deploymentConfigName: DeploymentConfigName): GetDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentConfigInput]
  }
  
  @scala.inline
  implicit class GetDeploymentConfigInputMutableBuilder[Self <: GetDeploymentConfigInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentConfigName(value: DeploymentConfigName): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
  }
}
