package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlacementRequest extends js.Object {
  /**
    * Optional user-defined key/value pairs providing contextual data (such as location or function) for the placement.
    */
  var attributes: js.UndefOr[PlacementAttributeMap] = js.native
  /**
    * The name of the placement to be created.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project in which to create the placement.
    */
  var projectName: ProjectName = js.native
}

object CreatePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): CreatePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlacementRequest]
  }
  @scala.inline
  implicit class CreatePlacementRequestOps[Self <: CreatePlacementRequest] (val x: Self) extends AnyVal {
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

