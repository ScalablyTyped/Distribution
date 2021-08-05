package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeploymentGroupInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName
  
  /**
    * The name of a deployment group for the specified application.
    */
  var deploymentGroupName: DeploymentGroupName
}
object DeleteDeploymentGroupInput {
  
  inline def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName): DeleteDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupName = deploymentGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentGroupInput]
  }
  
  extension [Self <: DeleteDeploymentGroupInput](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupName(value: DeploymentGroupName): Self = StObject.set(x, "deploymentGroupName", value.asInstanceOf[js.Any])
  }
}
