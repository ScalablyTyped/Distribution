package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersInGroupResponse extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  
  /**
    * The users returned in the request to list users.
    */
  var Users: js.UndefOr[UsersListType] = js.undefined
}
object ListUsersInGroupResponse {
  
  @scala.inline
  def apply(): ListUsersInGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersInGroupResponse]
  }
  
  @scala.inline
  implicit class ListUsersInGroupResponseMutableBuilder[Self <: ListUsersInGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUsers(value: UsersListType): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserType*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
