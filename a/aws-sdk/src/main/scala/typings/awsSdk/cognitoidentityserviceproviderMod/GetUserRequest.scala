package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserRequest extends StObject {
  
  /**
    * The access token returned by the server response to get information about the user.
    */
  var AccessToken: TokenModelType
}
object GetUserRequest {
  
  @scala.inline
  def apply(AccessToken: TokenModelType): GetUserRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserRequest]
  }
  
  @scala.inline
  implicit class GetUserRequestMutableBuilder[Self <: GetUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
  }
}
