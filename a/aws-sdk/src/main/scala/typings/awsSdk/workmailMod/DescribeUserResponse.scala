package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserResponse extends js.Object {
  /**
    * The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  /**
    * The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name for the user.
    */
  var Name: js.UndefOr[UserName] = js.native
  /**
    * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to WorkMail).
    */
  var State: js.UndefOr[EntityState] = js.native
  /**
    * The identifier for the described user.
    */
  var UserId: js.UndefOr[WorkMailIdentifier] = js.native
  /**
    * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported into Amazon WorkMail as users. Because different WorkMail organizations rely on different directory types, administrators can distinguish between an unregistered user (account is disabled and has a user role) and the directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
    */
  var UserRole: js.UndefOr[typings.awsSdk.workmailMod.UserRole] = js.native
}

object DescribeUserResponse {
  @scala.inline
  def apply(
    DisabledDate: Timestamp = null,
    DisplayName: String = null,
    Email: EmailAddress = null,
    EnabledDate: Timestamp = null,
    Name: UserName = null,
    State: EntityState = null,
    UserId: WorkMailIdentifier = null,
    UserRole: UserRole = null
  ): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    if (UserRole != null) __obj.updateDynamic("UserRole")(UserRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserResponse]
  }
}

