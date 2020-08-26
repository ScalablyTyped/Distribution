package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDescription extends js.Object {
  /**
    * The Unix timestamp for the date and time that the project was created.
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.native
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectArn] = js.native
  /**
    * The current status of the project.
    */
  var Status: js.UndefOr[ProjectStatus] = js.native
}

object ProjectDescription {
  @scala.inline
  def apply(): ProjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDescription]
  }
  @scala.inline
  implicit class ProjectDescriptionOps[Self <: ProjectDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTimestamp(value: DateTime): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    @scala.inline
    def setProjectArn(value: ProjectArn): Self = this.set("ProjectArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectArn: Self = this.set("ProjectArn", js.undefined)
    @scala.inline
    def setStatus(value: ProjectStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

