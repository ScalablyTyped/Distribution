package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountPasswordPolicyRequest extends StObject {
  
  /**
    *  Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more information, see Letting IAM Users Change Their Own Passwords in the IAM User Guide. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users in the account do not automatically have permissions to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed until an administrator resets the password. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.undefined
  
  /**
    * The number of days that an IAM user password is valid. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM user passwords never expire.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined
  
  /**
    * The minimum number of characters allowed in an IAM user password. If you do not specify a value for this parameter, then the operation uses the default value of 6.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined
  
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM users are not prevented from reusing previous passwords.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined
  
  /**
    * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one lowercase character.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one numeric character.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters: ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | ' If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one symbol character.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one uppercase character.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
}
object UpdateAccountPasswordPolicyRequest {
  
  @scala.inline
  def apply(): UpdateAccountPasswordPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountPasswordPolicyRequest]
  }
  
  @scala.inline
  implicit class UpdateAccountPasswordPolicyRequestMutableBuilder[Self <: UpdateAccountPasswordPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUsersToChangePassword(value: booleanType): Self = StObject.set(x, "AllowUsersToChangePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUsersToChangePasswordUndefined: Self = StObject.set(x, "AllowUsersToChangePassword", js.undefined)
    
    @scala.inline
    def setHardExpiry(value: booleanObjectType): Self = StObject.set(x, "HardExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardExpiryUndefined: Self = StObject.set(x, "HardExpiry", js.undefined)
    
    @scala.inline
    def setMaxPasswordAge(value: maxPasswordAgeType): Self = StObject.set(x, "MaxPasswordAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPasswordAgeUndefined: Self = StObject.set(x, "MaxPasswordAge", js.undefined)
    
    @scala.inline
    def setMinimumPasswordLength(value: minimumPasswordLengthType): Self = StObject.set(x, "MinimumPasswordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumPasswordLengthUndefined: Self = StObject.set(x, "MinimumPasswordLength", js.undefined)
    
    @scala.inline
    def setPasswordReusePrevention(value: passwordReusePreventionType): Self = StObject.set(x, "PasswordReusePrevention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordReusePreventionUndefined: Self = StObject.set(x, "PasswordReusePrevention", js.undefined)
    
    @scala.inline
    def setRequireLowercaseCharacters(value: booleanType): Self = StObject.set(x, "RequireLowercaseCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireLowercaseCharactersUndefined: Self = StObject.set(x, "RequireLowercaseCharacters", js.undefined)
    
    @scala.inline
    def setRequireNumbers(value: booleanType): Self = StObject.set(x, "RequireNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireNumbersUndefined: Self = StObject.set(x, "RequireNumbers", js.undefined)
    
    @scala.inline
    def setRequireSymbols(value: booleanType): Self = StObject.set(x, "RequireSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSymbolsUndefined: Self = StObject.set(x, "RequireSymbols", js.undefined)
    
    @scala.inline
    def setRequireUppercaseCharacters(value: booleanType): Self = StObject.set(x, "RequireUppercaseCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireUppercaseCharactersUndefined: Self = StObject.set(x, "RequireUppercaseCharacters", js.undefined)
  }
}
