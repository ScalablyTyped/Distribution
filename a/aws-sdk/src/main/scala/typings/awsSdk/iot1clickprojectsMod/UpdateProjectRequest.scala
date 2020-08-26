package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    * An optional user-defined description for the project.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * An object defining the project update. Once a project has been created, you cannot add device template names to the project. However, for a given placementTemplate, you can update the associated callbackOverrides for the device definition using this API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.native
  /**
    * The name of the project to be updated.
    */
  var projectName: ProjectName = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(projectName: ProjectName): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  @scala.inline
  implicit class UpdateProjectRequestOps[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
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
    def setProjectName(value: ProjectName): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setPlacementTemplate(value: PlacementTemplate): Self = this.set("placementTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementTemplate: Self = this.set("placementTemplate", js.undefined)
  }
  
}

