package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupsRequest extends StObject {
  
  /**
    * The limit of the request to list groups.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}
object ListGroupsRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): ListGroupsRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupsRequest]
  }
  
  @scala.inline
  implicit class ListGroupsRequestMutableBuilder[Self <: ListGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: QueryLimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
