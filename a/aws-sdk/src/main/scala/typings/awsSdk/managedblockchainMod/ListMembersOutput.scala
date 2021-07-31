package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMembersOutput extends StObject {
  
  /**
    * An array of MemberSummary objects. Each object contains details about a network member.
    */
  var Members: js.UndefOr[MemberSummaryList] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListMembersOutput {
  
  @scala.inline
  def apply(): ListMembersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMembersOutput]
  }
  
  @scala.inline
  implicit class ListMembersOutputMutableBuilder[Self <: ListMembersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: MemberSummaryList): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: MemberSummary*): Self = StObject.set(x, "Members", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
