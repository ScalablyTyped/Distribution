package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserType extends js.Object {
  
  /**
    * A container with information about the user type attributes.
    */
  var Attributes: js.UndefOr[AttributeListType] = js.native
  
  /**
    * Specifies whether the user is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  
  /**
    * The MFA options for the user.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.native
  
  /**
    * The creation date of the user.
    */
  var UserCreateDate: js.UndefOr[DateType] = js.native
  
  /**
    * The last modified date of the user.
    */
  var UserLastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or she can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change his or her password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.native
  
  /**
    * The user name of the user you wish to describe.
    */
  var Username: js.UndefOr[UsernameType] = js.native
}
object UserType {
  
  @scala.inline
  def apply(): UserType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserType]
  }
  
  @scala.inline
  implicit class UserTypeOps[Self <: UserType] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: AttributeType*): Self = this.set("Attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: AttributeListType): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
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
    def setUserCreateDate(value: DateType): Self = this.set("UserCreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCreateDate: Self = this.set("UserCreateDate", js.undefined)
    
    @scala.inline
    def setUserLastModifiedDate(value: DateType): Self = this.set("UserLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLastModifiedDate: Self = this.set("UserLastModifiedDate", js.undefined)
    
    @scala.inline
    def setUserStatus(value: UserStatusType): Self = this.set("UserStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStatus: Self = this.set("UserStatus", js.undefined)
    
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
