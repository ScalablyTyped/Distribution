package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePlacementRequest extends js.Object {
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
  implicit class DeletePlacementRequestOps[Self <: DeletePlacementRequest] (val x: Self) extends AnyVal {
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
    def setPlacementName(value: PlacementName): Self = this.set("placementName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectName(value: ProjectName): Self = this.set("projectName", value.asInstanceOf[js.Any])
  }
  
}

