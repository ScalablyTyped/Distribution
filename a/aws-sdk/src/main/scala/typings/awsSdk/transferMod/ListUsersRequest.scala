package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersRequest extends StObject {
  
  /**
    * Specifies the number of users to return as a response to the ListUsers request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transferMod.MaxResults] = js.undefined
  
  /**
    * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional users.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.undefined
  
  /**
    * A system-assigned unique identifier for a server that has users assigned to it.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object ListUsersRequest {
  
  inline def apply(ServerId: ServerId): ListUsersRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersRequest]
  }
  
  extension [Self <: ListUsersRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
