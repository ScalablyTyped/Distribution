package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserType extends StObject {
  
  /**
    * A container with information about the user type attributes.
    */
  var Attributes: js.UndefOr[AttributeListType] = js.undefined
  
  /**
    * Specifies whether the user is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The MFA options for the user.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
  
  /**
    * The creation date of the user.
    */
  var UserCreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last modified date of the user.
    */
  var UserLastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The user status. This can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   EXTERNAL_PROVIDER - User signed in with a third-party IdP.   ARCHIVED - User is no longer active.   UNKNOWN - User status isn't known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset their password before they can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change their password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.undefined
  
  /**
    * The user name of the user you want to describe.
    */
  var Username: js.UndefOr[UsernameType] = js.undefined
}
object UserType {
  
  inline def apply(): UserType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserType]
  }
  
  extension [Self <: UserType](x: Self) {
    
    inline def setAttributes(value: AttributeListType): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "Attributes", js.Array(value*))
    
    inline def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setMFAOptions(value: MFAOptionListType): Self = StObject.set(x, "MFAOptions", value.asInstanceOf[js.Any])
    
    inline def setMFAOptionsUndefined: Self = StObject.set(x, "MFAOptions", js.undefined)
    
    inline def setMFAOptionsVarargs(value: MFAOptionType*): Self = StObject.set(x, "MFAOptions", js.Array(value*))
    
    inline def setUserCreateDate(value: js.Date): Self = StObject.set(x, "UserCreateDate", value.asInstanceOf[js.Any])
    
    inline def setUserCreateDateUndefined: Self = StObject.set(x, "UserCreateDate", js.undefined)
    
    inline def setUserLastModifiedDate(value: js.Date): Self = StObject.set(x, "UserLastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setUserLastModifiedDateUndefined: Self = StObject.set(x, "UserLastModifiedDate", js.undefined)
    
    inline def setUserStatus(value: UserStatusType): Self = StObject.set(x, "UserStatus", value.asInstanceOf[js.Any])
    
    inline def setUserStatusUndefined: Self = StObject.set(x, "UserStatus", js.undefined)
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
