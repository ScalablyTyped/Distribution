package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The time when the user was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.undefined
  
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.undefined
  
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.undefined
  
  /**
    * The time when the user was modified.
    */
  var ModifiedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The ID of the recycle bin folder.
    */
  var RecycleBinFolderId: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The ID of the root folder.
    */
  var RootFolderId: js.UndefOr[ResourceIdType] = js.undefined
  
  /**
    * The status of the user.
    */
  var Status: js.UndefOr[UserStatusType] = js.undefined
  
  /**
    * The storage for the user.
    */
  var Storage: js.UndefOr[UserStorageMetadata] = js.undefined
  
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.undefined
  
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.undefined
  
  /**
    * The type of user.
    */
  var Type: js.UndefOr[UserType] = js.undefined
  
  /**
    * The login name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setEmailAddress(value: EmailAddressType): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setGivenName(value: UserAttributeValueType): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "GivenName", js.undefined)
    
    inline def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLocale(value: LocaleType): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setModifiedTimestamp(value: js.Date): Self = StObject.set(x, "ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimestampUndefined: Self = StObject.set(x, "ModifiedTimestamp", js.undefined)
    
    inline def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setRecycleBinFolderId(value: ResourceIdType): Self = StObject.set(x, "RecycleBinFolderId", value.asInstanceOf[js.Any])
    
    inline def setRecycleBinFolderIdUndefined: Self = StObject.set(x, "RecycleBinFolderId", js.undefined)
    
    inline def setRootFolderId(value: ResourceIdType): Self = StObject.set(x, "RootFolderId", value.asInstanceOf[js.Any])
    
    inline def setRootFolderIdUndefined: Self = StObject.set(x, "RootFolderId", js.undefined)
    
    inline def setStatus(value: UserStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorage(value: UserStorageMetadata): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "Storage", js.undefined)
    
    inline def setSurname(value: UserAttributeValueType): Self = StObject.set(x, "Surname", value.asInstanceOf[js.Any])
    
    inline def setSurnameUndefined: Self = StObject.set(x, "Surname", js.undefined)
    
    inline def setTimeZoneId(value: TimeZoneIdType): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneIdUndefined: Self = StObject.set(x, "TimeZoneId", js.undefined)
    
    inline def setType(value: UserType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
