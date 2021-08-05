package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagProjectRequest extends StObject {
  
  /**
    * The ID of the project to remove tags from.
    */
  var id: ProjectId
  
  /**
    * The tags to remove from the project.
    */
  var tags: TagKeys
}
object UntagProjectRequest {
  
  inline def apply(id: ProjectId, tags: TagKeys): UntagProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagProjectRequest]
  }
  
  extension [Self <: UntagProjectRequest](x: Self) {
    
    inline def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagKeys): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: TagKey*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
