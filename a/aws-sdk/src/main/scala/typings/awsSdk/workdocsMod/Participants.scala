package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Participants extends js.Object {
  /**
    * The list of user groups.
    */
  var Groups: js.UndefOr[GroupMetadataList] = js.native
  /**
    * The list of users.
    */
  var Users: js.UndefOr[UserMetadataList] = js.native
}

object Participants {
  @scala.inline
  def apply(Groups: GroupMetadataList = null, Users: UserMetadataList = null): Participants = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participants]
  }
}

