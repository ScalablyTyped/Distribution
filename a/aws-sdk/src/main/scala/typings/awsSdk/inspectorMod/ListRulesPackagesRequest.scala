package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesPackagesRequest extends StObject {
  
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListMaxResults] = js.undefined
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListRulesPackages action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListRulesPackagesRequest {
  
  @scala.inline
  def apply(): ListRulesPackagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesPackagesRequest]
  }
  
  @scala.inline
  implicit class ListRulesPackagesRequestMutableBuilder[Self <: ListRulesPackagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
