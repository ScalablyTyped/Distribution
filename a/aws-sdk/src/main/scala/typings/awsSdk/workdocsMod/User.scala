package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  /**
    * The time when the user was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.native
  
  /**
    * The given name of the user.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.native
  
  /**
    * The locale of the user.
    */
  var Locale: js.UndefOr[LocaleType] = js.native
  
  /**
    * The time when the user was modified.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  
  /**
    * The ID of the recycle bin folder.
    */
  var RecycleBinFolderId: js.UndefOr[ResourceIdType] = js.native
  
  /**
    * The ID of the root folder.
    */
  var RootFolderId: js.UndefOr[ResourceIdType] = js.native
  
  /**
    * The status of the user.
    */
  var Status: js.UndefOr[UserStatusType] = js.native
  
  /**
    * The storage for the user.
    */
  var Storage: js.UndefOr[UserStorageMetadata] = js.native
  
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  
  /**
    * The time zone ID of the user.
    */
  var TimeZoneId: js.UndefOr[TimeZoneIdType] = js.native
  
  /**
    * The type of user.
    */
  var Type: js.UndefOr[UserType] = js.native
  
  /**
    * The login name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.native
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampType): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddressType): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    @scala.inline
    def setGivenName(value: UserAttributeValueType): Self = StObject.set(x, "GivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "GivenName", js.undefined)
    
    @scala.inline
    def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLocale(value: LocaleType): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    @scala.inline
    def setModifiedTimestamp(value: TimestampType): Self = StObject.set(x, "ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimestampUndefined: Self = StObject.set(x, "ModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    @scala.inline
    def setRecycleBinFolderId(value: ResourceIdType): Self = StObject.set(x, "RecycleBinFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecycleBinFolderIdUndefined: Self = StObject.set(x, "RecycleBinFolderId", js.undefined)
    
    @scala.inline
    def setRootFolderId(value: ResourceIdType): Self = StObject.set(x, "RootFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootFolderIdUndefined: Self = StObject.set(x, "RootFolderId", js.undefined)
    
    @scala.inline
    def setStatus(value: UserStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorage(value: UserStorageMetadata): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "Storage", js.undefined)
    
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
    def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
