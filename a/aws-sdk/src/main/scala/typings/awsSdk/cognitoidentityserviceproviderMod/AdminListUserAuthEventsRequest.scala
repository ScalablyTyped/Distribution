package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminListUserAuthEventsRequest extends StObject {
  
  /**
    * The maximum number of authentication events to return.
    */
  var MaxResults: js.UndefOr[QueryLimitType] = js.undefined
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user pool username or an alias.
    */
  var Username: UsernameType
}
object AdminListUserAuthEventsRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminListUserAuthEventsRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminListUserAuthEventsRequest]
  }
  
  @scala.inline
  implicit class AdminListUserAuthEventsRequestMutableBuilder[Self <: AdminListUserAuthEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: QueryLimitType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
