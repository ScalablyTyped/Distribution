package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIpGroupRequest extends js.Object {
  /**
    * The identifier of the IP access control group.
    */
  var GroupId: IpGroupId = js.native
}

object DeleteIpGroupRequest {
  @scala.inline
  def apply(GroupId: IpGroupId): DeleteIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIpGroupRequest]
  }
}

