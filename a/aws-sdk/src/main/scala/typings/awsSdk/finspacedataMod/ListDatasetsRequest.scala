package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsRequest extends StObject {
  
  /**
    * The maximum number of results per page.
    */
  var maxResults: js.UndefOr[ResultLimit] = js.undefined
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDatasetsRequest {
  
  inline def apply(): ListDatasetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsRequest]
  }
  
  extension [Self <: ListDatasetsRequest](x: Self) {
    
    inline def setMaxResults(value: ResultLimit): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
