package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentGroupsInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
    */
  var applicationName: ApplicationName
  
  /**
    * The names of the deployment groups.
    */
  var deploymentGroupNames: DeploymentGroupsList
}
object BatchGetDeploymentGroupsInput {
  
  inline def apply(applicationName: ApplicationName, deploymentGroupNames: DeploymentGroupsList): BatchGetDeploymentGroupsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupNames = deploymentGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentGroupsInput]
  }
  
  extension [Self <: BatchGetDeploymentGroupsInput](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupNames(value: DeploymentGroupsList): Self = StObject.set(x, "deploymentGroupNames", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupNamesVarargs(value: DeploymentGroupName*): Self = StObject.set(x, "deploymentGroupNames", js.Array(value :_*))
  }
}
