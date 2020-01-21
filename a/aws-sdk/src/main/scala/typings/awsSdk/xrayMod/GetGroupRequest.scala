package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupRequest extends js.Object {
  /**
    * The ARN of the group that was generated on creation.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.native
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.native
}

object GetGroupRequest {
  @scala.inline
  def apply(GroupARN: GroupARN = null, GroupName: GroupName = null): GetGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupRequest]
  }
}

