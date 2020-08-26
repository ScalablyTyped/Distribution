package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDescription extends js.Object {
  /**
    * The ARN of the project.
    */
  var arn: js.UndefOr[ProjectArn] = js.native
  /**
    * The date when the project was originally created, in UNIX epoch time format.
    */
  var createdDate: Time = js.native
  /**
    * The description of the project.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * An object describing the project's placement specifications.
    */
  var placementTemplate: js.UndefOr[PlacementTemplate] = js.native
  /**
    * The name of the project for which to obtain information from.
    */
  var projectName: ProjectName = js.native
  /**
    * The tags (metadata key/value pairs) associated with the project.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: Time = js.native
}

object ProjectDescription {
  @scala.inline
  def apply(createdDate: Time, projectName: ProjectName, updatedDate: Time): ProjectDescription = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDescription]
  }
  @scala.inline
  implicit class ProjectDescriptionOps[Self <: ProjectDescription] (val x: Self) extends AnyVal {
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
    def setProjectName(value: ProjectName): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedDate(value: Time): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: ProjectArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
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

