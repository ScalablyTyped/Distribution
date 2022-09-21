package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangePasswordRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user whose password you want to change.
    */
  var AccessToken: TokenModelType
  
  /**
    * The old password.
    */
  var PreviousPassword: PasswordType
  
  /**
    * The new password.
    */
  var ProposedPassword: PasswordType
}
object ChangePasswordRequest {
  
  inline def apply(AccessToken: TokenModelType, PreviousPassword: PasswordType, ProposedPassword: PasswordType): ChangePasswordRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], PreviousPassword = PreviousPassword.asInstanceOf[js.Any], ProposedPassword = ProposedPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePasswordRequest]
  }
  
  extension [Self <: ChangePasswordRequest](x: Self) {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setPreviousPassword(value: PasswordType): Self = StObject.set(x, "PreviousPassword", value.asInstanceOf[js.Any])
    
    inline def setProposedPassword(value: PasswordType): Self = StObject.set(x, "ProposedPassword", value.asInstanceOf[js.Any])
  }
}
