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
  def apply(
    UserAttributes: AttributeListType,
    Username: UsernameType,
    MFAOptions: MFAOptionListType = null,
    PreferredMfaSetting: StringType = null,
    UserMFASettingList: UserMFASettingListType = null
  ): GetUserResponse = {
    val __obj = js.Dynamic.literal(UserAttributes = UserAttributes.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (MFAOptions != null) __obj.updateDynamic("MFAOptions")(MFAOptions.asInstanceOf[js.Any])
    if (PreferredMfaSetting != null) __obj.updateDynamic("PreferredMfaSetting")(PreferredMfaSetting.asInstanceOf[js.Any])
    if (UserMFASettingList != null) __obj.updateDynamic("UserMFASettingList")(UserMFASettingList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserResponse]
  }
}

