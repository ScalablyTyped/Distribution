package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentTargetsOutput extends StObject {
  
  /**
    *  If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent ListDeploymentTargets call to return the next set of deployment targets in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  The unique IDs of deployment targets. 
    */
  var targetIds: js.UndefOr[TargetIdList] = js.undefined
}
object ListDeploymentTargetsOutput {
  
  @scala.inline
  def apply(): ListDeploymentTargetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentTargetsOutput]
  }
  
  @scala.inline
  implicit class ListDeploymentTargetsOutputMutableBuilder[Self <: ListDeploymentTargetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTargetIds(value: TargetIdList): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    @scala.inline
    def setTargetIdsVarargs(value: TargetId*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
  }
}
