package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequest extends js.Object {
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
  def apply(
    UserId: IdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    GivenName: UserAttributeValueType = null,
    GrantPoweruserPrivileges: BooleanEnumType = null,
    Locale: LocaleType = null,
    StorageRule: StorageRuleType = null,
    Surname: UserAttributeValueType = null,
    TimeZoneId: TimeZoneIdType = null,
    Type: UserType = null
  ): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (GivenName != null) __obj.updateDynamic("GivenName")(GivenName.asInstanceOf[js.Any])
    if (GrantPoweruserPrivileges != null) __obj.updateDynamic("GrantPoweruserPrivileges")(GrantPoweruserPrivileges.asInstanceOf[js.Any])
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (StorageRule != null) __obj.updateDynamic("StorageRule")(StorageRule.asInstanceOf[js.Any])
    if (Surname != null) __obj.updateDynamic("Surname")(Surname.asInstanceOf[js.Any])
    if (TimeZoneId != null) __obj.updateDynamic("TimeZoneId")(TimeZoneId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
}

