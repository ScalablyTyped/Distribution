package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPoliciesResponse extends StObject {
  
  /**
    * If you have more PolicySummary objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicySummary objects, submit another ListPolicies request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array of PolicySummary objects.
    */
  var PolicyList: js.UndefOr[PolicySummaryList] = js.native
}
object ListPoliciesResponse {
  
  @scala.inline
  def apply(): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListPoliciesResponseMutableBuilder[Self <: ListPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPolicyList(value: PolicySummaryList): Self = StObject.set(x, "PolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyListUndefined: Self = StObject.set(x, "PolicyList", js.undefined)
    
    @scala.inline
    def setPolicyListVarargs(value: PolicySummary*): Self = StObject.set(x, "PolicyList", js.Array(value :_*))
  }
}
