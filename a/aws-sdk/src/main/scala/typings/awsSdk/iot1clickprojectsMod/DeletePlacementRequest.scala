package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePlacementRequest extends StObject {
  
  /**
    * The name of the empty placement to delete.
    */
  var placementName: PlacementName = js.native
  
  /**
    * The project containing the empty placement to delete.
    */
  var projectName: ProjectName = js.native
}
object DeletePlacementRequest {
  
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): DeletePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlacementRequest]
  }
  
  @scala.inline
  implicit class DeletePlacementRequestMutableBuilder[Self <: DeletePlacementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
