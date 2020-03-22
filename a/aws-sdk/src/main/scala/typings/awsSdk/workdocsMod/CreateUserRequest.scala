package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    Username: UsernameType,
    AuthenticationToken: AuthenticationHeaderType = null,
    EmailAddress: EmailAddressType = null,
    OrganizationId: IdType = null,
    StorageRule: StorageRuleType = null,
    TimeZoneId: TimeZoneIdType = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(GivenName = GivenName.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Surname = Surname.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (EmailAddress != null) __obj.updateDynamic("EmailAddress")(EmailAddress.asInstanceOf[js.Any])
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId.asInstanceOf[js.Any])
    if (StorageRule != null) __obj.updateDynamic("StorageRule")(StorageRule.asInstanceOf[js.Any])
    if (TimeZoneId != null) __obj.updateDynamic("TimeZoneId")(TimeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
}

