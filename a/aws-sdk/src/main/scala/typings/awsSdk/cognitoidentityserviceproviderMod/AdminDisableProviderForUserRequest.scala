package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminDisableProviderForUserRequest extends StObject {
  
  /**
    * The user to be disabled.
    */
  var User: ProviderUserIdentifierType = js.native
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: StringType = js.native
}
object AdminDisableProviderForUserRequest {
  
  @scala.inline
  def apply(User: ProviderUserIdentifierType, UserPoolId: StringType): AdminDisableProviderForUserRequest = {
    val __obj = js.Dynamic.literal(User = User.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDisableProviderForUserRequest]
  }
  
  @scala.inline
  implicit class AdminDisableProviderForUserRequestMutableBuilder[Self <: AdminDisableProviderForUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: ProviderUserIdentifierType): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: StringType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
