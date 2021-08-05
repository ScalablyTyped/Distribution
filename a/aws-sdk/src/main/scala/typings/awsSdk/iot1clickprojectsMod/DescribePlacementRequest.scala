package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlacementRequest extends StObject {
  
  /**
    * The name of the placement within a project.
    */
  var placementName: PlacementName
  
  /**
    * The project containing the placement to be described.
    */
  var projectName: ProjectName
}
object DescribePlacementRequest {
  
  inline def apply(placementName: PlacementName, projectName: ProjectName): DescribePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlacementRequest]
  }
  
  extension [Self <: DescribePlacementRequest](x: Self) {
    
    inline def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
