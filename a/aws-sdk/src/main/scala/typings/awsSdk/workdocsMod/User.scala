package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
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
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setCreatedTimestamp(value: TimestampType): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddressType): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("EmailAddress", js.undefined)
    
    @scala.inline
    def setGivenName(value: UserAttributeValueType): Self = this.set("GivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("GivenName", js.undefined)
    
    @scala.inline
    def setId(value: IdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLocale(value: LocaleType): Self = this.set("Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("Locale", js.undefined)
    
    @scala.inline
    def setModifiedTimestamp(value: TimestampType): Self = this.set("ModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTimestamp: Self = this.set("ModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationId: Self = this.set("OrganizationId", js.undefined)
    
    @scala.inline
    def setRecycleBinFolderId(value: ResourceIdType): Self = this.set("RecycleBinFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecycleBinFolderId: Self = this.set("RecycleBinFolderId", js.undefined)
    
    @scala.inline
    def setRootFolderId(value: ResourceIdType): Self = this.set("RootFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootFolderId: Self = this.set("RootFolderId", js.undefined)
    
    @scala.inline
    def setStatus(value: UserStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStorage(value: UserStorageMetadata): Self = this.set("Storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("Storage", js.undefined)
    
    @scala.inline
    def setSurname(value: UserAttributeValueType): Self = this.set("Surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("Surname", js.undefined)
    
    @scala.inline
    def setTimeZoneId(value: TimeZoneIdType): Self = this.set("TimeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneId: Self = this.set("TimeZoneId", js.undefined)
    
    @scala.inline
    def setType(value: UserType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
