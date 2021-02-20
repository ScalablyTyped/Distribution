package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserPoolRequest extends StObject {
  
  /**
    * The user pool ID for the user pool you want to delete.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object DeleteUserPoolRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DeleteUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserPoolRequest]
  }
  
  @scala.inline
  implicit class DeleteUserPoolRequestMutableBuilder[Self <: DeleteUserPoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
