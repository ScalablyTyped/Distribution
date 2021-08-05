package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicesInPlacementRequest extends StObject {
  
  /**
    * The name of the placement to get the devices from.
    */
  var placementName: PlacementName
  
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName
}
object GetDevicesInPlacementRequest {
  
  inline def apply(placementName: PlacementName, projectName: ProjectName): GetDevicesInPlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesInPlacementRequest]
  }
  
  extension [Self <: GetDevicesInPlacementRequest](x: Self) {
    
    inline def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
