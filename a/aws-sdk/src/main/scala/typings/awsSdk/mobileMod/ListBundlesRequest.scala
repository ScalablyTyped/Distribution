package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBundlesRequest extends StObject {
  
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  Pagination token. Set to null to start listing bundles from start. If non-null pagination token is returned in a result, then pass its value in here in another request to list more bundles. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBundlesRequest {
  
  @scala.inline
  def apply(): ListBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBundlesRequest]
  }
  
  @scala.inline
  implicit class ListBundlesRequestMutableBuilder[Self <: ListBundlesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
