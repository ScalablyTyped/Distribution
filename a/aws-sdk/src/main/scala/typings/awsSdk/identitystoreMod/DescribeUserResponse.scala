package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserResponse extends StObject {
  
  /**
    * The user's physical address.
    */
  var Addresses: js.UndefOr[typings.awsSdk.identitystoreMod.Addresses] = js.undefined
  
  /**
    * The user's name value for display.
    */
  var DisplayName: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The user's email value.
    */
  var Emails: js.UndefOr[typings.awsSdk.identitystoreMod.Emails] = js.undefined
  
  /**
    * A list of ExternalId objects that contains the identifiers issued to this resource by an external identity provider.
    */
  var ExternalIds: js.UndefOr[typings.awsSdk.identitystoreMod.ExternalIds] = js.undefined
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.identitystoreMod.IdentityStoreId
  
  /**
    * A string containing the user's geographical region or location.
    */
  var Locale: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The name of the user.
    */
  var Name: js.UndefOr[typings.awsSdk.identitystoreMod.Name] = js.undefined
  
  /**
    * An alternative descriptive name for the user.
    */
  var NickName: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A list of PhoneNumber objects associated with a user.
    */
  var PhoneNumbers: js.UndefOr[typings.awsSdk.identitystoreMod.PhoneNumbers] = js.undefined
  
  /**
    * The preferred language of the user.
    */
  var PreferredLanguage: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A URL link for the user's profile.
    */
  var ProfileUrl: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The time zone for a user.
    */
  var Timezone: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing the user's title.
    */
  var Title: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The identifier for a user in the identity store.
    */
  var UserId: ResourceId
  
  /**
    * A unique string used to identify the user. The length limit is 128 characters. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store.
    */
  var UserName: js.UndefOr[typings.awsSdk.identitystoreMod.UserName] = js.undefined
  
  /**
    * A string indicating the user's type.
    */
  var UserType: js.UndefOr[SensitiveStringType] = js.undefined
}
object DescribeUserResponse {
  
  inline def apply(IdentityStoreId: IdentityStoreId, UserId: ResourceId): DescribeUserResponse = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserResponse]
  }
  
  extension [Self <: DescribeUserResponse](x: Self) {
    
    inline def setAddresses(value: Addresses): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "Addresses", js.Array(value*))
    
    inline def setDisplayName(value: SensitiveStringType): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmails(value: Emails): Self = StObject.set(x, "Emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "Emails", js.undefined)
    
    inline def setEmailsVarargs(value: Email*): Self = StObject.set(x, "Emails", js.Array(value*))
    
    inline def setExternalIds(value: ExternalIds): Self = StObject.set(x, "ExternalIds", value.asInstanceOf[js.Any])
    
    inline def setExternalIdsUndefined: Self = StObject.set(x, "ExternalIds", js.undefined)
    
    inline def setExternalIdsVarargs(value: ExternalId*): Self = StObject.set(x, "ExternalIds", js.Array(value*))
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: SensitiveStringType): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNickName(value: SensitiveStringType): Self = StObject.set(x, "NickName", value.asInstanceOf[js.Any])
    
    inline def setNickNameUndefined: Self = StObject.set(x, "NickName", js.undefined)
    
    inline def setPhoneNumbers(value: PhoneNumbers): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "PhoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "PhoneNumbers", js.Array(value*))
    
    inline def setPreferredLanguage(value: SensitiveStringType): Self = StObject.set(x, "PreferredLanguage", value.asInstanceOf[js.Any])
    
    inline def setPreferredLanguageUndefined: Self = StObject.set(x, "PreferredLanguage", js.undefined)
    
    inline def setProfileUrl(value: SensitiveStringType): Self = StObject.set(x, "ProfileUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileUrlUndefined: Self = StObject.set(x, "ProfileUrl", js.undefined)
    
    inline def setTimezone(value: SensitiveStringType): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setTitle(value: SensitiveStringType): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setUserType(value: SensitiveStringType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
