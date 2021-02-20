package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMembersResponse extends StObject {
  
  /**
    * The list of member accounts in the behavior graph. The results include member accounts that did not pass verification and member accounts that have not yet accepted the invitation to the behavior graph. The results do not include member accounts that were removed from the behavior graph.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.native
  
  /**
    * If there are more member accounts remaining in the results, then this is the pagination token to use to request the next page of member accounts.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListMembersResponse {
  
  @scala.inline
  def apply(): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersResponse]
  }
  
  @scala.inline
  implicit class ListMembersResponseMutableBuilder[Self <: ListMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberDetails(value: MemberDetailList): Self = StObject.set(x, "MemberDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberDetailsUndefined: Self = StObject.set(x, "MemberDetails", js.undefined)
    
    @scala.inline
    def setMemberDetailsVarargs(value: MemberDetail*): Self = StObject.set(x, "MemberDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
