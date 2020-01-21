package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlockServiceLinkedRoleRequest extends js.Object {
  var RoleArn: stringMin1Max1600 = js.native
}

object UnlockServiceLinkedRoleRequest {
  @scala.inline
  def apply(RoleArn: stringMin1Max1600): UnlockServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnlockServiceLinkedRoleRequest]
  }
}

