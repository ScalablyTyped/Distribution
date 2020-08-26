package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyGroup extends js.Object {
  /**
    * The stable and unique string identifying the group. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var GroupId: js.UndefOr[idType] = js.native
  /**
    * The name (friendly name, not ARN) identifying the group.
    */
  var GroupName: js.UndefOr[groupNameType] = js.native
}

object PolicyGroup {
  @scala.inline
  def apply(): PolicyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyGroup]
  }
  @scala.inline
  implicit class PolicyGroupOps[Self <: PolicyGroup] (val x: Self) extends AnyVal {
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
    def setGroupId(value: idType): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    @scala.inline
    def setGroupName(value: groupNameType): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
  
}

