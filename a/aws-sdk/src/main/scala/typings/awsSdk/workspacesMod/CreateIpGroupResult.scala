package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIpGroupResult extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: js.UndefOr[IpGroupId] = js.native
}

object CreateIpGroupResult {
  @scala.inline
  def apply(GroupId: IpGroupId = null): CreateIpGroupResult = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIpGroupResult]
  }
}

