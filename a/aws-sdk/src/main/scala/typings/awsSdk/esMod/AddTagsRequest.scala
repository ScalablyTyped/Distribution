package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsRequest extends StObject {
  
  /**
    *  Specify the ARN for which you want to add the tags.
    */
  var ARN: typings.awsSdk.esMod.ARN
  
  /**
    *  List of Tag that need to be added for the Elasticsearch domain. 
    */
  var TagList: typings.awsSdk.esMod.TagList
}
object AddTagsRequest {
  
  @scala.inline
  def apply(ARN: ARN, TagList: TagList): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
  
  @scala.inline
  implicit class AddTagsRequestMutableBuilder[Self <: AddTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
