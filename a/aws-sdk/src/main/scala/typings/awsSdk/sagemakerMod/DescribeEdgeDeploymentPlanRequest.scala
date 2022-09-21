package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEdgeDeploymentPlanRequest extends StObject {
  
  /**
    * The name of the deployment plan to describe.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * The maximum number of results to select (50 by default).
    */
  var MaxResults: js.UndefOr[DeploymentStageMaxResults] = js.undefined
  
  /**
    * If the edge deployment plan has enough stages to require tokening, then this is the response from the last list of stages returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
}
object DescribeEdgeDeploymentPlanRequest {
  
  inline def apply(EdgeDeploymentPlanName: EntityName): DescribeEdgeDeploymentPlanRequest = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEdgeDeploymentPlanRequest]
  }
  
  extension [Self <: DescribeEdgeDeploymentPlanRequest](x: Self) {
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: DeploymentStageMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
