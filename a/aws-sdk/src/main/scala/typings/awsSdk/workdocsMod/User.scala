package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    CreatedTimestamp: TimestampType = null,
    EmailAddress: EmailAddressType = null,
    GivenName: UserAttributeValueType = null,
    Id: IdType = null,
    Locale: LocaleType = null,
    ModifiedTimestamp: TimestampType = null,
    OrganizationId: IdType = null,
    RecycleBinFolderId: ResourceIdType = null,
    RootFolderId: ResourceIdType = null,
    Status: UserStatusType = null,
    Storage: UserStorageMetadata = null,
    Surname: UserAttributeValueType = null,
    TimeZoneId: TimeZoneIdType = null,
    Type: UserType = null,
    Username: UsernameType = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (GivenName != null) __obj.updateDynamic("GivenName")(GivenName.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (ModifiedTimestamp != null) __obj.updateDynamic("ModifiedTimestamp")(ModifiedTimestamp.asInstanceOf[js.Any])
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId.asInstanceOf[js.Any])
    if (RecycleBinFolderId != null) __obj.updateDynamic("RecycleBinFolderId")(RecycleBinFolderId.asInstanceOf[js.Any])
    if (RootFolderId != null) __obj.updateDynamic("RootFolderId")(RootFolderId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Storage != null) __obj.updateDynamic("Storage")(Storage.asInstanceOf[js.Any])
    if (Surname != null) __obj.updateDynamic("Surname")(Surname.asInstanceOf[js.Any])
    if (TimeZoneId != null) __obj.updateDynamic("TimeZoneId")(TimeZoneId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

