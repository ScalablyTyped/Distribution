package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEdgeDeploymentPlanRequest extends StObject {
  
  /**
    * The name of the edge deployment plan to delete.
    */
  var EdgeDeploymentPlanName: EntityName
}
object DeleteEdgeDeploymentPlanRequest {
  
  inline def apply(EdgeDeploymentPlanName: EntityName): DeleteEdgeDeploymentPlanRequest = {
    val __obj = js.Dynamic.literal(EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEdgeDeploymentPlanRequest]
  }
  
  extension [Self <: DeleteEdgeDeploymentPlanRequest](x: Self) {
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
  }
}
