package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserPoolClientRequest extends StObject {
  
  /**
    * The app client ID of the app associated with the user pool.
    */
  var ClientId: ClientIdType = js.native
  
  /**
    * The user pool ID for the user pool where you want to delete the client.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object DeleteUserPoolClientRequest {
  
  @scala.inline
  def apply(ClientId: ClientIdType, UserPoolId: UserPoolIdType): DeleteUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserPoolClientRequest]
  }
  
  @scala.inline
  implicit class DeleteUserPoolClientRequestMutableBuilder[Self <: DeleteUserPoolClientRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: ClientIdType): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
