package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentGroupInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName
  
  /**
    * The name of a deployment group for the specified application.
    */
  var deploymentGroupName: DeploymentGroupName
}
object GetDeploymentGroupInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName): GetDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentGroupInput]
  }
  
  @scala.inline
  implicit class GetDeploymentGroupInputMutableBuilder[Self <: GetDeploymentGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
  }
}
