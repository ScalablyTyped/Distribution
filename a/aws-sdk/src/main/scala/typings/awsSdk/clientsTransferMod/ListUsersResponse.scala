package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersResponse extends StObject {
  
  /**
    * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional users.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
  
  /**
    * A system-assigned unique identifier for a server that the users are assigned to.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * Returns the user accounts and their properties for the ServerId value that you specify.
    */
  var Users: ListedUsers
}
object ListUsersResponse {
  
  inline def apply(ServerId: ServerId, Users: ListedUsers): ListUsersResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersResponse]
  }
  
  extension [Self <: ListUsersResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: ListedUsers): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: ListedUser*): Self = StObject.set(x, "Users", js.Array(value*))
  }
}
