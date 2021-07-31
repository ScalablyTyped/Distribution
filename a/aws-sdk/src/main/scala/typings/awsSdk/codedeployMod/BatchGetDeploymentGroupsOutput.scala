package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDeploymentGroupsOutput extends StObject {
  
  /**
    * Information about the deployment groups.
    */
  var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList] = js.undefined
  
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
}
object BatchGetDeploymentGroupsOutput {
  
  @scala.inline
  def apply(): BatchGetDeploymentGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDeploymentGroupsOutput]
  }
  
  @scala.inline
  implicit class BatchGetDeploymentGroupsOutputMutableBuilder[Self <: BatchGetDeploymentGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentGroupsInfo(value: DeploymentGroupInfoList): Self = StObject.set(x, "deploymentGroupsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupsInfoUndefined: Self = StObject.set(x, "deploymentGroupsInfo", js.undefined)
    
    @scala.inline
    def setDeploymentGroupsInfoVarargs(value: DeploymentGroupInfo*): Self = StObject.set(x, "deploymentGroupsInfo", js.Array(value :_*))
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
