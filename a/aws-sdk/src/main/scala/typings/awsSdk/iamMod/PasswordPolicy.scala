package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordPolicy extends js.Object {
  /**
    * Specifies whether IAM users are allowed to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.native
  /**
    * Indicates whether passwords in the account expire. Returns true if MaxPasswordAge contains a value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
    */
  var ExpirePasswords: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM users are prevented from setting a new password after their password has expired.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.native
  /**
    * The number of days that an IAM user password is valid.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.native
  /**
    * Minimum length to require for IAM user passwords.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.native
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.native
  /**
    * Specifies whether to require lowercase characters for IAM user passwords.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether to require numbers for IAM user passwords.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether to require symbols for IAM user passwords.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether to require uppercase characters for IAM user passwords.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.native
}

object PasswordPolicy {
  @scala.inline
  def apply(
    AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined,
    ExpirePasswords: js.UndefOr[booleanType] = js.undefined,
    HardExpiry: js.UndefOr[booleanObjectType] = js.undefined,
    MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined,
    MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined,
    PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined,
    RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined,
    RequireNumbers: js.UndefOr[booleanType] = js.undefined,
    RequireSymbols: js.UndefOr[booleanType] = js.undefined,
    RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
  ): PasswordPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowUsersToChangePassword)) __obj.updateDynamic("AllowUsersToChangePassword")(AllowUsersToChangePassword.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ExpirePasswords)) __obj.updateDynamic("ExpirePasswords")(ExpirePasswords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HardExpiry)) __obj.updateDynamic("HardExpiry")(HardExpiry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxPasswordAge)) __obj.updateDynamic("MaxPasswordAge")(MaxPasswordAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinimumPasswordLength)) __obj.updateDynamic("MinimumPasswordLength")(MinimumPasswordLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PasswordReusePrevention)) __obj.updateDynamic("PasswordReusePrevention")(PasswordReusePrevention.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireLowercaseCharacters)) __obj.updateDynamic("RequireLowercaseCharacters")(RequireLowercaseCharacters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireNumbers)) __obj.updateDynamic("RequireNumbers")(RequireNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireSymbols)) __obj.updateDynamic("RequireSymbols")(RequireSymbols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireUppercaseCharacters)) __obj.updateDynamic("RequireUppercaseCharacters")(RequireUppercaseCharacters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordPolicy]
  }
}

