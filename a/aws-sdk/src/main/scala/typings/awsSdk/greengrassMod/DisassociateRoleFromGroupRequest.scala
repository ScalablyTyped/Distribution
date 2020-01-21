package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateRoleFromGroupRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object DisassociateRoleFromGroupRequest {
  @scala.inline
  def apply(GroupId: string): DisassociateRoleFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateRoleFromGroupRequest]
  }
}

