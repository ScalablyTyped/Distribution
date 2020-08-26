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
  def apply(): AdminCreateUserConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminCreateUserConfigType]
  }
  @scala.inline
  implicit class AdminCreateUserConfigTypeOps[Self <: AdminCreateUserConfigType] (val x: Self) extends AnyVal {
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
    def setAllowAdminCreateUserOnly(value: BooleanType): Self = this.set("AllowAdminCreateUserOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAdminCreateUserOnly: Self = this.set("AllowAdminCreateUserOnly", js.undefined)
    @scala.inline
    def setInviteMessageTemplate(value: MessageTemplateType): Self = this.set("InviteMessageTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteMessageTemplate: Self = this.set("InviteMessageTemplate", js.undefined)
    @scala.inline
    def setUnusedAccountValidityDays(value: AdminCreateUserUnusedAccountValidityDaysType): Self = this.set("UnusedAccountValidityDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnusedAccountValidityDays: Self = this.set("UnusedAccountValidityDays", js.undefined)
  }
  
}

