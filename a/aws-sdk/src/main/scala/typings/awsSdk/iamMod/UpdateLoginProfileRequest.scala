package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLoginProfileRequest extends StObject {
  
  /**
    * The new password for the specified IAM user. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)   However, the format can be further restricted by the account administrator by setting a password policy on the AWS account. For more information, see UpdateAccountPasswordPolicy.
    */
  var Password: js.UndefOr[passwordType] = js.native
  
  /**
    * Allows this new password to be used only once by requiring the specified IAM user to set a new password on next sign-in.
    */
  var PasswordResetRequired: js.UndefOr[booleanObjectType] = js.native
  
  /**
    * The name of the user whose password you want to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}
object UpdateLoginProfileRequest {
  
  @scala.inline
  def apply(UserName: userNameType): UpdateLoginProfileRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoginProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateLoginProfileRequestMutableBuilder[Self <: UpdateLoginProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: passwordType): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordResetRequired(value: booleanObjectType): Self = StObject.set(x, "PasswordResetRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordResetRequiredUndefined: Self = StObject.set(x, "PasswordResetRequired", js.undefined)
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
