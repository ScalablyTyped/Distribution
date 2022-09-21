package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEdgeDeploymentPlansResponse extends StObject {
  
  /**
    * List of summaries of edge deployment plans.
    */
  var EdgeDeploymentPlanSummaries: typings.awsSdk.sagemakerMod.EdgeDeploymentPlanSummaries
  
  /**
    * The token to use when calling the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object ListEdgeDeploymentPlansResponse {
  
  inline def apply(EdgeDeploymentPlanSummaries: EdgeDeploymentPlanSummaries): ListEdgeDeploymentPlansResponse = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanSummaries = EdgeDeploymentPlanSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEdgeDeploymentPlansResponse]
  }
  
  extension [Self <: ListEdgeDeploymentPlansResponse](x: Self) {
    
    inline def setEdgeDeploymentPlanSummaries(value: EdgeDeploymentPlanSummaries): Self = StObject.set(x, "EdgeDeploymentPlanSummaries", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPlanSummariesVarargs(value: EdgeDeploymentPlanSummary*): Self = StObject.set(x, "EdgeDeploymentPlanSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
