package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePlacementRequest extends js.Object {
  /**
    * The user-defined object of attributes used to update the placement. The maximum number of key/value pairs is 50.
    */
  var attributes: js.UndefOr[PlacementAttributeMap] = js.native
  /**
    * The name of the placement to update.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project containing the placement to be updated.
    */
  var projectName: ProjectName = js.native
}

object UpdatePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): UpdatePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePlacementRequest]
  }
  @scala.inline
  implicit class UpdatePlacementRequestOps[Self <: UpdatePlacementRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setAttributes(value: PlacementAttributeMap): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
  
}

