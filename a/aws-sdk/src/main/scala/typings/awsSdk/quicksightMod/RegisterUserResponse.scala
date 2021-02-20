package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterUserResponse extends StObject {
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * The user's user name.
    */
  var User: js.UndefOr[typings.awsSdk.quicksightMod.User] = js.native
  
  /**
    * The URL the user visits to complete registration and provide a password. This is returned only for users with an identity type of QUICKSIGHT.
    */
  var UserInvitationUrl: js.UndefOr[String] = js.native
}
object RegisterUserResponse {
  
  @scala.inline
  def apply(): RegisterUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterUserResponse]
  }
  
  @scala.inline
  implicit class RegisterUserResponseMutableBuilder[Self <: RegisterUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInvitationUrl(value: String): Self = StObject.set(x, "UserInvitationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInvitationUrlUndefined: Self = StObject.set(x, "UserInvitationUrl", js.undefined)
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
