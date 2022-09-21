package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLFTagsResponse extends StObject {
  
  /**
    * A list of LF-tags that the requested has permission to view.
    */
  var LFTags: js.UndefOr[LFTagsList] = js.undefined
  
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListLFTagsResponse {
  
  inline def apply(): ListLFTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLFTagsResponse]
  }
  
  extension [Self <: ListLFTagsResponse](x: Self) {
    
    inline def setLFTags(value: LFTagsList): Self = StObject.set(x, "LFTags", value.asInstanceOf[js.Any])
    
    inline def setLFTagsUndefined: Self = StObject.set(x, "LFTags", js.undefined)
    
    inline def setLFTagsVarargs(value: LFTagPair*): Self = StObject.set(x, "LFTags", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
