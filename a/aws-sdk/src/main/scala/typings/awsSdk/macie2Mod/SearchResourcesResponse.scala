package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesResponse extends StObject {
  
  /**
    * An array of objects, one for each resource that meets the filter criteria specified in the request.
    */
  var matchingResources: js.UndefOr[listOfMatchingResource] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object SearchResourcesResponse {
  
  inline def apply(): SearchResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesResponse]
  }
  
  extension [Self <: SearchResourcesResponse](x: Self) {
    
    inline def setMatchingResources(value: listOfMatchingResource): Self = StObject.set(x, "matchingResources", value.asInstanceOf[js.Any])
    
    inline def setMatchingResourcesUndefined: Self = StObject.set(x, "matchingResources", js.undefined)
    
    inline def setMatchingResourcesVarargs(value: MatchingResource*): Self = StObject.set(x, "matchingResources", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
