package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersResponse extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
  
  /**
    * The users returned in the request to list users.
    */
  var Users: js.UndefOr[UsersListType] = js.undefined
}
object ListUsersResponse {
  
  @scala.inline
  def apply(): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersResponse]
  }
  
  @scala.inline
  implicit class ListUsersResponseMutableBuilder[Self <: ListUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginationToken(value: SearchPaginationTokenType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    @scala.inline
    def setUsers(value: UsersListType): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserType*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
