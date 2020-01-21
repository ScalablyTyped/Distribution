package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminCreateUserConfigType extends js.Object {
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.native
  /**
    * The message template to be used for the welcome message to new users. See also Customizing User Invitation Messages.
    */
  var InviteMessageTemplate: js.UndefOr[MessageTemplateType] = js.native
  /**
    * The user account expiration limit, in days, after which the account is no longer usable. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter. The default value for this parameter is 7.   If you set a value for TemporaryPasswordValidityDays in PasswordPolicy, that value will be used and UnusedAccountValidityDays will be deprecated for that user pool.  
    */
  var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.native
}

object AdminCreateUserConfigType {
  @scala.inline
  def apply(
    AllowAdminCreateUserOnly: js.UndefOr[Boolean] = js.undefined,
    InviteMessageTemplate: MessageTemplateType = null,
    UnusedAccountValidityDays: Int | Double = null
  ): AdminCreateUserConfigType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowAdminCreateUserOnly)) __obj.updateDynamic("AllowAdminCreateUserOnly")(AllowAdminCreateUserOnly.asInstanceOf[js.Any])
    if (InviteMessageTemplate != null) __obj.updateDynamic("InviteMessageTemplate")(InviteMessageTemplate.asInstanceOf[js.Any])
    if (UnusedAccountValidityDays != null) __obj.updateDynamic("UnusedAccountValidityDays")(UnusedAccountValidityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminCreateUserConfigType]
  }
}

