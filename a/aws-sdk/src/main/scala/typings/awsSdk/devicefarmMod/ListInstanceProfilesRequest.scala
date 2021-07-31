package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceProfilesRequest extends StObject {
  
  /**
    * An integer that specifies the maximum number of items you want to return in the API response.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListInstanceProfilesRequest {
  
  @scala.inline
  def apply(): ListInstanceProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceProfilesRequest]
  }
  
  @scala.inline
  implicit class ListInstanceProfilesRequestMutableBuilder[Self <: ListInstanceProfilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
