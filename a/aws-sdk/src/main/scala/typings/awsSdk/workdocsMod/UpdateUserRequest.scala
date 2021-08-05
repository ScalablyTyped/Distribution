package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
  
  /**
    * Boolean value to determine whether the user is granted Poweruser privileges.
    */
  var GrantPoweruserPrivileges: js.UndefOr[BooleanEnumType] = js.undefined
  
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.undefined
  
  /**
    * The amount of storage for the user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.undefined
  
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
  
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
  
  /**
    * The type of the user.
    */
  var Type: js.UndefOr[UserType] = js.undefined
  
  /**
    * The ID of the user.
    */
  var UserId: IdType
}
object UpdateUserRequest {
  
  inline def apply(UserId: IdType): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  extension [Self <: UpdateUserRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setGivenName(value: UserAttributeValueType): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "GivenName", js.undefined)
    
    inline def setGrantPoweruserPrivileges(value: BooleanEnumType): Self = StObject.set(x, "GrantPoweruserPrivileges", value.asInstanceOf[js.Any])
    
    inline def setGrantPoweruserPrivilegesUndefined: Self = StObject.set(x, "GrantPoweruserPrivileges", js.undefined)
    
    inline def setLocale(value: LocaleType): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setStorageRule(value: StorageRuleType): Self = StObject.set(x, "StorageRule", value.asInstanceOf[js.Any])
    
    inline def setStorageRuleUndefined: Self = StObject.set(x, "StorageRule", js.undefined)
    
    inline def setSurname(value: UserAttributeValueType): Self = StObject.set(x, "Surname", value.asInstanceOf[js.Any])
    
    inline def setSurnameUndefined: Self = StObject.set(x, "Surname", js.undefined)
    
    inline def setTimeZoneId(value: TimeZoneIdType): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneIdUndefined: Self = StObject.set(x, "TimeZoneId", js.undefined)
    
    inline def setType(value: UserType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUserId(value: IdType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
