package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new project. You can use the ARN to configure IAM access to the project. 
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectArn] = js.native
}

object CreateProjectResponse {
  @scala.inline
  def apply(): CreateProjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectResponse]
  }
  @scala.inline
  implicit class CreateProjectResponseOps[Self <: CreateProjectResponse] (val x: Self) extends AnyVal {
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
    def setProjectArn(value: ProjectArn): Self = this.set("ProjectArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectArn: Self = this.set("ProjectArn", js.undefined)
  }
  
}

