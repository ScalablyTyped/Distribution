package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsResponse extends StObject {
  
  /**
    * An opaque string that indicates that the response contains only a subset of tags. Use this value in a subsequent ListTags request to get more tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.NextToken] = js.undefined
  
  /**
    * A list of tags.
    */
  var TagList: typings.awsSdk.cloudhsmv2Mod.TagList
}
object ListTagsResponse {
  
  inline def apply(TagList: TagList): ListTagsResponse = {
    val __obj = js.Dynamic.literal(TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResponse]
  }
  
  extension [Self <: ListTagsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
