package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class UntagProjectRequestOps[Self <: UntagProjectRequest] (val x: Self) extends AnyVal {
    
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
    def setTagsVarargs(value: TagKey*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagKeys): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
