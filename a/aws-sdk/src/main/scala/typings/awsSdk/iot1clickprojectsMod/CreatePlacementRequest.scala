package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlacementRequest extends StObject {
  
  /**
    * Optional user-defined key/value pairs providing contextual data (such as location or function) for the placement.
    */
  var attributes: js.UndefOr[PlacementAttributeMap] = js.undefined
  
  /**
    * The name of the placement to be created.
    */
  var placementName: PlacementName
  
  /**
    * The name of the project in which to create the placement.
    */
  var projectName: ProjectName
}
object CreatePlacementRequest {
  
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): CreatePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlacementRequest]
  }
  
  @scala.inline
  implicit class CreatePlacementRequestMutableBuilder[Self <: CreatePlacementRequest] (val x: Self) extends AnyVal {
    
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
