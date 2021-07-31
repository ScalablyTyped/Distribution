package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHITsRequest extends StObject {
  
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListHITsRequest {
  
  @scala.inline
  def apply(): ListHITsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHITsRequest]
  }
  
  @scala.inline
  implicit class ListHITsRequestMutableBuilder[Self <: ListHITsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
