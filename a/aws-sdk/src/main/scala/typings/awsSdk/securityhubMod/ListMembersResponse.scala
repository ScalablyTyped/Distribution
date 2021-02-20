package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMembersResponse extends StObject {
  
  /**
    * Member details returned by the operation.
    */
  var Members: js.UndefOr[MemberList] = js.native
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
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
    def setMembers(value: MemberList): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: Member*): Self = StObject.set(x, "Members", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
