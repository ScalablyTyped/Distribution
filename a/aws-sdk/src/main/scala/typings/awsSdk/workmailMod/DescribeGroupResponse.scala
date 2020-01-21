package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGroupResponse extends js.Object {
  /**
    * The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The email of the described group.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  /**
    * The date and time when a user was registered to WorkMail, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier of the described group.
    */
  var GroupId: js.UndefOr[WorkMailIdentifier] = js.native
  /**
    * The name of the described group.
    */
  var Name: js.UndefOr[GroupName] = js.native
  /**
    * The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to WorkMail).
    */
  var State: js.UndefOr[EntityState] = js.native
}

object DescribeGroupResponse {
  @scala.inline
  def apply(
    DisabledDate: Timestamp = null,
    Email: EmailAddress = null,
    EnabledDate: Timestamp = null,
    GroupId: WorkMailIdentifier = null,
    Name: GroupName = null,
    State: EntityState = null
  ): DescribeGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DisabledDate != null) __obj.updateDynamic("DisabledDate")(DisabledDate.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (EnabledDate != null) __obj.updateDynamic("EnabledDate")(EnabledDate.asInstanceOf[js.Any])
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupResponse]
  }
}

