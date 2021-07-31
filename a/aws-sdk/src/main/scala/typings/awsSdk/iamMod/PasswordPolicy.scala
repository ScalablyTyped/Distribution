package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordPolicy extends StObject {
  
  /**
    * Specifies whether IAM users are allowed to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Indicates whether passwords in the account expire. Returns true if MaxPasswordAge contains a value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
    */
  var ExpirePasswords: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether IAM users are prevented from setting a new password after their password has expired.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.undefined
  
  /**
    * The number of days that an IAM user password is valid.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined
  
  /**
    * Minimum length to require for IAM user passwords.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined
  
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined
  
  /**
    * Specifies whether to require lowercase characters for IAM user passwords.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether to require numbers for IAM user passwords.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether to require symbols for IAM user passwords.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether to require uppercase characters for IAM user passwords.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
}
object PasswordPolicy {
  
  @scala.inline
  def apply(): PasswordPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordPolicy]
  }
  
  @scala.inline
  implicit class PasswordPolicyMutableBuilder[Self <: PasswordPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUsersToChangePassword(value: booleanType): Self = StObject.set(x, "AllowUsersToChangePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUsersToChangePasswordUndefined: Self = StObject.set(x, "AllowUsersToChangePassword", js.undefined)
    
    @scala.inline
    def setExpirePasswords(value: booleanType): Self = StObject.set(x, "ExpirePasswords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirePasswordsUndefined: Self = StObject.set(x, "ExpirePasswords", js.undefined)
    
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
