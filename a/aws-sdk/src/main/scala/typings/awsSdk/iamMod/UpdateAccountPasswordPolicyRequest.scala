package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccountPasswordPolicyRequest extends js.Object {
  /**
    *  Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more information, see Letting IAM Users Change Their Own Passwords in the IAM User Guide. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users in the account do not automatically have permissions to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.native
  /**
    * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed until an administrator resets the password. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.native
  /**
    * The number of days that an IAM user password is valid. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM user passwords never expire.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.native
  /**
    * The minimum number of characters allowed in an IAM user password. If you do not specify a value for this parameter, then the operation uses the default value of 6.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.native
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM users are not prevented from reusing previous passwords.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one lowercase character.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one numeric character.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters: ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | ' If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one symbol character.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one uppercase character.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.native
}

object UpdateAccountPasswordPolicyRequest {
  @scala.inline
  def apply(): UpdateAccountPasswordPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountPasswordPolicyRequest]
  }
  @scala.inline
  implicit class UpdateAccountPasswordPolicyRequestOps[Self <: UpdateAccountPasswordPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowUsersToChangePassword(value: booleanType): Self = this.set("AllowUsersToChangePassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUsersToChangePassword: Self = this.set("AllowUsersToChangePassword", js.undefined)
    @scala.inline
    def setHardExpiry(value: booleanObjectType): Self = this.set("HardExpiry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardExpiry: Self = this.set("HardExpiry", js.undefined)
    @scala.inline
    def setMaxPasswordAge(value: maxPasswordAgeType): Self = this.set("MaxPasswordAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPasswordAge: Self = this.set("MaxPasswordAge", js.undefined)
    @scala.inline
    def setMinimumPasswordLength(value: minimumPasswordLengthType): Self = this.set("MinimumPasswordLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumPasswordLength: Self = this.set("MinimumPasswordLength", js.undefined)
    @scala.inline
    def setPasswordReusePrevention(value: passwordReusePreventionType): Self = this.set("PasswordReusePrevention", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordReusePrevention: Self = this.set("PasswordReusePrevention", js.undefined)
    @scala.inline
    def setRequireLowercaseCharacters(value: booleanType): Self = this.set("RequireLowercaseCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireLowercaseCharacters: Self = this.set("RequireLowercaseCharacters", js.undefined)
    @scala.inline
    def setRequireNumbers(value: booleanType): Self = this.set("RequireNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireNumbers: Self = this.set("RequireNumbers", js.undefined)
    @scala.inline
    def setRequireSymbols(value: booleanType): Self = this.set("RequireSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireSymbols: Self = this.set("RequireSymbols", js.undefined)
    @scala.inline
    def setRequireUppercaseCharacters(value: booleanType): Self = this.set("RequireUppercaseCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireUppercaseCharacters: Self = this.set("RequireUppercaseCharacters", js.undefined)
  }
  
}

