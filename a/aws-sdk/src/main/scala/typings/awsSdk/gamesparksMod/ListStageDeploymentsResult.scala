package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStageDeploymentsResult extends StObject {
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use this value when making the next call to this operation to continue where the last one finished. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.gamesparksMod.NextToken] = js.undefined
  
  /**
    *  A list of stage deployment summaries. You can use the deployment IDs in the UpdateStageDeployment and GetStageDeployment actions. 
    */
  var StageDeployments: js.UndefOr[StageDeploymentList] = js.undefined
}
object ListStageDeploymentsResult {
  
  inline def apply(): ListStageDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStageDeploymentsResult]
  }
  
  extension [Self <: ListStageDeploymentsResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStageDeployments(value: StageDeploymentList): Self = StObject.set(x, "StageDeployments", value.asInstanceOf[js.Any])
    
    inline def setStageDeploymentsUndefined: Self = StObject.set(x, "StageDeployments", js.undefined)
    
    inline def setStageDeploymentsVarargs(value: StageDeploymentSummary*): Self = StObject.set(x, "StageDeployments", js.Array(value*))
  }
}
