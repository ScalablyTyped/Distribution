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
  var UserCreateDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The last modified date of the user.
    */
  var UserLastModifiedDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or she can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change his or her password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.undefined
  
  /**
    * The user name of the user you wish to describe.
    */
  var Username: js.UndefOr[UsernameType] = js.undefined
}
object UserType {
  
  @scala.inline
  def apply(): UserType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserType]
  }
  
  @scala.inline
  implicit class UserTypeMutableBuilder[Self <: UserType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeListType): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
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
    def setUserCreateDate(value: DateType): Self = StObject.set(x, "UserCreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCreateDateUndefined: Self = StObject.set(x, "UserCreateDate", js.undefined)
    
    @scala.inline
    def setUserLastModifiedDate(value: DateType): Self = StObject.set(x, "UserLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLastModifiedDateUndefined: Self = StObject.set(x, "UserLastModifiedDate", js.undefined)
    
    @scala.inline
    def setUserStatus(value: UserStatusType): Self = StObject.set(x, "UserStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStatusUndefined: Self = StObject.set(x, "UserStatus", js.undefined)
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
