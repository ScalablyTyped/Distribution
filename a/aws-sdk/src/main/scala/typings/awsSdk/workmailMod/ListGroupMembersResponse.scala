package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupMembersResponse extends StObject {
  
  /**
    * The members associated to the group.
    */
  var Members: js.UndefOr[typings.awsSdk.workmailMod.Members] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.undefined
}
object ListGroupMembersResponse {
  
  @scala.inline
  def apply(): ListGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupMembersResponse]
  }
  
  @scala.inline
  implicit class ListGroupMembersResponseMutableBuilder[Self <: ListGroupMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: Members): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: Member*): Self = StObject.set(x, "Members", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
