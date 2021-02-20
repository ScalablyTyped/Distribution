package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementSummary extends StObject {
  
  /**
    * The date when the placement was originally created, in UNIX epoch time format.
    */
  var createdDate: Time = js.native
  
  /**
    * The name of the placement being summarized.
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
object PlacementSummary {
  
  @scala.inline
  def apply(createdDate: Time, placementName: PlacementName, projectName: ProjectName, updatedDate: Time): PlacementSummary = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementSummary]
  }
  
  @scala.inline
  implicit class PlacementSummaryMutableBuilder[Self <: PlacementSummary] (val x: Self) extends AnyVal {
    
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
