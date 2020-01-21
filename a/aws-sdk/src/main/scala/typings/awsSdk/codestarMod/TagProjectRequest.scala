package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagProjectRequest extends js.Object {
  /**
    * The ID of the project you want to add a tag to.
    */
  var id: ProjectId = js.native
  /**
    * The tags you want to add to the project.
    */
  var tags: Tags = js.native
}

object TagProjectRequest {
  @scala.inline
  def apply(id: ProjectId, tags: Tags): TagProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagProjectRequest]
  }
}

