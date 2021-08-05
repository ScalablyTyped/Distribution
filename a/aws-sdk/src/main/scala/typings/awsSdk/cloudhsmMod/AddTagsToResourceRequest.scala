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
  
  inline def apply(ResourceArn: String, TagList: TagList): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
  
  extension [Self <: AddTagsToResourceRequest](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
