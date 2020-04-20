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
}

