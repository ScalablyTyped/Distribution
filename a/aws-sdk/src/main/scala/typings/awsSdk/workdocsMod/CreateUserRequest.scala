package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserRequest extends js.Object {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.native
  
  /**
    * The given name of the user.
    */
  var GivenName: UserAttributeValueType = js.native
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  
  /**
    * The password of the user.
    */
  var Password: PasswordType = js.native
  
  /**
    * The amount of storage for the user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.native
  
  /**
    * The surname of the user.
    */
  var Surname: UserAttributeValueType = js.native
  
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.native
  
  /**
    * The login name of the user.
    */
  var Username: UsernameType = js.native
}
object CreateUserRequest {
  
  @scala.inline
  def apply(
    GivenName: UserAttributeValueType,
    Password: PasswordType,
    Surname: UserAttributeValueType,
    Username: UsernameType
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(GivenName = GivenName.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Surname = Surname.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
    
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
    def setGivenName(value: UserAttributeValueType): Self = this.set("GivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: PasswordType): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurname(value: UserAttributeValueType): Self = this.set("Surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationToken: Self = this.set("AuthenticationToken", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddressType): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("EmailAddress", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationId: Self = this.set("OrganizationId", js.undefined)
    
    @scala.inline
    def setStorageRule(value: StorageRuleType): Self = this.set("StorageRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageRule: Self = this.set("StorageRule", js.undefined)
    
    @scala.inline
    def setTimeZoneId(value: TimeZoneIdType): Self = this.set("TimeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneId: Self = this.set("TimeZoneId", js.undefined)
  }
}
