package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentTargetsInput extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  A token identifier returned from the previous ListDeploymentTargets call. It can be used to return the next set of deployment targets in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  A key used to filter the returned targets. The two valid values are:    TargetStatus - A TargetStatus filter string can be Failed, InProgress, Pending, Ready, Skipped, Succeeded, or Unknown.     ServerInstanceLabel - A ServerInstanceLabel filter string can be Blue or Green.   
    */
  var targetFilters: js.UndefOr[TargetFilters] = js.undefined
}
object ListDeploymentTargetsInput {
  
  @scala.inline
  def apply(): ListDeploymentTargetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentTargetsInput]
  }
  
  @scala.inline
  implicit class ListDeploymentTargetsInputMutableBuilder[Self <: ListDeploymentTargetsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTargetFilters(value: TargetFilters): Self = StObject.set(x, "targetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFiltersUndefined: Self = StObject.set(x, "targetFilters", js.undefined)
  }
}
