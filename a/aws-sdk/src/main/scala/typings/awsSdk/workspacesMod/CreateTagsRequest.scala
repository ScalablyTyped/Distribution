package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTagsRequest extends StObject {
  
  /**
    * The identifier of the WorkSpaces resource. The supported resource types are WorkSpaces, registered directories, images, custom bundles, IP access control groups, and connection aliases.
    */
  var ResourceId: NonEmptyString
  
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: TagList
}
object CreateTagsRequest {
  
  @scala.inline
  def apply(ResourceId: NonEmptyString, Tags: TagList): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  
  @scala.inline
  implicit class CreateTagsRequestMutableBuilder[Self <: CreateTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
