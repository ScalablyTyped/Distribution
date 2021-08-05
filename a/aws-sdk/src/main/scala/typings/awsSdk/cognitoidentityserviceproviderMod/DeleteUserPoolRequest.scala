package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserPoolRequest extends StObject {
  
  /**
    * The user pool ID for the user pool you want to delete.
    */
  var UserPoolId: UserPoolIdType
}
object DeleteUserPoolRequest {
  
  inline def apply(UserPoolId: UserPoolIdType): DeleteUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserPoolRequest]
  }
  
  extension [Self <: DeleteUserPoolRequest](x: Self) {
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
