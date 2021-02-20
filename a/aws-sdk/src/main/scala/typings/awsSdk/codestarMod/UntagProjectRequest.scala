package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagProjectRequest extends StObject {
  
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
  implicit class UntagProjectRequestMutableBuilder[Self <: UntagProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagKeys): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: TagKey*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
