package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupResponse extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: js.UndefOr[WorkMailIdentifier] = js.native
}

object CreateGroupResponse {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier = null): CreateGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupResponse]
  }
}

