package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS CloudHSM resource to tag.
    */
  var ResourceArn: String
  
  /**
    * One or more tags.
    */
  var TagList: typings.awsSdk.cloudhsmMod.TagList
}
object AddTagsToResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: String, TagList: TagList): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
  
  @scala.inline
  implicit class AddTagsToResourceRequestMutableBuilder[Self <: AddTagsToResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
