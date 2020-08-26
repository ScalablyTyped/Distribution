package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminGetUserResponse extends js.Object {
  /**
    * Indicates that the status is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  /**
    *  This response parameter is no longer supported. It provides information only about SMS MFA configurations. It doesn't provide information about TOTP software token MFA configurations. To look up information about either type of MFA configuration, use the AdminGetUserResponse$UserMFASettingList response instead.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.native
  /**
    * The user's preferred MFA setting.
    */
  var PreferredMfaSetting: js.UndefOr[StringType] = js.native
  /**
    * An array of name-value pairs representing user attributes.
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.native
  /**
    * The date the user was created.
    */
  var UserCreateDate: js.UndefOr[DateType] = js.native
  /**
    * The date the user was last modified.
    */
  var UserLastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The MFA options that are enabled for the user. The possible values in this list are SMS_MFA and SOFTWARE_TOKEN_MFA.
    */
  var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.native
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or she can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change his or her password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.native
  /**
    * The user name of the user about whom you are receiving information.
    */
  var Username: UsernameType = js.native
}

object AdminGetUserResponse {
  @scala.inline
  def apply(Username: UsernameType): AdminGetUserResponse = {
    val __obj = js.Dynamic.literal(Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGetUserResponse]
  }
  @scala.inline
  implicit class AdminGetUserResponseOps[Self <: AdminGetUserResponse] (val x: Self) extends AnyVal {
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
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: BooleanType): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setMFAOptionsVarargs(value: MFAOptionType*): Self = this.set("MFAOptions", js.Array(value :_*))
    @scala.inline
    def setMFAOptions(value: MFAOptionListType): Self = this.set("MFAOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMFAOptions: Self = this.set("MFAOptions", js.undefined)
    @scala.inline
    def setPreferredMfaSetting(value: StringType): Self = this.set("PreferredMfaSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMfaSetting: Self = this.set("PreferredMfaSetting", js.undefined)
    @scala.inline
    def setUserAttributesVarargs(value: AttributeType*): Self = this.set("UserAttributes", js.Array(value :_*))
    @scala.inline
    def setUserAttributes(value: AttributeListType): Self = this.set("UserAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAttributes: Self = this.set("UserAttributes", js.undefined)
    @scala.inline
    def setUserCreateDate(value: DateType): Self = this.set("UserCreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserCreateDate: Self = this.set("UserCreateDate", js.undefined)
    @scala.inline
    def setUserLastModifiedDate(value: DateType): Self = this.set("UserLastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserLastModifiedDate: Self = this.set("UserLastModifiedDate", js.undefined)
    @scala.inline
    def setUserMFASettingListVarargs(value: StringType*): Self = this.set("UserMFASettingList", js.Array(value :_*))
    @scala.inline
    def setUserMFASettingList(value: UserMFASettingListType): Self = this.set("UserMFASettingList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMFASettingList: Self = this.set("UserMFASettingList", js.undefined)
    @scala.inline
    def setUserStatus(value: UserStatusType): Self = this.set("UserStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserStatus: Self = this.set("UserStatus", js.undefined)
  }
  
}

