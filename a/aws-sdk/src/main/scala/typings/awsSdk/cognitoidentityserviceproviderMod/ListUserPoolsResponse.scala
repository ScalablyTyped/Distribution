package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserPoolsResponse extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  
  /**
    * The user pools from the response to list users.
    */
  var UserPools: js.UndefOr[UserPoolListType] = js.native
}
object ListUserPoolsResponse {
  
  @scala.inline
  def apply(): ListUserPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPoolsResponse]
  }
  
  @scala.inline
  implicit class ListUserPoolsResponseMutableBuilder[Self <: ListUserPoolsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserPools(value: UserPoolListType): Self = StObject.set(x, "UserPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolsUndefined: Self = StObject.set(x, "UserPools", js.undefined)
    
    @scala.inline
    def setUserPoolsVarargs(value: UserPoolDescriptionType*): Self = StObject.set(x, "UserPools", js.Array(value :_*))
  }
}
