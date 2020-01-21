package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The date indicating when the user was disabled from Amazon WorkMail use.
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
    * The date indicating when the user was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier of the user.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.native
  /**
    * The name of the user.
    */
  var Name: js.UndefOr[UserName] = js.native
  /**
    * The state of the user, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.native
  /**
    * The role of the user.
    */
  var UserRole: js.UndefOr[typings.awsSdk.workmailMod.UserRole] = js.native
}

object User {
  @scala.inline
  def apply(
    DisabledDate: Timestamp = null,
    DisplayName: String = null,
    Email: EmailAddress = null,
    EnabledDate: Timestamp = null,
    Id: WorkMailIdentifier = null,
    Name: UserName = null,
    State: EntityState = null,
    UserRole: UserRole = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (UserRole != null) __obj.updateDynamic("UserRole")(UserRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

