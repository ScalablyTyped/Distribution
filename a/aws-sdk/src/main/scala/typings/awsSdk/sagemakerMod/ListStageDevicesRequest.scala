package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStageDevicesRequest extends StObject {
  
  /**
    * The name of the edge deployment plan.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * Toggle for excluding devices deployed in other stages.
    */
  var ExcludeDevicesDeployedInOtherStage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of requests to select.
    */
  var MaxResults: js.UndefOr[ListMaxResults] = js.undefined
  
  /**
    * The response from the last list when returning a list large enough to neeed tokening.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The name of the stage in the deployment.
    */
  var StageName: EntityName
}
object ListStageDevicesRequest {
  
  inline def apply(EdgeDeploymentPlanName: EntityName, StageName: EntityName): ListStageDevicesRequest = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStageDevicesRequest]
  }
  
  extension [Self <: ListStageDevicesRequest](x: Self) {
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setExcludeDevicesDeployedInOtherStage(value: Boolean): Self = StObject.set(x, "ExcludeDevicesDeployedInOtherStage", value.asInstanceOf[js.Any])
    
    inline def setExcludeDevicesDeployedInOtherStageUndefined: Self = StObject.set(x, "ExcludeDevicesDeployedInOtherStage", js.undefined)
    
    inline def setMaxResults(value: ListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStageName(value: EntityName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
