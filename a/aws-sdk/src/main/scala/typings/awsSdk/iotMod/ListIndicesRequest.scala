package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndicesRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[QueryMaxResults] = js.undefined
  
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListIndicesRequest {
  
  @scala.inline
  def apply(): ListIndicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesRequest]
  }
  
  @scala.inline
  implicit class ListIndicesRequestMutableBuilder[Self <: ListIndicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: QueryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
