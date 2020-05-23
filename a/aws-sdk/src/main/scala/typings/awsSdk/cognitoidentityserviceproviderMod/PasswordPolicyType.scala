package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordPolicyType extends js.Object {
  /**
    * The minimum length of the password policy that you have set. Cannot be less than 6.
    */
  var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.native
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one lowercase letter in their password.
    */
  var RequireLowercase: js.UndefOr[BooleanType] = js.native
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one number in their password.
    */
  var RequireNumbers: js.UndefOr[BooleanType] = js.native
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one symbol in their password.
    */
  var RequireSymbols: js.UndefOr[BooleanType] = js.native
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one uppercase letter in their password.
    */
  var RequireUppercase: js.UndefOr[BooleanType] = js.native
  /**
    * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.  When you set TemporaryPasswordValidityDays for a user pool, you will no longer be able to set the deprecated UnusedAccountValidityDays value for that user pool. 
    */
  var TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.native
}

object PasswordPolicyType {
  @scala.inline
  def apply(
    MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.undefined,
    RequireLowercase: js.UndefOr[BooleanType] = js.undefined,
    RequireNumbers: js.UndefOr[BooleanType] = js.undefined,
    RequireSymbols: js.UndefOr[BooleanType] = js.undefined,
    RequireUppercase: js.UndefOr[BooleanType] = js.undefined,
    TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.undefined
  ): PasswordPolicyType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MinimumLength)) __obj.updateDynamic("MinimumLength")(MinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireLowercase)) __obj.updateDynamic("RequireLowercase")(RequireLowercase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireNumbers)) __obj.updateDynamic("RequireNumbers")(RequireNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireSymbols)) __obj.updateDynamic("RequireSymbols")(RequireSymbols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireUppercase)) __obj.updateDynamic("RequireUppercase")(RequireUppercase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TemporaryPasswordValidityDays)) __obj.updateDynamic("TemporaryPasswordValidityDays")(TemporaryPasswordValidityDays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordPolicyType]
  }
}

