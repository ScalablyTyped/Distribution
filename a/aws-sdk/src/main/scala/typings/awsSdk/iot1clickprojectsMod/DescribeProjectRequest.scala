package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectRequest extends js.Object {
  /**
    * The name of the project to be described.
    */
  var projectName: ProjectName = js.native
}

object DescribeProjectRequest {
  @scala.inline
  def apply(projectName: ProjectName): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  @scala.inline
  implicit class DescribeProjectRequestOps[Self <: DescribeProjectRequest] (val x: Self) extends AnyVal {
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
  }
  
}

