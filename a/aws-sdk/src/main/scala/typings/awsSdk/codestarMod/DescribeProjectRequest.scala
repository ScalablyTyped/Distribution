package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectRequest extends js.Object {
  /**
    * The ID of the project.
    */
  var id: ProjectId = js.native
}

object DescribeProjectRequest {
  @scala.inline
  def apply(id: ProjectId): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
}

