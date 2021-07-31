package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePlacementRequest extends StObject {
  
  /**
    * The user-defined object of attributes used to update the placement. The maximum number of key/value pairs is 50.
    */
  var attributes: js.UndefOr[PlacementAttributeMap] = js.undefined
  
  /**
    * The name of the placement to update.
    */
  var placementName: PlacementName
  
  /**
    * The name of the project containing the placement to be updated.
    */
  var projectName: ProjectName
}
object UpdatePlacementRequest {
  
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): UpdatePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePlacementRequest]
  }
  
  @scala.inline
  implicit class UpdatePlacementRequestMutableBuilder[Self <: UpdatePlacementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: PlacementAttributeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
