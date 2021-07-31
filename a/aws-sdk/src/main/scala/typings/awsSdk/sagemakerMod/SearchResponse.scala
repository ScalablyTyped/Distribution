package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponse extends StObject {
  
  /**
    * If the result of the previous Search request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of SearchRecord objects.
    */
  var Results: js.UndefOr[SearchResultsList] = js.undefined
}
object SearchResponse {
  
  @scala.inline
  def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit class SearchResponseMutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResults(value: SearchResultsList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SearchRecord*): Self = StObject.set(x, "Results", js.Array(value :_*))
  }
}
