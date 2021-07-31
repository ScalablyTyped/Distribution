package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserRequest extends StObject {
  
  /**
    * The access token from a request to delete a user.
    */
  var AccessToken: TokenModelType
}
object DeleteUserRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  @scala.inline
  implicit class DeleteUserRequestMutableBuilder[Self <: DeleteUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
  }
}
