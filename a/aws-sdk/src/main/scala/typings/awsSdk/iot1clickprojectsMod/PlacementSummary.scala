package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementSummary extends js.Object {
  
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
  implicit class PlacementSummaryOps[Self <: PlacementSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedDate(value: Time): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementName(value: PlacementName): Self = this.set("placementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = this.set("projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Time): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
  }
}
