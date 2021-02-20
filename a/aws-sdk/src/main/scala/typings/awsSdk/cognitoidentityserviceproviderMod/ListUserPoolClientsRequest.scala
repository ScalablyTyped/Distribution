package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserPoolClientsRequest extends StObject {
  
  /**
    * The maximum number of results you want the request to return when listing the user pool clients.
    */
  var MaxResults: js.UndefOr[QueryLimit] = js.native
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
  
  /**
    * The user pool ID for the user pool where you want to list user pool clients.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object ListUserPoolClientsRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): ListUserPoolClientsRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserPoolClientsRequest]
  }
  
  @scala.inline
  implicit class ListUserPoolClientsRequestMutableBuilder[Self <: ListUserPoolClientsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: QueryLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
