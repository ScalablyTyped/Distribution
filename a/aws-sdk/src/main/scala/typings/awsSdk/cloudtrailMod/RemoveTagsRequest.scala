package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsRequest extends StObject {
  
  /**
    * Specifies the ARN of the trail from which tags should be removed. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String
  
  /**
    * Specifies a list of tags to be removed.
    */
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.undefined
}
object RemoveTagsRequest {
  
  inline def apply(ResourceId: String): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsRequest]
  }
  
  extension [Self <: RemoveTagsRequest](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    inline def setTagsListUndefined: Self = StObject.set(x, "TagsList", js.undefined)
    
    inline def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value :_*))
  }
}
