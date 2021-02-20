package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminGetUserResponse extends StObject {
  
  /**
    * Indicates that the status is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  
  /**
    *  This response parameter is no longer supported. It provides information only about SMS MFA configurations. It doesn't provide information about TOTP software token MFA configurations. To look up information about either type of MFA configuration, use UserMFASettingList instead.
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
  implicit class AdminGetUserResponseMutableBuilder[Self <: AdminGetUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setMFAOptions(value: MFAOptionListType): Self = StObject.set(x, "MFAOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFAOptionsUndefined: Self = StObject.set(x, "MFAOptions", js.undefined)
    
    @scala.inline
    def setMFAOptionsVarargs(value: MFAOptionType*): Self = StObject.set(x, "MFAOptions", js.Array(value :_*))
    
    @scala.inline
    def setPreferredMfaSetting(value: StringType): Self = StObject.set(x, "PreferredMfaSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMfaSettingUndefined: Self = StObject.set(x, "PreferredMfaSetting", js.undefined)
    
    @scala.inline
    def setUserAttributes(value: AttributeListType): Self = StObject.set(x, "UserAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAttributesUndefined: Self = StObject.set(x, "UserAttributes", js.undefined)
    
    @scala.inline
    def setUserAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "UserAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUserCreateDate(value: DateType): Self = StObject.set(x, "UserCreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCreateDateUndefined: Self = StObject.set(x, "UserCreateDate", js.undefined)
    
    @scala.inline
    def setUserLastModifiedDate(value: DateType): Self = StObject.set(x, "UserLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLastModifiedDateUndefined: Self = StObject.set(x, "UserLastModifiedDate", js.undefined)
    
    @scala.inline
    def setUserMFASettingList(value: UserMFASettingListType): Self = StObject.set(x, "UserMFASettingList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMFASettingListUndefined: Self = StObject.set(x, "UserMFASettingList", js.undefined)
    
    @scala.inline
    def setUserMFASettingListVarargs(value: StringType*): Self = StObject.set(x, "UserMFASettingList", js.Array(value :_*))
    
    @scala.inline
    def setUserStatus(value: UserStatusType): Self = StObject.set(x, "UserStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStatusUndefined: Self = StObject.set(x, "UserStatus", js.undefined)
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
