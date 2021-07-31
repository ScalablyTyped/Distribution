package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserResponse extends StObject {
  
  /**
    *  This response parameter is no longer supported. It provides information only about SMS MFA configurations. It doesn't provide information about TOTP software token MFA configurations. To look up information about either type of MFA configuration, use UserMFASettingList instead.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
  
  /**
    * The user's preferred MFA setting.
    */
  var PreferredMfaSetting: js.UndefOr[StringType] = js.undefined
  
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: AttributeListType
  
  /**
    * The MFA options that are enabled for the user. The possible values in this list are SMS_MFA and SOFTWARE_TOKEN_MFA.
    */
  var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined
  
  /**
    * The user name of the user you wish to retrieve from the get user request.
    */
  var Username: UsernameType
}
object GetUserResponse {
  
  @scala.inline
  def apply(UserAttributes: AttributeListType, Username: UsernameType): GetUserResponse = {
    val __obj = js.Dynamic.literal(UserAttributes = UserAttributes.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserResponse]
  }
  
  @scala.inline
  implicit class GetUserResponseMutableBuilder[Self <: GetUserResponse] (val x: Self) extends AnyVal {
    
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
    def setUserAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "UserAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUserMFASettingList(value: UserMFASettingListType): Self = StObject.set(x, "UserMFASettingList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMFASettingListUndefined: Self = StObject.set(x, "UserMFASettingList", js.undefined)
    
    @scala.inline
    def setUserMFASettingListVarargs(value: StringType*): Self = StObject.set(x, "UserMFASettingList", js.Array(value :_*))
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
