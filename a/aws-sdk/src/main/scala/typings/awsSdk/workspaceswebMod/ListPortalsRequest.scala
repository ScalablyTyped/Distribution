package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPortalsRequest extends StObject {
  
  /**
    * The maximum number of results to be included in the next page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListPortalsRequest {
  
  inline def apply(): ListPortalsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPortalsRequest]
  }
  
  extension [Self <: ListPortalsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
