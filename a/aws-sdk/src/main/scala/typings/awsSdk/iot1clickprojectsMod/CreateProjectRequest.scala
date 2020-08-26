package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectRequest extends js.Object {
  /**
    * An optional description for the project.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The schema defining the placement to be created. A placement template defines placement default attributes and device templates. You cannot add or remove device templates after the project has been created. However, you can update callbackOverrides for the device templates using the UpdateProject API.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.native
  /**
    * The name of the project to create.
    */
  var projectName: ProjectName = js.native
  /**
    * Optional tags (metadata key/value pairs) to be associated with the project. For example, { {"key1": "value1", "key2": "value2"} }. For more information, see AWS Tagging Strategies.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateProjectRequest {
  @scala.inline
  def apply(projectName: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  @scala.inline
  implicit class CreateProjectRequestOps[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

