package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsRequest extends StObject {
  
  /**
    * The identifier of the WorkSpaces resource. The supported resource types are WorkSpaces, registered directories, images, custom bundles, IP access control groups, and connection aliases.
    */
  var ResourceId: NonEmptyString
  
  /**
    * The tag keys.
    */
  var TagKeys: TagKeyList
}
object DeleteTagsRequest {
  
  @scala.inline
  def apply(ResourceId: NonEmptyString, TagKeys: TagKeyList): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsRequest]
  }
  
  @scala.inline
  implicit class DeleteTagsRequestMutableBuilder[Self <: DeleteTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: NonEmptyString*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
