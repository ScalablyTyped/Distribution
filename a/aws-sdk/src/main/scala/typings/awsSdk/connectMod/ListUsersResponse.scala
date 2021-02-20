package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUsersResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * Information about the users.
    */
  var UserSummaryList: js.UndefOr[typings.awsSdk.connectMod.UserSummaryList] = js.native
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
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserSummaryList(value: UserSummaryList): Self = StObject.set(x, "UserSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSummaryListUndefined: Self = StObject.set(x, "UserSummaryList", js.undefined)
    
    @scala.inline
    def setUserSummaryListVarargs(value: UserSummary*): Self = StObject.set(x, "UserSummaryList", js.Array(value :_*))
  }
}
