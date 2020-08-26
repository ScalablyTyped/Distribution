package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupResult extends js.Object {
  /**
    * The group that was updated. Contains the name of the group that was updated, the ARN of the group that was updated, and the updated filter expression assigned to the group.
    */
  var Group: js.UndefOr[typings.awsSdk.xrayMod.Group] = js.native
}

object UpdateGroupResult {
  @scala.inline
  def apply(): UpdateGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupResult]
  }
  @scala.inline
  implicit class UpdateGroupResultOps[Self <: UpdateGroupResult] (val x: Self) extends AnyVal {
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
    def setGroup(value: Group): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
  }
  
}

