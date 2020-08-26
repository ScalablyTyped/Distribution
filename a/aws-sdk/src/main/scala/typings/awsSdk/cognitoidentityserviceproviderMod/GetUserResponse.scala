package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserResponse extends js.Object {
  /**
    *  This response parameter is no longer supported. It provides information only about SMS MFA configurations. It doesn't provide information about TOTP software token MFA configurations. To look up information about either type of MFA configuration, use the use the GetUserResponse$UserMFASettingList response instead.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.native
  /**
    * The user's preferred MFA setting.
    */
  var PreferredMfaSetting: js.UndefOr[StringType] = js.native
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: AttributeListType = js.native
  /**
    * The MFA options that are enabled for the user. The possible values in this list are SMS_MFA and SOFTWARE_TOKEN_MFA.
    */
  var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.native
  /**
    * The user name of the user you wish to retrieve from the get user request.
    */
  var Username: UsernameType = js.native
}

object GetUserResponse {
  @scala.inline
  def apply(UserAttributes: AttributeListType, Username: UsernameType): GetUserResponse = {
    val __obj = js.Dynamic.literal(UserAttributes = UserAttributes.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserResponse]
  }
  @scala.inline
  implicit class GetUserResponseOps[Self <: GetUserResponse] (val x: Self) extends AnyVal {
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
    def setUserAttributesVarargs(value: AttributeType*): Self = this.set("UserAttributes", js.Array(value :_*))
    @scala.inline
    def setUserAttributes(value: AttributeListType): Self = this.set("UserAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
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
    def setUserMFASettingListVarargs(value: StringType*): Self = this.set("UserMFASettingList", js.Array(value :_*))
    @scala.inline
    def setUserMFASettingList(value: UserMFASettingListType): Self = this.set("UserMFASettingList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMFASettingList: Self = this.set("UserMFASettingList", js.undefined)
  }
  
}

