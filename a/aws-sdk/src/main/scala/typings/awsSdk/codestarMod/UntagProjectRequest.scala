package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagProjectRequest extends js.Object {
  /**
    * The ID of the project to remove tags from.
    */
  var id: ProjectId = js.native
  /**
    * The tags to remove from the project.
    */
  var tags: TagKeys = js.native
}

object UntagProjectRequest {
  @scala.inline
  def apply(id: ProjectId, tags: TagKeys): UntagProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagProjectRequest]
  }
}

