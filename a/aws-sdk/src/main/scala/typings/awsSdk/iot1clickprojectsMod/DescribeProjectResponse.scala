package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectResponse extends js.Object {
  /**
    * An object describing the project.
    */
  var project: ProjectDescription = js.native
}

object DescribeProjectResponse {
  @scala.inline
  def apply(project: ProjectDescription): DescribeProjectResponse = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeProjectResponse]
  }
}

