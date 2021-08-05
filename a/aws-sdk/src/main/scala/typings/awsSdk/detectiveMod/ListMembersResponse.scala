package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersResponse extends StObject {
  
  /**
    * The list of member accounts in the behavior graph. The results include member accounts that did not pass verification and member accounts that have not yet accepted the invitation to the behavior graph. The results do not include member accounts that were removed from the behavior graph.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.undefined
  
  /**
    * If there are more member accounts remaining in the results, then this is the pagination token to use to request the next page of member accounts.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListMembersResponse {
  
  inline def apply(): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersResponse]
  }
  
  extension [Self <: ListMembersResponse](x: Self) {
    
    inline def setMemberDetails(value: MemberDetailList): Self = StObject.set(x, "MemberDetails", value.asInstanceOf[js.Any])
    
    inline def setMemberDetailsUndefined: Self = StObject.set(x, "MemberDetails", js.undefined)
    
    inline def setMemberDetailsVarargs(value: MemberDetail*): Self = StObject.set(x, "MemberDetails", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
