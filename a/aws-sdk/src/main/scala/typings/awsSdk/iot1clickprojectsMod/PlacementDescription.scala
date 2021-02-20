package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementDescription extends StObject {
  
  /**
    * The user-defined attributes associated with the placement.
    */
  var attributes: PlacementAttributeMap = js.native
  
  /**
    * The date when the placement was initially created, in UNIX epoch time format.
    */
  var createdDate: Time = js.native
  
  /**
    * The name of the placement.
    */
  var placementName: PlacementName = js.native
  
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName = js.native
  
  /**
    * The date when the placement was last updated, in UNIX epoch time format. If the placement was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: Time = js.native
}
object PlacementDescription {
  
  @scala.inline
  def apply(
    attributes: PlacementAttributeMap,
    createdDate: Time,
    placementName: PlacementName,
    projectName: ProjectName,
    updatedDate: Time
  ): PlacementDescription = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementDescription]
  }
  
  @scala.inline
  implicit class PlacementDescriptionMutableBuilder[Self <: PlacementDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: PlacementAttributeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Time): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementName(value: PlacementName): Self = StObject.set(x, "placementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Time): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
  }
}
