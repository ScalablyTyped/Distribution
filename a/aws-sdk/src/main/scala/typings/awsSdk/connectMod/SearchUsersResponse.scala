package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchUsersResponse extends StObject {
  
  /**
    * The total number of users who matched your search query.
    */
  var ApproximateTotalCount: js.UndefOr[typings.awsSdk.connectMod.ApproximateTotalCount] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[NextToken2500] = js.undefined
  
  /**
    * Information about the users.
    */
  var Users: js.UndefOr[UserSearchSummaryList] = js.undefined
}
object SearchUsersResponse {
  
  inline def apply(): SearchUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUsersResponse]
  }
  
  extension [Self <: SearchUsersResponse](x: Self) {
    
    inline def setApproximateTotalCount(value: ApproximateTotalCount): Self = StObject.set(x, "ApproximateTotalCount", value.asInstanceOf[js.Any])
    
    inline def setApproximateTotalCountUndefined: Self = StObject.set(x, "ApproximateTotalCount", js.undefined)
    
    inline def setNextToken(value: NextToken2500): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUsers(value: UserSearchSummaryList): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    inline def setUsersVarargs(value: UserSearchSummary*): Self = StObject.set(x, "Users", js.Array(value*))
  }
}
