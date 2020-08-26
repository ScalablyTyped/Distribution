package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupResponse extends js.Object {
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.native
}

object CreateGroupResponse {
  @scala.inline
  def apply(): CreateGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupResponse]
  }
  @scala.inline
  implicit class CreateGroupResponseOps[Self <: CreateGroupResponse] (val x: Self) extends AnyVal {
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
    def setGroup(value: GroupType): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
  }
  
}

