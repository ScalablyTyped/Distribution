package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserPoolClientsResponse extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
  
  /**
    * The user pool clients in the response that lists user pool clients.
    */
  var UserPoolClients: js.UndefOr[UserPoolClientListType] = js.native
}
object ListUserPoolClientsResponse {
  
  @scala.inline
  def apply(): ListUserPoolClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPoolClientsResponse]
  }
  
  @scala.inline
  implicit class ListUserPoolClientsResponseMutableBuilder[Self <: ListUserPoolClientsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserPoolClients(value: UserPoolClientListType): Self = StObject.set(x, "UserPoolClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolClientsUndefined: Self = StObject.set(x, "UserPoolClients", js.undefined)
    
    @scala.inline
    def setUserPoolClientsVarargs(value: UserPoolClientDescription*): Self = StObject.set(x, "UserPoolClients", js.Array(value :_*))
  }
}
