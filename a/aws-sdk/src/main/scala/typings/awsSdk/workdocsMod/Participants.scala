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
  def apply(): Participants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Participants]
  }
  @scala.inline
  implicit class ParticipantsOps[Self <: Participants] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: GroupMetadata*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: GroupMetadataList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setUsersVarargs(value: UserMetadata*): Self = this.set("Users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: UserMetadataList): Self = this.set("Users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
  
}

