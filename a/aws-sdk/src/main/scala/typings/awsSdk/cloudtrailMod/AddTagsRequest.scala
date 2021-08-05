package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsRequest extends StObject {
  
  /**
    * Specifies the ARN of the trail to which one or more tags will be added. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String
  
  /**
    * Contains a list of CloudTrail tags, up to a limit of 50
    */
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.undefined
}
object AddTagsRequest {
  
  inline def apply(ResourceId: String): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
  
  extension [Self <: AddTagsRequest](x: Self) {
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTagsList(value: TagsList): Self = StObject.set(x, "TagsList", value.asInstanceOf[js.Any])
    
    inline def setTagsListUndefined: Self = StObject.set(x, "TagsList", js.undefined)
    
    inline def setTagsListVarargs(value: Tag*): Self = StObject.set(x, "TagsList", js.Array(value :_*))
  }
}
