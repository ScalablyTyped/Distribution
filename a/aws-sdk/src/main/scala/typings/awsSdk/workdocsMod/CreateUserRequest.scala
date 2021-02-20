package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserRequest extends StObject {
  
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
  implicit class CreateUserRequestMutableBuilder[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddressType): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    @scala.inline
    def setGivenName(value: UserAttributeValueType): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    @scala.inline
    def setPassword(value: PasswordType): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRule(value: StorageRuleType): Self = StObject.set(x, "StorageRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRuleUndefined: Self = StObject.set(x, "StorageRule", js.undefined)
    
    @scala.inline
    def setSurname(value: UserAttributeValueType): Self = StObject.set(x, "Surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneId(value: TimeZoneIdType): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneIdUndefined: Self = StObject.set(x, "TimeZoneId", js.undefined)
    
    @scala.inline
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
