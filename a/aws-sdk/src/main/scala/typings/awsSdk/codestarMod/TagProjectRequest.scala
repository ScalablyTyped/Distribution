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
  @scala.inline
  implicit class TagProjectRequestOps[Self <: TagProjectRequest] (val x: Self) extends AnyVal {
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
    def setId(value: ProjectId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

