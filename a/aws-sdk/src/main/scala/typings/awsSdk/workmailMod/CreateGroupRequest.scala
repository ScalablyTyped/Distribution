package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupRequest extends js.Object {
  /**
    * The name of the group.
    */
  var Name: GroupName = js.native
  /**
    * The organization under which the group is to be created.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object CreateGroupRequest {
  @scala.inline
  def apply(Name: GroupName, OrganizationId: OrganizationId): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
}

