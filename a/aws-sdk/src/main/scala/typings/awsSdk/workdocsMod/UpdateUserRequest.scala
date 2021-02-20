package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  
  /**
    * Boolean value to determine whether the user is granted Poweruser privileges.
    */
  var GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType] = js.native
  
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.native
  
  /**
    * The amount of storage for the user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.native
  
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.native
  
  /**
    * The type of the user.
    */
  var Type: js.UndefOr[UserType] = js.native
  
  /**
    * The ID of the user.
    */
  var UserId: IdType = js.native
}
object UpdateUserRequest {
  
  @scala.inline
  def apply(UserId: IdType): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  @scala.inline
  implicit class UpdateUserRequestMutableBuilder[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setGivenName(value: UserAttributeValueType): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "GivenName", js.undefined)
    
    @scala.inline
    def setGrantPoweruserPrivileges(value: BooleanEnumType): Self = StObject.set(x, "GrantPoweruserPrivileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantPoweruserPrivilegesUndefined: Self = StObject.set(x, "GrantPoweruserPrivileges", js.undefined)
    
    @scala.inline
    def setLocale(value: LocaleType): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    @scala.inline
    def setStorageRule(value: StorageRuleType): Self = StObject.set(x, "StorageRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageRuleUndefined: Self = StObject.set(x, "StorageRule", js.undefined)
    
    @scala.inline
    def setSurname(value: UserAttributeValueType): Self = StObject.set(x, "Surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurnameUndefined: Self = StObject.set(x, "Surname", js.undefined)
    
    @scala.inline
    def setTimeZoneId(value: TimeZoneIdType): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneIdUndefined: Self = StObject.set(x, "TimeZoneId", js.undefined)
    
    @scala.inline
    def setType(value: UserType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUserId(value: IdType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
