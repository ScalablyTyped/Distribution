package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevicesInPlacementRequest extends js.Object {
  /**
    * The name of the placement to get the devices from.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName = js.native
}

object GetDevicesInPlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): GetDevicesInPlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesInPlacementRequest]
  }
  @scala.inline
  implicit class GetDevicesInPlacementRequestOps[Self <: GetDevicesInPlacementRequest] (val x: Self) extends AnyVal {
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

