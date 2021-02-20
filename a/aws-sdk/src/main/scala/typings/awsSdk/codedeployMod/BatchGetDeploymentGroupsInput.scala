package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetDeploymentGroupsInput extends StObject {
  
  /**
    * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  
  /**
    * The names of the deployment groups.
    */
  var deploymentGroupNames: DeploymentGroupsList = js.native
}
object BatchGetDeploymentGroupsInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupNames: DeploymentGroupsList): BatchGetDeploymentGroupsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupNames = deploymentGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentGroupsInput]
  }
  
  @scala.inline
  implicit class BatchGetDeploymentGroupsInputMutableBuilder[Self <: BatchGetDeploymentGroupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupNames(value: DeploymentGroupsList): Self = StObject.set(x, "deploymentGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupNamesVarargs(value: DeploymentGroupName*): Self = StObject.set(x, "deploymentGroupNames", js.Array(value :_*))
  }
}
