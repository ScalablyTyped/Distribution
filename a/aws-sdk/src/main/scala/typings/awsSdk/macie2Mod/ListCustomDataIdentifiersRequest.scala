package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomDataIdentifiersRequest extends StObject {
  
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.undefined
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListCustomDataIdentifiersRequest {
  
  @scala.inline
  def apply(): ListCustomDataIdentifiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomDataIdentifiersRequest]
  }
  
  @scala.inline
  implicit class ListCustomDataIdentifiersRequestMutableBuilder[Self <: ListCustomDataIdentifiersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
