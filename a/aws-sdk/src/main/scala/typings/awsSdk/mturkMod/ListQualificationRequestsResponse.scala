package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQualificationRequestsResponse extends StObject {
  
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The number of Qualification requests on this page in the filtered results list, equivalent to the number of Qualification requests being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Qualification request. The response includes one QualificationRequest element for each Qualification request returned by the query.
    */
  var QualificationRequests: js.UndefOr[QualificationRequestList] = js.undefined
}
object ListQualificationRequestsResponse {
  
  @scala.inline
  def apply(): ListQualificationRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationRequestsResponse]
  }
  
  @scala.inline
  implicit class ListQualificationRequestsResponseMutableBuilder[Self <: ListQualificationRequestsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
    
    @scala.inline
    def setQualificationRequests(value: QualificationRequestList): Self = StObject.set(x, "QualificationRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationRequestsUndefined: Self = StObject.set(x, "QualificationRequests", js.undefined)
    
    @scala.inline
    def setQualificationRequestsVarargs(value: QualificationRequest*): Self = StObject.set(x, "QualificationRequests", js.Array(value :_*))
  }
}
