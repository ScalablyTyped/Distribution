package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectRequest extends js.Object {
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId = js.native
}

object DeleteProjectRequest {
  @scala.inline
  def apply(projectId: ProjectId): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProjectRequest]
  }
}

