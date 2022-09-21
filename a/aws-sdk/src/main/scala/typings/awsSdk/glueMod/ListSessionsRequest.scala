package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSessionsRequest extends StObject {
  
  /**
    * The maximum number of results. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more result. 
    */
  var NextToken: js.UndefOr[OrchestrationToken] = js.undefined
  
  /**
    * The origin of the request. 
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * Tags belonging to the session. 
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object ListSessionsRequest {
  
  inline def apply(): ListSessionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSessionsRequest]
  }
  
  extension [Self <: ListSessionsRequest](x: Self) {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: OrchestrationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
