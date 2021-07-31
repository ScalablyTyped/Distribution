package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceServersRequest extends StObject {
  
  /**
    * The maximum number of resource servers to return.
    */
  var MaxResults: js.UndefOr[ListResourceServersLimitType] = js.undefined
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}
object ListResourceServersRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): ListResourceServersRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceServersRequest]
  }
  
  @scala.inline
  implicit class ListResourceServersRequestMutableBuilder[Self <: ListResourceServersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListResourceServersLimitType): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
