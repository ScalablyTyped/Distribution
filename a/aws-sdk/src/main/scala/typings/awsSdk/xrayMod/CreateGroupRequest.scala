package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupRequest extends js.Object {
  /**
    * The filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[typings.awsSdk.xrayMod.FilterExpression] = js.native
  /**
    * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
    */
  var GroupName: typings.awsSdk.xrayMod.GroupName = js.native
}

object CreateGroupRequest {
  @scala.inline
  def apply(GroupName: GroupName): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  @scala.inline
  implicit class CreateGroupRequestOps[Self <: CreateGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterExpression(value: FilterExpression): Self = this.set("FilterExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterExpression: Self = this.set("FilterExpression", js.undefined)
  }
  
}

